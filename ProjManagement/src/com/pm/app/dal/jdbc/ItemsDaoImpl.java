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

public class ItemsDaoImpl extends AbstractDAO implements ItemsDao
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
	protected final String SQL_SELECT = "SELECT iditems, name, quantity, unit_id, branch_id, category_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( iditems, name, quantity, unit_id, branch_id, category_id ) VALUES ( ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET iditems = ?, name = ?, quantity = ?, unit_id = ?, branch_id = ?, category_id = ? WHERE iditems = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE iditems = ?";

	/** 
	 * Index of column iditems
	 */
	protected static final int COLUMN_IDITEMS = 1;

	/** 
	 * Index of column name
	 */
	protected static final int COLUMN_NAME = 2;

	/** 
	 * Index of column quantity
	 */
	protected static final int COLUMN_QUANTITY = 3;

	/** 
	 * Index of column unit_id
	 */
	protected static final int COLUMN_UNIT_ID = 4;

	/** 
	 * Index of column branch_id
	 */
	protected static final int COLUMN_BRANCH_ID = 5;

	/** 
	 * Index of column category_id
	 */
	protected static final int COLUMN_CATEGORY_ID = 6;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 6;

	/** 
	 * Index of primary-key column iditems
	 */
	protected static final int PK_COLUMN_IDITEMS = 1;

	/** 
	 * Inserts a new row in the items table.
	 */
	public ItemsPk insert(Items dto) throws ItemsDaoException
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
			stmt.setInt( index++, dto.getIditems() );
			stmt.setString( index++, dto.getName() );
			if (dto.isQuantityNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getQuantity() );
			}
		
			if (dto.isUnitIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getUnitId() );
			}
		
			if (dto.isBranchIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getBranchId() );
			}
		
			if (dto.isCategoryIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getCategoryId() );
			}
		
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIditems( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ItemsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the items table.
	 */
	public void update(ItemsPk pk, Items dto) throws ItemsDaoException
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
			stmt.setInt( index++, dto.getIditems() );
			stmt.setString( index++, dto.getName() );
			if (dto.isQuantityNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getQuantity() );
			}
		
			if (dto.isUnitIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getUnitId() );
			}
		
			if (dto.isBranchIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getBranchId() );
			}
		
			if (dto.isCategoryIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getCategoryId() );
			}
		
			stmt.setInt( 7, pk.getIditems() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ItemsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the items table.
	 */
	public void delete(ItemsPk pk) throws ItemsDaoException
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
			stmt.setInt( 1, pk.getIditems() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ItemsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the items table that matches the specified primary-key value.
	 */
	public Items findByPrimaryKey(ItemsPk pk) throws ItemsDaoException
	{
		return findByPrimaryKey( pk.getIditems() );
	}

	/** 
	 * Returns all rows from the items table that match the criteria 'iditems = :iditems'.
	 */
	public Items findByPrimaryKey(int iditems) throws ItemsDaoException
	{
		Items ret[] = findByDynamicSelect( SQL_SELECT + " WHERE iditems = ?", new Object[] {  new Integer(iditems) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the items table that match the criteria ''.
	 */
	public Items[] findAll() throws ItemsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY iditems", null );
	}

	/** 
	 * Returns all rows from the items table that match the criteria 'branch_id = :branchId'.
	 */
	public Items[] findByBranches(int branchId) throws ItemsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE branch_id = ?", new Object[] {  new Integer(branchId) } );
	}

	/** 
	 * Returns all rows from the items table that match the criteria 'category_id = :categoryId'.
	 */
	public Items[] findByItemsCategory(int categoryId) throws ItemsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE category_id = ?", new Object[] {  new Integer(categoryId) } );
	}

	/** 
	 * Returns all rows from the items table that match the criteria 'unit_id = :unitId'.
	 */
	public Items[] findByUnits(int unitId) throws ItemsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE unit_id = ?", new Object[] {  new Integer(unitId) } );
	}

	/** 
	 * Returns all rows from the items table that match the criteria 'iditems = :iditems'.
	 */
	public Items[] findWhereIditemsEquals(int iditems) throws ItemsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE iditems = ? ORDER BY iditems", new Object[] {  new Integer(iditems) } );
	}

	/** 
	 * Returns all rows from the items table that match the criteria 'name = :name'.
	 */
	public Items[] findWhereNameEquals(String name) throws ItemsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE name = ? ORDER BY name", new Object[] { name } );
	}

	/** 
	 * Returns all rows from the items table that match the criteria 'quantity = :quantity'.
	 */
	public Items[] findWhereQuantityEquals(int quantity) throws ItemsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE quantity = ? ORDER BY quantity", new Object[] {  new Integer(quantity) } );
	}

	/** 
	 * Returns all rows from the items table that match the criteria 'unit_id = :unitId'.
	 */
	public Items[] findWhereUnitIdEquals(int unitId) throws ItemsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE unit_id = ? ORDER BY unit_id", new Object[] {  new Integer(unitId) } );
	}

	/** 
	 * Returns all rows from the items table that match the criteria 'branch_id = :branchId'.
	 */
	public Items[] findWhereBranchIdEquals(int branchId) throws ItemsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE branch_id = ? ORDER BY branch_id", new Object[] {  new Integer(branchId) } );
	}

	/** 
	 * Returns all rows from the items table that match the criteria 'category_id = :categoryId'.
	 */
	public Items[] findWhereCategoryIdEquals(int categoryId) throws ItemsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE category_id = ? ORDER BY category_id", new Object[] {  new Integer(categoryId) } );
	}

	/**
	 * Method 'ItemsDaoImpl'
	 * 
	 */
	public ItemsDaoImpl()
	{
	}

	/**
	 * Method 'ItemsDaoImpl'
	 * 
	 * @param userConn
	 */
	public ItemsDaoImpl(final java.sql.Connection userConn)
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
		return "constructions_web.items";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Items fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Items dto = new Items();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Items[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Items dto = new Items();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Items ret[] = new Items[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Items dto, ResultSet rs) throws SQLException
	{
		dto.setIditems( rs.getInt( COLUMN_IDITEMS ) );
		dto.setName( rs.getString( COLUMN_NAME ) );
		dto.setQuantity( rs.getInt( COLUMN_QUANTITY ) );
		if (rs.wasNull()) {
			dto.setQuantityNull( true );
		}
		
		dto.setUnitId( rs.getInt( COLUMN_UNIT_ID ) );
		if (rs.wasNull()) {
			dto.setUnitIdNull( true );
		}
		
		dto.setBranchId( rs.getInt( COLUMN_BRANCH_ID ) );
		if (rs.wasNull()) {
			dto.setBranchIdNull( true );
		}
		
		dto.setCategoryId( rs.getInt( COLUMN_CATEGORY_ID ) );
		if (rs.wasNull()) {
			dto.setCategoryIdNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Items dto)
	{
	}

	/** 
	 * Returns all rows from the items table that match the specified arbitrary SQL statement
	 */
	public Items[] findByDynamicSelect(String sql, Object[] sqlParams) throws ItemsDaoException
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
			throw new ItemsDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the items table that match the specified arbitrary SQL statement
	 */
	public Items[] findByDynamicWhere(String sql, Object[] sqlParams) throws ItemsDaoException
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
			throw new ItemsDaoException( "Exception: " + _e.getMessage(), _e );
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