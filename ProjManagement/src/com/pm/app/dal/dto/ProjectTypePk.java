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
 * This class represents the primary key of the project_type table.
 */
public class ProjectTypePk implements Serializable
{
	protected int idprojectType;

	/** 
	 * This attribute represents whether the primitive attribute idprojectType is null.
	 */
	protected boolean idprojectTypeNull;

	/** 
	 * Sets the value of idprojectType
	 */
	public void setIdprojectType(int idprojectType)
	{
		this.idprojectType = idprojectType;
	}

	/** 
	 * Gets the value of idprojectType
	 */
	public int getIdprojectType()
	{
		return idprojectType;
	}

	/**
	 * Method 'ProjectTypePk'
	 * 
	 */
	public ProjectTypePk()
	{
	}

	/**
	 * Method 'ProjectTypePk'
	 * 
	 * @param idprojectType
	 */
	public ProjectTypePk(final int idprojectType)
	{
		this.idprojectType = idprojectType;
	}

	/** 
	 * Sets the value of idprojectTypeNull
	 */
	public void setIdprojectTypeNull(boolean idprojectTypeNull)
	{
		this.idprojectTypeNull = idprojectTypeNull;
	}

	/** 
	 * Gets the value of idprojectTypeNull
	 */
	public boolean isIdprojectTypeNull()
	{
		return idprojectTypeNull;
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
		
		if (!(_other instanceof ProjectTypePk)) {
			return false;
		}
		
		final ProjectTypePk _cast = (ProjectTypePk) _other;
		if (idprojectType != _cast.idprojectType) {
			return false;
		}
		
		if (idprojectTypeNull != _cast.idprojectTypeNull) {
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
		_hashCode = 29 * _hashCode + idprojectType;
		_hashCode = 29 * _hashCode + (idprojectTypeNull ? 1 : 0);
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
		ret.append( "com.pm.app.dal.dto.ProjectTypePk: " );
		ret.append( "idprojectType=" + idprojectType );
		return ret.toString();
	}

}
