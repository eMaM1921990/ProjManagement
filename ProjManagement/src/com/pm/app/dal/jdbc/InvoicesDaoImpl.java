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

public class InvoicesDaoImpl extends AbstractDAO implements InvoicesDao
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
	protected final String SQL_SELECT = "SELECT idinvoice, invoice_date, isTrx, valid_to, business_partnet_id, tax, sub_total, grand_total, project_id, branch_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( idinvoice, invoice_date, isTrx, valid_to, business_partnet_id, tax, sub_total, grand_total, project_id, branch_id ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET idinvoice = ?, invoice_date = ?, isTrx = ?, valid_to = ?, business_partnet_id = ?, tax = ?, sub_total = ?, grand_total = ?, project_id = ?, branch_id = ? WHERE idinvoice = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE idinvoice = ?";

	/** 
	 * Index of column idinvoice
	 */
	protected static final int COLUMN_IDINVOICE = 1;

	/** 
	 * Index of column invoice_date
	 */
	protected static final int COLUMN_INVOICE_DATE = 2;

	/** 
	 * Index of column isTrx
	 */
	protected static final int COLUMN_IS_TRX = 3;

	/** 
	 * Index of column valid_to
	 */
	protected static final int COLUMN_VALID_TO = 4;

	/** 
	 * Index of column business_partnet_id
	 */
	protected static final int COLUMN_BUSINESS_PARTNET_ID = 5;

	/** 
	 * Index of column tax
	 */
	protected static final int COLUMN_TAX = 6;

	/** 
	 * Index of column sub_total
	 */
	protected static final int COLUMN_SUB_TOTAL = 7;

	/** 
	 * Index of column grand_total
	 */
	protected static final int COLUMN_GRAND_TOTAL = 8;

	/** 
	 * Index of column project_id
	 */
	protected static final int COLUMN_PROJECT_ID = 9;

	/** 
	 * Index of column branch_id
	 */
	protected static final int COLUMN_BRANCH_ID = 10;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 10;

	/** 
	 * Index of primary-key column idinvoice
	 */
	protected static final int PK_COLUMN_IDINVOICE = 1;

	/** 
	 * Inserts a new row in the invoices table.
	 */
	public InvoicesPk insert(Invoices dto) throws InvoicesDaoException
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
			stmt.setInt( index++, dto.getIdinvoice() );
			stmt.setDate(index++, dto.getInvoiceDate()==null ? null : new java.sql.Date( dto.getInvoiceDate().getTime() ) );
			if (dto.isIsTrxNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIsTrx() );
			}
		
			stmt.setDate(index++, dto.getValidTo()==null ? null : new java.sql.Date( dto.getValidTo().getTime() ) );
			if (dto.isBusinessPartnetIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getBusinessPartnetId() );
			}
		
			if (dto.isTaxNull()) {
				stmt.setNull( index++, java.sql.Types.DOUBLE );
			} else {
				stmt.setDouble( index++, dto.getTax() );
			}
		
			if (dto.isSubTotalNull()) {
				stmt.setNull( index++, java.sql.Types.DOUBLE );
			} else {
				stmt.setDouble( index++, dto.getSubTotal() );
			}
		
			if (dto.isGrandTotalNull()) {
				stmt.setNull( index++, java.sql.Types.DOUBLE );
			} else {
				stmt.setDouble( index++, dto.getGrandTotal() );
			}
		
			if (dto.isProjectIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getProjectId() );
			}
		
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
				dto.setIdinvoice( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new InvoicesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the invoices table.
	 */
	public void update(InvoicesPk pk, Invoices dto) throws InvoicesDaoException
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
			stmt.setInt( index++, dto.getIdinvoice() );
			stmt.setDate(index++, dto.getInvoiceDate()==null ? null : new java.sql.Date( dto.getInvoiceDate().getTime() ) );
			if (dto.isIsTrxNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIsTrx() );
			}
		
			stmt.setDate(index++, dto.getValidTo()==null ? null : new java.sql.Date( dto.getValidTo().getTime() ) );
			if (dto.isBusinessPartnetIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getBusinessPartnetId() );
			}
		
			if (dto.isTaxNull()) {
				stmt.setNull( index++, java.sql.Types.DOUBLE );
			} else {
				stmt.setDouble( index++, dto.getTax() );
			}
		
			if (dto.isSubTotalNull()) {
				stmt.setNull( index++, java.sql.Types.DOUBLE );
			} else {
				stmt.setDouble( index++, dto.getSubTotal() );
			}
		
			if (dto.isGrandTotalNull()) {
				stmt.setNull( index++, java.sql.Types.DOUBLE );
			} else {
				stmt.setDouble( index++, dto.getGrandTotal() );
			}
		
			if (dto.isProjectIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getProjectId() );
			}
		
			if (dto.isBranchIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getBranchId() );
			}
		
			stmt.setInt( 11, pk.getIdinvoice() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new InvoicesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the invoices table.
	 */
	public void delete(InvoicesPk pk) throws InvoicesDaoException
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
			stmt.setInt( 1, pk.getIdinvoice() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new InvoicesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the invoices table that matches the specified primary-key value.
	 */
	public Invoices findByPrimaryKey(InvoicesPk pk) throws InvoicesDaoException
	{
		return findByPrimaryKey( pk.getIdinvoice() );
	}

	/** 
	 * Returns all rows from the invoices table that match the criteria 'idinvoice = :idinvoice'.
	 */
	public Invoices findByPrimaryKey(int idinvoice) throws InvoicesDaoException
	{
		Invoices ret[] = findByDynamicSelect( SQL_SELECT + " WHERE idinvoice = ?", new Object[] {  new Integer(idinvoice) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the invoices table that match the criteria ''.
	 */
	public Invoices[] findAll() throws InvoicesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY idinvoice", null );
	}

	/** 
	 * Returns all rows from the invoices table that match the criteria 'business_partnet_id = :businessPartnetId'.
	 */
	public Invoices[] findByBusinessPartner(int businessPartnetId) throws InvoicesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE business_partnet_id = ?", new Object[] {  new Integer(businessPartnetId) } );
	}

	/** 
	 * Returns all rows from the invoices table that match the criteria 'branch_id = :branchId'.
	 */
	public Invoices[] findByBranches(int branchId) throws InvoicesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE branch_id = ?", new Object[] {  new Integer(branchId) } );
	}

	/** 
	 * Returns all rows from the invoices table that match the criteria 'project_id = :projectId'.
	 */
	public Invoices[] findByProjects(int projectId) throws InvoicesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE project_id = ?", new Object[] {  new Integer(projectId) } );
	}

	/** 
	 * Returns all rows from the invoices table that match the criteria 'idinvoice = :idinvoice'.
	 */
	public Invoices[] findWhereIdinvoiceEquals(int idinvoice) throws InvoicesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE idinvoice = ? ORDER BY idinvoice", new Object[] {  new Integer(idinvoice) } );
	}

	/** 
	 * Returns all rows from the invoices table that match the criteria 'invoice_date = :invoiceDate'.
	 */
	public Invoices[] findWhereInvoiceDateEquals(Date invoiceDate) throws InvoicesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE invoice_date = ? ORDER BY invoice_date", new Object[] { invoiceDate==null ? null : new java.sql.Date( invoiceDate.getTime() ) } );
	}

	/** 
	 * Returns all rows from the invoices table that match the criteria 'isTrx = :isTrx'.
	 */
	public Invoices[] findWhereIsTrxEquals(int isTrx) throws InvoicesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE isTrx = ? ORDER BY isTrx", new Object[] {  new Integer(isTrx) } );
	}

	/** 
	 * Returns all rows from the invoices table that match the criteria 'valid_to = :validTo'.
	 */
	public Invoices[] findWhereValidToEquals(Date validTo) throws InvoicesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE valid_to = ? ORDER BY valid_to", new Object[] { validTo==null ? null : new java.sql.Date( validTo.getTime() ) } );
	}

	/** 
	 * Returns all rows from the invoices table that match the criteria 'business_partnet_id = :businessPartnetId'.
	 */
	public Invoices[] findWhereBusinessPartnetIdEquals(int businessPartnetId) throws InvoicesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE business_partnet_id = ? ORDER BY business_partnet_id", new Object[] {  new Integer(businessPartnetId) } );
	}

	/** 
	 * Returns all rows from the invoices table that match the criteria 'tax = :tax'.
	 */
	public Invoices[] findWhereTaxEquals(double tax) throws InvoicesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE tax = ? ORDER BY tax", new Object[] {  new Double(tax) } );
	}

	/** 
	 * Returns all rows from the invoices table that match the criteria 'sub_total = :subTotal'.
	 */
	public Invoices[] findWhereSubTotalEquals(double subTotal) throws InvoicesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sub_total = ? ORDER BY sub_total", new Object[] {  new Double(subTotal) } );
	}

	/** 
	 * Returns all rows from the invoices table that match the criteria 'grand_total = :grandTotal'.
	 */
	public Invoices[] findWhereGrandTotalEquals(double grandTotal) throws InvoicesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE grand_total = ? ORDER BY grand_total", new Object[] {  new Double(grandTotal) } );
	}

	/** 
	 * Returns all rows from the invoices table that match the criteria 'project_id = :projectId'.
	 */
	public Invoices[] findWhereProjectIdEquals(int projectId) throws InvoicesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE project_id = ? ORDER BY project_id", new Object[] {  new Integer(projectId) } );
	}

	/** 
	 * Returns all rows from the invoices table that match the criteria 'branch_id = :branchId'.
	 */
	public Invoices[] findWhereBranchIdEquals(int branchId) throws InvoicesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE branch_id = ? ORDER BY branch_id", new Object[] {  new Integer(branchId) } );
	}

	/**
	 * Method 'InvoicesDaoImpl'
	 * 
	 */
	public InvoicesDaoImpl()
	{
	}

	/**
	 * Method 'InvoicesDaoImpl'
	 * 
	 * @param userConn
	 */
	public InvoicesDaoImpl(final java.sql.Connection userConn)
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
		return "constructions_web.invoices";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Invoices fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Invoices dto = new Invoices();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Invoices[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Invoices dto = new Invoices();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Invoices ret[] = new Invoices[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Invoices dto, ResultSet rs) throws SQLException
	{
		dto.setIdinvoice( rs.getInt( COLUMN_IDINVOICE ) );
		dto.setInvoiceDate( rs.getDate(COLUMN_INVOICE_DATE ) );
		dto.setIsTrx( rs.getInt( COLUMN_IS_TRX ) );
		if (rs.wasNull()) {
			dto.setIsTrxNull( true );
		}
		
		dto.setValidTo( rs.getDate(COLUMN_VALID_TO ) );
		dto.setBusinessPartnetId( rs.getInt( COLUMN_BUSINESS_PARTNET_ID ) );
		if (rs.wasNull()) {
			dto.setBusinessPartnetIdNull( true );
		}
		
		dto.setTax( rs.getDouble( COLUMN_TAX ) );
		if (rs.wasNull()) {
			dto.setTaxNull( true );
		}
		
		dto.setSubTotal( rs.getDouble( COLUMN_SUB_TOTAL ) );
		if (rs.wasNull()) {
			dto.setSubTotalNull( true );
		}
		
		dto.setGrandTotal( rs.getDouble( COLUMN_GRAND_TOTAL ) );
		if (rs.wasNull()) {
			dto.setGrandTotalNull( true );
		}
		
		dto.setProjectId( rs.getInt( COLUMN_PROJECT_ID ) );
		if (rs.wasNull()) {
			dto.setProjectIdNull( true );
		}
		
		dto.setBranchId( rs.getInt( COLUMN_BRANCH_ID ) );
		if (rs.wasNull()) {
			dto.setBranchIdNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Invoices dto)
	{
	}

	/** 
	 * Returns all rows from the invoices table that match the specified arbitrary SQL statement
	 */
	public Invoices[] findByDynamicSelect(String sql, Object[] sqlParams) throws InvoicesDaoException
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
			throw new InvoicesDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the invoices table that match the specified arbitrary SQL statement
	 */
	public Invoices[] findByDynamicWhere(String sql, Object[] sqlParams) throws InvoicesDaoException
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
			throw new InvoicesDaoException( "Exception: " + _e.getMessage(), _e );
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