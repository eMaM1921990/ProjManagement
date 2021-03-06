/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.pm.app.dal.dao;

import java.util.Date;
import com.pm.app.dal.dto.*;
import com.pm.app.dal.exceptions.*;

public interface CompanyDao
{
	/** 
	 * Inserts a new row in the company table.
	 */
	public CompanyPk insert(Company dto) throws CompanyDaoException;

	/** 
	 * Updates a single row in the company table.
	 */
	public void update(CompanyPk pk, Company dto) throws CompanyDaoException;

	/** 
	 * Deletes a single row in the company table.
	 */
	public void delete(CompanyPk pk) throws CompanyDaoException;

	/** 
	 * Returns the rows from the company table that matches the specified primary-key value.
	 */
	public Company findByPrimaryKey(CompanyPk pk) throws CompanyDaoException;

	/** 
	 * Returns all rows from the company table that match the criteria 'idcompany = :idcompany'.
	 */
	public Company findByPrimaryKey(int idcompany) throws CompanyDaoException;

	/** 
	 * Returns all rows from the company table that match the criteria ''.
	 */
	public Company[] findAll() throws CompanyDaoException;

	/** 
	 * Returns all rows from the company table that match the criteria 'idcompany = :idcompany'.
	 */
	public Company[] findWhereIdcompanyEquals(int idcompany) throws CompanyDaoException;

	/** 
	 * Returns all rows from the company table that match the criteria 'name = :name'.
	 */
	public Company[] findWhereNameEquals(String name) throws CompanyDaoException;

	/** 
	 * Returns all rows from the company table that match the criteria 'join_date = :joinDate'.
	 */
	public Company[] findWhereJoinDateEquals(Date joinDate) throws CompanyDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the company table that match the specified arbitrary SQL statement
	 */
	public Company[] findByDynamicSelect(String sql, Object[] sqlParams) throws CompanyDaoException;

	/** 
	 * Returns all rows from the company table that match the specified arbitrary SQL statement
	 */
	public Company[] findByDynamicWhere(String sql, Object[] sqlParams) throws CompanyDaoException;

}
