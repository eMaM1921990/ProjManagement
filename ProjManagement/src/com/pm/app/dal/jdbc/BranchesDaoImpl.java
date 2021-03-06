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

public class BranchesDaoImpl extends AbstractDAO implements BranchesDao
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
	protected final String SQL_SELECT = "SELECT idbranches, name, location, company_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( idbranches, name, location, company_id ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET idbranches = ?, name = ?, location = ?, company_id = ? WHERE idbranches = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE idbranches = ?";

	/** 
	 * Index of column idbranches
	 */
	protected static final int COLUMN_IDBRANCHES = 1;

	/** 
	 * Index of column name
	 */
	protected static final int COLUMN_NAME = 2;

	/** 
	 * Index of column location
	 */
	protected static final int COLUMN_LOCATION = 3;

	/** 
	 * Index of column company_id
	 */
	protected static final int COLUMN_COMPANY_ID = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Index of primary-key column idbranches
	 */
	protected static final int PK_COLUMN_IDBRANCHES = 1;

	/** 
	 * Inserts a new row in the branches table.
	 */
	public BranchesPk insert(Branches dto) throws BranchesDaoException
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
			stmt.setInt( index++, dto.getIdbranches() );
			stmt.setString( index++, dto.getName() );
			stmt.setString( index++, dto.getLocation() );
			if (dto.isCompanyIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getCompanyId() );
			}
		
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdbranches( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new BranchesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the branches table.
	 */
	public void update(BranchesPk pk, Branches dto) throws BranchesDaoException
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
			stmt.setInt( index++, dto.getIdbranches() );
			stmt.setString( index++, dto.getName() );
			stmt.setString( index++, dto.getLocation() );
			if (dto.isCompanyIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getCompanyId() );
			}
		
			stmt.setInt( 5, pk.getIdbranches() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new BranchesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the branches table.
	 */
	public void delete(BranchesPk pk) throws BranchesDaoException
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
			stmt.setInt( 1, pk.getIdbranches() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new BranchesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the branches table that matches the specified primary-key value.
	 */
	public Branches findByPrimaryKey(BranchesPk pk) throws BranchesDaoException
	{
		return findByPrimaryKey( pk.getIdbranches() );
	}

	/** 
	 * Returns all rows from the branches table that match the criteria 'idbranches = :idbranches'.
	 */
	public Branches findByPrimaryKey(int idbranches) throws BranchesDaoException
	{
		Branches ret[] = findByDynamicSelect( SQL_SELECT + " WHERE idbranches = ?", new Object[] {  new Integer(idbranches) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the branches table that match the criteria ''.
	 */
	public Branches[] findAll() throws BranchesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY idbranches", null );
	}

	/** 
	 * Returns all rows from the branches table that match the criteria 'company_id = :companyId'.
	 */
	public Branches[] findByCompany(int companyId) throws BranchesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE company_id = ?", new Object[] {  new Integer(companyId) } );
	}

	/** 
	 * Returns all rows from the branches table that match the criteria 'idbranches = :idbranches'.
	 */
	public Branches[] findWhereIdbranchesEquals(int idbranches) throws BranchesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE idbranches = ? ORDER BY idbranches", new Object[] {  new Integer(idbranches) } );
	}

	/** 
	 * Returns all rows from the branches table that match the criteria 'name = :name'.
	 */
	public Branches[] findWhereNameEquals(String name) throws BranchesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE name = ? ORDER BY name", new Object[] { name } );
	}

	/** 
	 * Returns all rows from the branches table that match the criteria 'location = :location'.
	 */
	public Branches[] findWhereLocationEquals(String location) throws BranchesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE location = ? ORDER BY location", new Object[] { location } );
	}

	/** 
	 * Returns all rows from the branches table that match the criteria 'company_id = :companyId'.
	 */
	public Branches[] findWhereCompanyIdEquals(int companyId) throws BranchesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE company_id = ? ORDER BY company_id", new Object[] {  new Integer(companyId) } );
	}

	/**
	 * Method 'BranchesDaoImpl'
	 * 
	 */
	public BranchesDaoImpl()
	{
	}

	/**
	 * Method 'BranchesDaoImpl'
	 * 
	 * @param userConn
	 */
	public BranchesDaoImpl(final java.sql.Connection userConn)
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
		return "constructions_web.branches";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Branches fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Branches dto = new Branches();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Branches[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Branches dto = new Branches();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Branches ret[] = new Branches[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Branches dto, ResultSet rs) throws SQLException
	{
		dto.setIdbranches( rs.getInt( COLUMN_IDBRANCHES ) );
		dto.setName( rs.getString( COLUMN_NAME ) );
		dto.setLocation( rs.getString( COLUMN_LOCATION ) );
		dto.setCompanyId( rs.getInt( COLUMN_COMPANY_ID ) );
		if (rs.wasNull()) {
			dto.setCompanyIdNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Branches dto)
	{
	}

	/** 
	 * Returns all rows from the branches table that match the specified arbitrary SQL statement
	 */
	public Branches[] findByDynamicSelect(String sql, Object[] sqlParams) throws BranchesDaoException
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
			throw new BranchesDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the branches table that match the specified arbitrary SQL statement
	 */
	public Branches[] findByDynamicWhere(String sql, Object[] sqlParams) throws BranchesDaoException
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
			throw new BranchesDaoException( "Exception: " + _e.getMessage(), _e );
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
