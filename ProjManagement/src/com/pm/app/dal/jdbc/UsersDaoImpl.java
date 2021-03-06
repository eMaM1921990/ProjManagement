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

public class UsersDaoImpl extends AbstractDAO implements UsersDao
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
	protected final String SQL_SELECT = "SELECT idusers, username, password, group_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( idusers, username, password, group_id ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET idusers = ?, username = ?, password = ?, group_id = ? WHERE idusers = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE idusers = ?";

	/** 
	 * Index of column idusers
	 */
	protected static final int COLUMN_IDUSERS = 1;

	/** 
	 * Index of column username
	 */
	protected static final int COLUMN_USERNAME = 2;

	/** 
	 * Index of column password
	 */
	protected static final int COLUMN_PASSWORD = 3;

	/** 
	 * Index of column group_id
	 */
	protected static final int COLUMN_GROUP_ID = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Index of primary-key column idusers
	 */
	protected static final int PK_COLUMN_IDUSERS = 1;

	/** 
	 * Inserts a new row in the users table.
	 */
	public UsersPk insert(Users dto) throws UsersDaoException
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
			stmt.setInt( index++, dto.getIdusers() );
			stmt.setString( index++, dto.getUsername() );
			stmt.setString( index++, dto.getPassword() );
			if (dto.isGroupIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getGroupId() );
			}
		
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdusers( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UsersDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the users table.
	 */
	public void update(UsersPk pk, Users dto) throws UsersDaoException
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
			stmt.setInt( index++, dto.getIdusers() );
			stmt.setString( index++, dto.getUsername() );
			stmt.setString( index++, dto.getPassword() );
			if (dto.isGroupIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getGroupId() );
			}
		
			stmt.setInt( 5, pk.getIdusers() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UsersDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the users table.
	 */
	public void delete(UsersPk pk) throws UsersDaoException
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
			stmt.setInt( 1, pk.getIdusers() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UsersDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the users table that matches the specified primary-key value.
	 */
	public Users findByPrimaryKey(UsersPk pk) throws UsersDaoException
	{
		return findByPrimaryKey( pk.getIdusers() );
	}

	/** 
	 * Returns all rows from the users table that match the criteria 'idusers = :idusers'.
	 */
	public Users findByPrimaryKey(int idusers) throws UsersDaoException
	{
		Users ret[] = findByDynamicSelect( SQL_SELECT + " WHERE idusers = ?", new Object[] {  new Integer(idusers) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the users table that match the criteria ''.
	 */
	public Users[] findAll() throws UsersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY idusers", null );
	}

	/** 
	 * Returns all rows from the users table that match the criteria 'group_id = :groupId'.
	 */
	public Users[] findByUserGroup(int groupId) throws UsersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE group_id = ?", new Object[] {  new Integer(groupId) } );
	}

	/** 
	 * Returns all rows from the users table that match the criteria 'idusers = :idusers'.
	 */
	public Users[] findWhereIdusersEquals(int idusers) throws UsersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE idusers = ? ORDER BY idusers", new Object[] {  new Integer(idusers) } );
	}

	/** 
	 * Returns all rows from the users table that match the criteria 'username = :username'.
	 */
	public Users[] findWhereUsernameEquals(String username) throws UsersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE username = ? ORDER BY username", new Object[] { username } );
	}

	/** 
	 * Returns all rows from the users table that match the criteria 'password = :password'.
	 */
	public Users[] findWherePasswordEquals(String password) throws UsersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE password = ? ORDER BY password", new Object[] { password } );
	}

	/** 
	 * Returns all rows from the users table that match the criteria 'group_id = :groupId'.
	 */
	public Users[] findWhereGroupIdEquals(int groupId) throws UsersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE group_id = ? ORDER BY group_id", new Object[] {  new Integer(groupId) } );
	}

	/**
	 * Method 'UsersDaoImpl'
	 * 
	 */
	public UsersDaoImpl()
	{
	}

	/**
	 * Method 'UsersDaoImpl'
	 * 
	 * @param userConn
	 */
	public UsersDaoImpl(final java.sql.Connection userConn)
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
		return "constructions_web.users";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Users fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Users dto = new Users();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Users[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Users dto = new Users();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Users ret[] = new Users[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Users dto, ResultSet rs) throws SQLException
	{
		dto.setIdusers( rs.getInt( COLUMN_IDUSERS ) );
		dto.setUsername( rs.getString( COLUMN_USERNAME ) );
		dto.setPassword( rs.getString( COLUMN_PASSWORD ) );
		dto.setGroupId( rs.getInt( COLUMN_GROUP_ID ) );
		if (rs.wasNull()) {
			dto.setGroupIdNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Users dto)
	{
	}

	/** 
	 * Returns all rows from the users table that match the specified arbitrary SQL statement
	 */
	public Users[] findByDynamicSelect(String sql, Object[] sqlParams) throws UsersDaoException
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
			throw new UsersDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the users table that match the specified arbitrary SQL statement
	 */
	public Users[] findByDynamicWhere(String sql, Object[] sqlParams) throws UsersDaoException
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
			throw new UsersDaoException( "Exception: " + _e.getMessage(), _e );
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
