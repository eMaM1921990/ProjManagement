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

public interface TasksDao
{
	/** 
	 * Inserts a new row in the tasks table.
	 */
	public TasksPk insert(Tasks dto) throws TasksDaoException;

	/** 
	 * Updates a single row in the tasks table.
	 */
	public void update(TasksPk pk, Tasks dto) throws TasksDaoException;

	/** 
	 * Deletes a single row in the tasks table.
	 */
	public void delete(TasksPk pk) throws TasksDaoException;

	/** 
	 * Returns the rows from the tasks table that matches the specified primary-key value.
	 */
	public Tasks findByPrimaryKey(TasksPk pk) throws TasksDaoException;

	/** 
	 * Returns all rows from the tasks table that match the criteria 'idtasks = :idtasks'.
	 */
	public Tasks findByPrimaryKey(int idtasks) throws TasksDaoException;

	/** 
	 * Returns all rows from the tasks table that match the criteria ''.
	 */
	public Tasks[] findAll() throws TasksDaoException;

	/** 
	 * Returns all rows from the tasks table that match the criteria 'status = :status'.
	 */
	public Tasks[] findByWorkingStatus(int status) throws TasksDaoException;

	/** 
	 * Returns all rows from the tasks table that match the criteria 'phase_id = :phaseId'.
	 */
	public Tasks[] findByProjectPhases(int phaseId) throws TasksDaoException;

	/** 
	 * Returns all rows from the tasks table that match the criteria 'idtasks = :idtasks'.
	 */
	public Tasks[] findWhereIdtasksEquals(int idtasks) throws TasksDaoException;

	/** 
	 * Returns all rows from the tasks table that match the criteria 'name = :name'.
	 */
	public Tasks[] findWhereNameEquals(String name) throws TasksDaoException;

	/** 
	 * Returns all rows from the tasks table that match the criteria 'description = :description'.
	 */
	public Tasks[] findWhereDescriptionEquals(String description) throws TasksDaoException;

	/** 
	 * Returns all rows from the tasks table that match the criteria 'start_date = :startDate'.
	 */
	public Tasks[] findWhereStartDateEquals(Date startDate) throws TasksDaoException;

	/** 
	 * Returns all rows from the tasks table that match the criteria 'end_date = :endDate'.
	 */
	public Tasks[] findWhereEndDateEquals(Date endDate) throws TasksDaoException;

	/** 
	 * Returns all rows from the tasks table that match the criteria 'phase_id = :phaseId'.
	 */
	public Tasks[] findWherePhaseIdEquals(int phaseId) throws TasksDaoException;

	/** 
	 * Returns all rows from the tasks table that match the criteria 'status = :status'.
	 */
	public Tasks[] findWhereStatusEquals(int status) throws TasksDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the tasks table that match the specified arbitrary SQL statement
	 */
	public Tasks[] findByDynamicSelect(String sql, Object[] sqlParams) throws TasksDaoException;

	/** 
	 * Returns all rows from the tasks table that match the specified arbitrary SQL statement
	 */
	public Tasks[] findByDynamicWhere(String sql, Object[] sqlParams) throws TasksDaoException;

}
