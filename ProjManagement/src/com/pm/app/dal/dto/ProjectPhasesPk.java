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
 * This class represents the primary key of the project_phases table.
 */
public class ProjectPhasesPk implements Serializable
{
	protected int idprojectPhases;

	/** 
	 * This attribute represents whether the primitive attribute idprojectPhases is null.
	 */
	protected boolean idprojectPhasesNull;

	/** 
	 * Sets the value of idprojectPhases
	 */
	public void setIdprojectPhases(int idprojectPhases)
	{
		this.idprojectPhases = idprojectPhases;
	}

	/** 
	 * Gets the value of idprojectPhases
	 */
	public int getIdprojectPhases()
	{
		return idprojectPhases;
	}

	/**
	 * Method 'ProjectPhasesPk'
	 * 
	 */
	public ProjectPhasesPk()
	{
	}

	/**
	 * Method 'ProjectPhasesPk'
	 * 
	 * @param idprojectPhases
	 */
	public ProjectPhasesPk(final int idprojectPhases)
	{
		this.idprojectPhases = idprojectPhases;
	}

	/** 
	 * Sets the value of idprojectPhasesNull
	 */
	public void setIdprojectPhasesNull(boolean idprojectPhasesNull)
	{
		this.idprojectPhasesNull = idprojectPhasesNull;
	}

	/** 
	 * Gets the value of idprojectPhasesNull
	 */
	public boolean isIdprojectPhasesNull()
	{
		return idprojectPhasesNull;
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
		
		if (!(_other instanceof ProjectPhasesPk)) {
			return false;
		}
		
		final ProjectPhasesPk _cast = (ProjectPhasesPk) _other;
		if (idprojectPhases != _cast.idprojectPhases) {
			return false;
		}
		
		if (idprojectPhasesNull != _cast.idprojectPhasesNull) {
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
		_hashCode = 29 * _hashCode + idprojectPhases;
		_hashCode = 29 * _hashCode + (idprojectPhasesNull ? 1 : 0);
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
		ret.append( "com.pm.app.dal.dto.ProjectPhasesPk: " );
		ret.append( "idprojectPhases=" + idprojectPhases );
		return ret.toString();
	}

}