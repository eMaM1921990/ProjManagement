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

public class ProjectsDaoImpl extends AbstractDAO implements ProjectsDao
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
	protected final String SQL_SELECT = "SELECT idprojects, name, description, start_date, end_date, status, type, company_id, branch_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( idprojects, name, description, start_date, end_date, status, type, company_id, branch_id ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET idprojects = ?, name = ?, description = ?, start_date = ?, end_date = ?, status = ?, type = ?, company_id = ?, branch_id = ? WHERE idprojects = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE idprojects = ?";

	/** 
	 * Index of column idprojects
	 */
	protected static final int COLUMN_IDPROJECTS = 1;

	/** 
	 * Index of column name
	 */
	protected static final int COLUMN_NAME = 2;

	/** 
	 * Index of column description
	 */
	protected static final int COLUMN_DESCRIPTION = 3;

	/** 
	 * Index of column start_date
	 */
	protected static final int COLUMN_START_DATE = 4;

	/** 
	 * Index of column end_date
	 */
	protected static final int COLUMN_END_DATE = 5;

	/** 
	 * Index of column status
	 */
	protected static final int COLUMN_STATUS = 6;

	/** 
	 * Index of column type
	 */
	protected static final int COLUMN_TYPE = 7;

	/** 
	 * Index of column company_id
	 */
	protected static final int COLUMN_COMPANY_ID = 8;

	/** 
	 * Index of column branch_id
	 */
	protected static final int COLUMN_BRANCH_ID = 9;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 9;

	/** 
	 * Index of primary-key column idprojects
	 */
	protected static final int PK_COLUMN_IDPROJECTS = 1;

	/** 
	 * Inserts a new row in the projects table.
	 */
	public ProjectsPk insert(Projects dto) throws ProjectsDaoException
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
			stmt.setInt( index++, dto.getIdprojects() );
			stmt.setString( index++, dto.getName() );
			stmt.setString( index++, dto.getDescription() );
			stmt.setDate(index++, dto.getStartDate()==null ? null : new java.sql.Date( dto.getStartDate().getTime() ) );
			stmt.setDate(index++, dto.getEndDate()==null ? null : new java.sql.Date( dto.getEndDate().getTime() ) );
			if (dto.isStatusNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getStatus() );
			}
		
			if (dto.isTypeNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getType() );
			}
		
			if (dto.isCompanyIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getCompanyId() );
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
				dto.setIdprojects( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ProjectsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the projects table.
	 */
	public void update(ProjectsPk pk, Projects dto) throws ProjectsDaoException
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
			stmt.setInt( index++, dto.getIdprojects() );
			stmt.setString( index++, dto.getName() );
			stmt.setString( index++, dto.getDescription() );
			stmt.setDate(index++, dto.getStartDate()==null ? null : new java.sql.Date( dto.getStartDate().getTime() ) );
			stmt.setDate(index++, dto.getEndDate()==null ? null : new java.sql.Date( dto.getEndDate().getTime() ) );
			if (dto.isStatusNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getStatus() );
			}
		
			if (dto.isTypeNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getType() );
			}
		
			if (dto.isCompanyIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getCompanyId() );
			}
		
			if (dto.isBranchIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getBranchId() );
			}
		
			stmt.setInt( 10, pk.getIdprojects() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ProjectsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the projects table.
	 */
	public void delete(ProjectsPk pk) throws ProjectsDaoException
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
			stmt.setInt( 1, pk.getIdprojects() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ProjectsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the projects table that matches the specified primary-key value.
	 */
	public Projects findByPrimaryKey(ProjectsPk pk) throws ProjectsDaoException
	{
		return findByPrimaryKey( pk.getIdprojects() );
	}

	/** 
	 * Returns all rows from the projects table that match the criteria 'idprojects = :idprojects'.
	 */
	public Projects findByPrimaryKey(int idprojects) throws ProjectsDaoException
	{
		Projects ret[] = findByDynamicSelect( SQL_SELECT + " WHERE idprojects = ?", new Object[] {  new Integer(idprojects) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the projects table that match the criteria ''.
	 */
	public Projects[] findAll() throws ProjectsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY idprojects", null );
	}

	/** 
	 * Returns all rows from the projects table that match the criteria 'company_id = :companyId'.
	 */
	public Projects[] findByBusinessPartner(int companyId) throws ProjectsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE company_id = ?", new Object[] {  new Integer(companyId) } );
	}

	/** 
	 * Returns all rows from the projects table that match the criteria 'branch_id = :branchId'.
	 */
	public Projects[] findByBranches(int branchId) throws ProjectsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE branch_id = ?", new Object[] {  new Integer(branchId) } );
	}

	/** 
	 * Returns all rows from the projects table that match the criteria 'status = :status'.
	 */
	public Projects[] findByWorkingStatus(int status) throws ProjectsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE status = ?", new Object[] {  new Integer(status) } );
	}

	/** 
	 * Returns all rows from the projects table that match the criteria 'type = :type'.
	 */
	public Projects[] findByProjectType(int type) throws ProjectsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE type = ?", new Object[] {  new Integer(type) } );
	}

	/** 
	 * Returns all rows from the projects table that match the criteria 'idprojects = :idprojects'.
	 */
	public Projects[] findWhereIdprojectsEquals(int idprojects) throws ProjectsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE idprojects = ? ORDER BY idprojects", new Object[] {  new Integer(idprojects) } );
	}

	/** 
	 * Returns all rows from the projects table that match the criteria 'name = :name'.
	 */
	public Projects[] findWhereNameEquals(String name) throws ProjectsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE name = ? ORDER BY name", new Object[] { name } );
	}

	/** 
	 * Returns all rows from the projects table that match the criteria 'description = :description'.
	 */
	public Projects[] findWhereDescriptionEquals(String description) throws ProjectsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE description = ? ORDER BY description", new Object[] { description } );
	}

	/** 
	 * Returns all rows from the projects table that match the criteria 'start_date = :startDate'.
	 */
	public Projects[] findWhereStartDateEquals(Date startDate) throws ProjectsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE start_date = ? ORDER BY start_date", new Object[] { startDate==null ? null : new java.sql.Date( startDate.getTime() ) } );
	}

	/** 
	 * Returns all rows from the projects table that match the criteria 'end_date = :endDate'.
	 */
	public Projects[] findWhereEndDateEquals(Date endDate) throws ProjectsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE end_date = ? ORDER BY end_date", new Object[] { endDate==null ? null : new java.sql.Date( endDate.getTime() ) } );
	}

	/** 
	 * Returns all rows from the projects table that match the criteria 'status = :status'.
	 */
	public Projects[] findWhereStatusEquals(int status) throws ProjectsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE status = ? ORDER BY status", new Object[] {  new Integer(status) } );
	}

	/** 
	 * Returns all rows from the projects table that match the criteria 'type = :type'.
	 */
	public Projects[] findWhereTypeEquals(int type) throws ProjectsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE type = ? ORDER BY type", new Object[] {  new Integer(type) } );
	}

	/** 
	 * Returns all rows from the projects table that match the criteria 'company_id = :companyId'.
	 */
	public Projects[] findWhereCompanyIdEquals(int companyId) throws ProjectsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE company_id = ? ORDER BY company_id", new Object[] {  new Integer(companyId) } );
	}

	/** 
	 * Returns all rows from the projects table that match the criteria 'branch_id = :branchId'.
	 */
	public Projects[] findWhereBranchIdEquals(int branchId) throws ProjectsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE branch_id = ? ORDER BY branch_id", new Object[] {  new Integer(branchId) } );
	}

	/**
	 * Method 'ProjectsDaoImpl'
	 * 
	 */
	public ProjectsDaoImpl()
	{
	}

	/**
	 * Method 'ProjectsDaoImpl'
	 * 
	 * @param userConn
	 */
	public ProjectsDaoImpl(final java.sql.Connection userConn)
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
		return "constructions_web.projects";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Projects fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Projects dto = new Projects();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Projects[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Projects dto = new Projects();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Projects ret[] = new Projects[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Projects dto, ResultSet rs) throws SQLException
	{
		dto.setIdprojects( rs.getInt( COLUMN_IDPROJECTS ) );
		dto.setName( rs.getString( COLUMN_NAME ) );
		dto.setDescription( rs.getString( COLUMN_DESCRIPTION ) );
		dto.setStartDate( rs.getDate(COLUMN_START_DATE ) );
		dto.setEndDate( rs.getDate(COLUMN_END_DATE ) );
		dto.setStatus( rs.getInt( COLUMN_STATUS ) );
		if (rs.wasNull()) {
			dto.setStatusNull( true );
		}
		
		dto.setType( rs.getInt( COLUMN_TYPE ) );
		if (rs.wasNull()) {
			dto.setTypeNull( true );
		}
		
		dto.setCompanyId( rs.getInt( COLUMN_COMPANY_ID ) );
		if (rs.wasNull()) {
			dto.setCompanyIdNull( true );
		}
		
		dto.setBranchId( rs.getInt( COLUMN_BRANCH_ID ) );
		if (rs.wasNull()) {
			dto.setBranchIdNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Projects dto)
	{
	}

	/** 
	 * Returns all rows from the projects table that match the specified arbitrary SQL statement
	 */
	public Projects[] findByDynamicSelect(String sql, Object[] sqlParams) throws ProjectsDaoException
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
			throw new ProjectsDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the projects table that match the specified arbitrary SQL statement
	 */
	public Projects[] findByDynamicWhere(String sql, Object[] sqlParams) throws ProjectsDaoException
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
			throw new ProjectsDaoException( "Exception: " + _e.getMessage(), _e );
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