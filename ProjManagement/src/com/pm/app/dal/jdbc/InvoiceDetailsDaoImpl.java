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

public class InvoiceDetailsDaoImpl extends AbstractDAO implements InvoiceDetailsDao
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
	protected final String SQL_SELECT = "SELECT idinvoice_details, invoice_id, item_id, unit_id, price FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( idinvoice_details, invoice_id, item_id, unit_id, price ) VALUES ( ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET idinvoice_details = ?, invoice_id = ?, item_id = ?, unit_id = ?, price = ? WHERE idinvoice_details = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE idinvoice_details = ?";

	/** 
	 * Index of column idinvoice_details
	 */
	protected static final int COLUMN_IDINVOICE_DETAILS = 1;

	/** 
	 * Index of column invoice_id
	 */
	protected static final int COLUMN_INVOICE_ID = 2;

	/** 
	 * Index of column item_id
	 */
	protected static final int COLUMN_ITEM_ID = 3;

	/** 
	 * Index of column unit_id
	 */
	protected static final int COLUMN_UNIT_ID = 4;

	/** 
	 * Index of column price
	 */
	protected static final int COLUMN_PRICE = 5;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 5;

	/** 
	 * Index of primary-key column idinvoice_details
	 */
	protected static final int PK_COLUMN_IDINVOICE_DETAILS = 1;

	/** 
	 * Inserts a new row in the invoice_details table.
	 */
	public InvoiceDetailsPk insert(InvoiceDetails dto) throws InvoiceDetailsDaoException
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
			stmt.setInt( index++, dto.getIdinvoiceDetails() );
			if (dto.isInvoiceIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getInvoiceId() );
			}
		
			if (dto.isItemIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getItemId() );
			}
		
			if (dto.isUnitIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getUnitId() );
			}
		
			if (dto.isPriceNull()) {
				stmt.setNull( index++, java.sql.Types.DOUBLE );
			} else {
				stmt.setDouble( index++, dto.getPrice() );
			}
		
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdinvoiceDetails( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new InvoiceDetailsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the invoice_details table.
	 */
	public void update(InvoiceDetailsPk pk, InvoiceDetails dto) throws InvoiceDetailsDaoException
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
			stmt.setInt( index++, dto.getIdinvoiceDetails() );
			if (dto.isInvoiceIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getInvoiceId() );
			}
		
			if (dto.isItemIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getItemId() );
			}
		
			if (dto.isUnitIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getUnitId() );
			}
		
			if (dto.isPriceNull()) {
				stmt.setNull( index++, java.sql.Types.DOUBLE );
			} else {
				stmt.setDouble( index++, dto.getPrice() );
			}
		
			stmt.setInt( 6, pk.getIdinvoiceDetails() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new InvoiceDetailsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the invoice_details table.
	 */
	public void delete(InvoiceDetailsPk pk) throws InvoiceDetailsDaoException
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
			stmt.setInt( 1, pk.getIdinvoiceDetails() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new InvoiceDetailsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the invoice_details table that matches the specified primary-key value.
	 */
	public InvoiceDetails findByPrimaryKey(InvoiceDetailsPk pk) throws InvoiceDetailsDaoException
	{
		return findByPrimaryKey( pk.getIdinvoiceDetails() );
	}

	/** 
	 * Returns all rows from the invoice_details table that match the criteria 'idinvoice_details = :idinvoiceDetails'.
	 */
	public InvoiceDetails findByPrimaryKey(int idinvoiceDetails) throws InvoiceDetailsDaoException
	{
		InvoiceDetails ret[] = findByDynamicSelect( SQL_SELECT + " WHERE idinvoice_details = ?", new Object[] {  new Integer(idinvoiceDetails) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the invoice_details table that match the criteria ''.
	 */
	public InvoiceDetails[] findAll() throws InvoiceDetailsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY idinvoice_details", null );
	}

	/** 
	 * Returns all rows from the invoice_details table that match the criteria 'invoice_id = :invoiceId'.
	 */
	public InvoiceDetails[] findByInvoices(int invoiceId) throws InvoiceDetailsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE invoice_id = ?", new Object[] {  new Integer(invoiceId) } );
	}

	/** 
	 * Returns all rows from the invoice_details table that match the criteria 'item_id = :itemId'.
	 */
	public InvoiceDetails[] findByItems(int itemId) throws InvoiceDetailsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE item_id = ?", new Object[] {  new Integer(itemId) } );
	}

	/** 
	 * Returns all rows from the invoice_details table that match the criteria 'unit_id = :unitId'.
	 */
	public InvoiceDetails[] findByUnits(int unitId) throws InvoiceDetailsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE unit_id = ?", new Object[] {  new Integer(unitId) } );
	}

	/** 
	 * Returns all rows from the invoice_details table that match the criteria 'idinvoice_details = :idinvoiceDetails'.
	 */
	public InvoiceDetails[] findWhereIdinvoiceDetailsEquals(int idinvoiceDetails) throws InvoiceDetailsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE idinvoice_details = ? ORDER BY idinvoice_details", new Object[] {  new Integer(idinvoiceDetails) } );
	}

	/** 
	 * Returns all rows from the invoice_details table that match the criteria 'invoice_id = :invoiceId'.
	 */
	public InvoiceDetails[] findWhereInvoiceIdEquals(int invoiceId) throws InvoiceDetailsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE invoice_id = ? ORDER BY invoice_id", new Object[] {  new Integer(invoiceId) } );
	}

	/** 
	 * Returns all rows from the invoice_details table that match the criteria 'item_id = :itemId'.
	 */
	public InvoiceDetails[] findWhereItemIdEquals(int itemId) throws InvoiceDetailsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE item_id = ? ORDER BY item_id", new Object[] {  new Integer(itemId) } );
	}

	/** 
	 * Returns all rows from the invoice_details table that match the criteria 'unit_id = :unitId'.
	 */
	public InvoiceDetails[] findWhereUnitIdEquals(int unitId) throws InvoiceDetailsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE unit_id = ? ORDER BY unit_id", new Object[] {  new Integer(unitId) } );
	}

	/** 
	 * Returns all rows from the invoice_details table that match the criteria 'price = :price'.
	 */
	public InvoiceDetails[] findWherePriceEquals(double price) throws InvoiceDetailsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE price = ? ORDER BY price", new Object[] {  new Double(price) } );
	}

	/**
	 * Method 'InvoiceDetailsDaoImpl'
	 * 
	 */
	public InvoiceDetailsDaoImpl()
	{
	}

	/**
	 * Method 'InvoiceDetailsDaoImpl'
	 * 
	 * @param userConn
	 */
	public InvoiceDetailsDaoImpl(final java.sql.Connection userConn)
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
		return "constructions_web.invoice_details";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected InvoiceDetails fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			InvoiceDetails dto = new InvoiceDetails();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected InvoiceDetails[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			InvoiceDetails dto = new InvoiceDetails();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		InvoiceDetails ret[] = new InvoiceDetails[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(InvoiceDetails dto, ResultSet rs) throws SQLException
	{
		dto.setIdinvoiceDetails( rs.getInt( COLUMN_IDINVOICE_DETAILS ) );
		dto.setInvoiceId( rs.getInt( COLUMN_INVOICE_ID ) );
		if (rs.wasNull()) {
			dto.setInvoiceIdNull( true );
		}
		
		dto.setItemId( rs.getInt( COLUMN_ITEM_ID ) );
		if (rs.wasNull()) {
			dto.setItemIdNull( true );
		}
		
		dto.setUnitId( rs.getInt( COLUMN_UNIT_ID ) );
		if (rs.wasNull()) {
			dto.setUnitIdNull( true );
		}
		
		dto.setPrice( rs.getDouble( COLUMN_PRICE ) );
		if (rs.wasNull()) {
			dto.setPriceNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(InvoiceDetails dto)
	{
	}

	/** 
	 * Returns all rows from the invoice_details table that match the specified arbitrary SQL statement
	 */
	public InvoiceDetails[] findByDynamicSelect(String sql, Object[] sqlParams) throws InvoiceDetailsDaoException
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
			throw new InvoiceDetailsDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the invoice_details table that match the specified arbitrary SQL statement
	 */
	public InvoiceDetails[] findByDynamicWhere(String sql, Object[] sqlParams) throws InvoiceDetailsDaoException
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
			throw new InvoiceDetailsDaoException( "Exception: " + _e.getMessage(), _e );
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
