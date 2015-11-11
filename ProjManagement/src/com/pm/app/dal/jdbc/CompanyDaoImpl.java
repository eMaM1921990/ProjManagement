/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.pm.app.dal.jdbc;

import com.pm.app.dal.dao.*;
import com.pm.app.dal.factory.*;
import java.util.Date;
import com.pm.app.dal.dto.*;
import com.pm.app.dal.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class CompanyDaoImpl extends AbstractDAO implements CompanyDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT idcompany, name, join_date FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( idcompany, name, join_date ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET idcompany = ?, name = ?, join_date = ? WHERE idcompany = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE idcompany = ?";

	/** 
	 * Index of column idcompany
	 */
	protected static final int COLUMN_IDCOMPANY = 1;

	/** 
	 * Index of column name
	 */
	protected static final int COLUMN_NAME = 2;

	/** 
	 * Index of column join_date
	 */
	protected static final int COLUMN_JOIN_DATE = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column idcompany
	 */
	protected static final int PK_COLUMN_IDCOMPANY = 1;

	/** 
	 * Inserts a new row in the company table.
	 */
	public CompanyPk insert(Company dto) throws CompanyDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			stmt = conn.prepareStatement( SQL_INSERT, Statement.RETURN_GENERATED_KEYS );
			int index = 1;
			stmt.setInt( index++, dto.getIdcompany() );
			stmt.setString( index++, dto.getName() );
			stmt.setDate(index++, dto.getJoinDate()==null ? null : new java.sql.Date( dto.getJoinDate().getTime() ) );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdcompany( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CompanyDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the company table.
	 */
	public void update(CompanyPk pk, Company dto) throws CompanyDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_UPDATE + " with DTO: " + dto );
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setInt( index++, dto.getIdcompany() );
			stmt.setString( index++, dto.getName() );
			stmt.setDate(index++, dto.getJoinDate()==null ? null : new java.sql.Date( dto.getJoinDate().getTime() ) );
			stmt.setInt( 4, pk.getIdcompany() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CompanyDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the company table.
	 */
	public void delete(CompanyPk pk) throws CompanyDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getIdcompany() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CompanyDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the company table that matches the specified primary-key value.
	 */
	public Company findByPrimaryKey(CompanyPk pk) throws CompanyDaoException
	{
		return findByPrimaryKey( pk.getIdcompany() );
	}

	/** 
	 * Returns all rows from the company table that match the criteria 'idcompany = :idcompany'.
	 */
	public Company findByPrimaryKey(int idcompany) throws CompanyDaoException
	{
		Company ret[] = findByDynamicSelect( SQL_SELECT + " WHERE idcompany = ?", new Object[] {  new Integer(idcompany) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the company table that match the criteria ''.
	 */
	public Company[] findAll() throws CompanyDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY idcompany", null );
	}

	/** 
	 * Returns all rows from the company table that match the criteria 'idcompany = :idcompany'.
	 */
	public Company[] findWhereIdcompanyEquals(int idcompany) throws CompanyDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE idcompany = ? ORDER BY idcompany", new Object[] {  new Integer(idcompany) } );
	}

	/** 
	 * Returns all rows from the company table that match the criteria 'name = :name'.
	 */
	public Company[] findWhereNameEquals(String name) throws CompanyDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE name = ? ORDER BY name", new Object[] { name } );
	}

	/** 
	 * Returns all rows from the company table that match the criteria 'join_date = :joinDate'.
	 */
	public Company[] findWhereJoinDateEquals(Date joinDate) throws CompanyDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE join_date = ? ORDER BY join_date", new Object[] { joinDate==null ? null : new java.sql.Date( joinDate.getTime() ) } );
	}

	/**
	 * Method 'CompanyDaoImpl'
	 * 
	 */
	public CompanyDaoImpl()
	{
	}

	/**
	 * Method 'CompanyDaoImpl'
	 * 
	 * @param userConn
	 */
	public CompanyDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "constructions_web.company";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Company fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Company dto = new Company();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Company[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Company dto = new Company();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Company ret[] = new Company[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Company dto, ResultSet rs) throws SQLException
	{
		dto.setIdcompany( rs.getInt( COLUMN_IDCOMPANY ) );
		dto.setName( rs.getString( COLUMN_NAME ) );
		dto.setJoinDate( rs.getDate(COLUMN_JOIN_DATE ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Company dto)
	{
	}

	/** 
	 * Returns all rows from the company table that match the specified arbitrary SQL statement
	 */
	public Company[] findByDynamicSelect(String sql, Object[] sqlParams) throws CompanyDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CompanyDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the company table that match the specified arbitrary SQL statement
	 */
	public Company[] findByDynamicWhere(String sql, Object[] sqlParams) throws CompanyDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CompanyDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
