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

public class UserGroupDaoImpl extends AbstractDAO implements UserGroupDao
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
	protected final String SQL_SELECT = "SELECT iduser_group, name, branch_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( iduser_group, name, branch_id ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET iduser_group = ?, name = ?, branch_id = ? WHERE iduser_group = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE iduser_group = ?";

	/** 
	 * Index of column iduser_group
	 */
	protected static final int COLUMN_IDUSER_GROUP = 1;

	/** 
	 * Index of column name
	 */
	protected static final int COLUMN_NAME = 2;

	/** 
	 * Index of column branch_id
	 */
	protected static final int COLUMN_BRANCH_ID = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column iduser_group
	 */
	protected static final int PK_COLUMN_IDUSER_GROUP = 1;

	/** 
	 * Inserts a new row in the user_group table.
	 */
	public UserGroupPk insert(UserGroup dto) throws UserGroupDaoException
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
			stmt.setInt( index++, dto.getIduserGroup() );
			stmt.setString( index++, dto.getName() );
			if (dto.isBranchIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getBranchId() );
			}
		
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIduserGroup( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UserGroupDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the user_group table.
	 */
	public void update(UserGroupPk pk, UserGroup dto) throws UserGroupDaoException
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
			stmt.setInt( index++, dto.getIduserGroup() );
			stmt.setString( index++, dto.getName() );
			if (dto.isBranchIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getBranchId() );
			}
		
			stmt.setInt( 4, pk.getIduserGroup() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UserGroupDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the user_group table.
	 */
	public void delete(UserGroupPk pk) throws UserGroupDaoException
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
			stmt.setInt( 1, pk.getIduserGroup() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UserGroupDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the user_group table that matches the specified primary-key value.
	 */
	public UserGroup findByPrimaryKey(UserGroupPk pk) throws UserGroupDaoException
	{
		return findByPrimaryKey( pk.getIduserGroup() );
	}

	/** 
	 * Returns all rows from the user_group table that match the criteria 'iduser_group = :iduserGroup'.
	 */
	public UserGroup findByPrimaryKey(int iduserGroup) throws UserGroupDaoException
	{
		UserGroup ret[] = findByDynamicSelect( SQL_SELECT + " WHERE iduser_group = ?", new Object[] {  new Integer(iduserGroup) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the user_group table that match the criteria ''.
	 */
	public UserGroup[] findAll() throws UserGroupDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY iduser_group", null );
	}

	/** 
	 * Returns all rows from the user_group table that match the criteria 'branch_id = :branchId'.
	 */
	public UserGroup[] findByBranches(int branchId) throws UserGroupDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE branch_id = ?", new Object[] {  new Integer(branchId) } );
	}

	/** 
	 * Returns all rows from the user_group table that match the criteria 'iduser_group = :iduserGroup'.
	 */
	public UserGroup[] findWhereIduserGroupEquals(int iduserGroup) throws UserGroupDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE iduser_group = ? ORDER BY iduser_group", new Object[] {  new Integer(iduserGroup) } );
	}

	/** 
	 * Returns all rows from the user_group table that match the criteria 'name = :name'.
	 */
	public UserGroup[] findWhereNameEquals(String name) throws UserGroupDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE name = ? ORDER BY name", new Object[] { name } );
	}

	/** 
	 * Returns all rows from the user_group table that match the criteria 'branch_id = :branchId'.
	 */
	public UserGroup[] findWhereBranchIdEquals(int branchId) throws UserGroupDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE branch_id = ? ORDER BY branch_id", new Object[] {  new Integer(branchId) } );
	}

	/**
	 * Method 'UserGroupDaoImpl'
	 * 
	 */
	public UserGroupDaoImpl()
	{
	}

	/**
	 * Method 'UserGroupDaoImpl'
	 * 
	 * @param userConn
	 */
	public UserGroupDaoImpl(final java.sql.Connection userConn)
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
		return "constructions_web.user_group";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected UserGroup fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			UserGroup dto = new UserGroup();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected UserGroup[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			UserGroup dto = new UserGroup();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		UserGroup ret[] = new UserGroup[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(UserGroup dto, ResultSet rs) throws SQLException
	{
		dto.setIduserGroup( rs.getInt( COLUMN_IDUSER_GROUP ) );
		dto.setName( rs.getString( COLUMN_NAME ) );
		dto.setBranchId( rs.getInt( COLUMN_BRANCH_ID ) );
		if (rs.wasNull()) {
			dto.setBranchIdNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(UserGroup dto)
	{
	}

	/** 
	 * Returns all rows from the user_group table that match the specified arbitrary SQL statement
	 */
	public UserGroup[] findByDynamicSelect(String sql, Object[] sqlParams) throws UserGroupDaoException
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
			throw new UserGroupDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the user_group table that match the specified arbitrary SQL statement
	 */
	public UserGroup[] findByDynamicWhere(String sql, Object[] sqlParams) throws UserGroupDaoException
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
			throw new UserGroupDaoException( "Exception: " + _e.getMessage(), _e );
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
