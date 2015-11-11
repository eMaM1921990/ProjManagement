/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.pm.app.dal.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the task_management table.
 */
public class TaskManagementPk implements Serializable
{
	protected int idtaskManagement;

	/** 
	 * This attribute represents whether the primitive attribute idtaskManagement is null.
	 */
	protected boolean idtaskManagementNull;

	/** 
	 * Sets the value of idtaskManagement
	 */
	public void setIdtaskManagement(int idtaskManagement)
	{
		this.idtaskManagement = idtaskManagement;
	}

	/** 
	 * Gets the value of idtaskManagement
	 */
	public int getIdtaskManagement()
	{
		return idtaskManagement;
	}

	/**
	 * Method 'TaskManagementPk'
	 * 
	 */
	public TaskManagementPk()
	{
	}

	/**
	 * Method 'TaskManagementPk'
	 * 
	 * @param idtaskManagement
	 */
	public TaskManagementPk(final int idtaskManagement)
	{
		this.idtaskManagement = idtaskManagement;
	}

	/** 
	 * Sets the value of idtaskManagementNull
	 */
	public void setIdtaskManagementNull(boolean idtaskManagementNull)
	{
		this.idtaskManagementNull = idtaskManagementNull;
	}

	/** 
	 * Gets the value of idtaskManagementNull
	 */
	public boolean isIdtaskManagementNull()
	{
		return idtaskManagementNull;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof TaskManagementPk)) {
			return false;
		}
		
		final TaskManagementPk _cast = (TaskManagementPk) _other;
		if (idtaskManagement != _cast.idtaskManagement) {
			return false;
		}
		
		if (idtaskManagementNull != _cast.idtaskManagementNull) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + idtaskManagement;
		_hashCode = 29 * _hashCode + (idtaskManagementNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.pm.app.dal.dto.TaskManagementPk: " );
		ret.append( "idtaskManagement=" + idtaskManagement );
		return ret.toString();
	}

}
