/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.pm.app.dal.dao;

import com.pm.app.dal.dto.*;
import com.pm.app.dal.exceptions.*;

public interface ProjectTypeDao
{
	/** 
	 * Inserts a new row in the project_type table.
	 */
	public ProjectTypePk insert(ProjectType dto) throws ProjectTypeDaoException;

	/** 
	 * Updates a single row in the project_type table.
	 */
	public void update(ProjectTypePk pk, ProjectType dto) throws ProjectTypeDaoException;

	/** 
	 * Deletes a single row in the project_type table.
	 */
	public void delete(ProjectTypePk pk) throws ProjectTypeDaoException;

	/** 
	 * Returns the rows from the project_type table that matches the specified primary-key value.
	 */
	public ProjectType findByPrimaryKey(ProjectTypePk pk) throws ProjectTypeDaoException;

	/** 
	 * Returns all rows from the project_type table that match the criteria 'idproject_type = :idprojectType'.
	 */
	public ProjectType findByPrimaryKey(int idprojectType) throws ProjectTypeDaoException;

	/** 
	 * Returns all rows from the project_type table that match the criteria ''.
	 */
	public ProjectType[] findAll() throws ProjectTypeDaoException;

	/** 
	 * Returns all rows from the project_type table that match the criteria 'branch_id = :branchId'.
	 */
	public ProjectType[] findByBranches(int branchId) throws ProjectTypeDaoException;

	/** 
	 * Returns all rows from the project_type table that match the criteria 'idproject_type = :idprojectType'.
	 */
	public ProjectType[] findWhereIdprojectTypeEquals(int idprojectType) throws ProjectTypeDaoException;

	/** 
	 * Returns all rows from the project_type table that match the criteria 'project_type = :projectType'.
	 */
	public ProjectType[] findWhereProjectTypeEquals(String projectType) throws ProjectTypeDaoException;

	/** 
	 * Returns all rows from the project_type table that match the criteria 'branch_id = :branchId'.
	 */
	public ProjectType[] findWhereBranchIdEquals(int branchId) throws ProjectTypeDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the project_type table that match the specified arbitrary SQL statement
	 */
	public ProjectType[] findByDynamicSelect(String sql, Object[] sqlParams) throws ProjectTypeDaoException;

	/** 
	 * Returns all rows from the project_type table that match the specified arbitrary SQL statement
	 */
	public ProjectType[] findByDynamicWhere(String sql, Object[] sqlParams) throws ProjectTypeDaoException;

}
