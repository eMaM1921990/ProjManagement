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
 * This class represents the primary key of the working_status table.
 */
public class WorkingStatusPk implements Serializable
{
	protected int idworkingStat;

	/** 
	 * This attribute represents whether the primitive attribute idworkingStat is null.
	 */
	protected boolean idworkingStatNull;

	/** 
	 * Sets the value of idworkingStat
	 */
	public void setIdworkingStat(int idworkingStat)
	{
		this.idworkingStat = idworkingStat;
	}

	/** 
	 * Gets the value of idworkingStat
	 */
	public int getIdworkingStat()
	{
		return idworkingStat;
	}

	/**
	 * Method 'WorkingStatusPk'
	 * 
	 */
	public WorkingStatusPk()
	{
	}

	/**
	 * Method 'WorkingStatusPk'
	 * 
	 * @param idworkingStat
	 */
	public WorkingStatusPk(final int idworkingStat)
	{
		this.idworkingStat = idworkingStat;
	}

	/** 
	 * Sets the value of idworkingStatNull
	 */
	public void setIdworkingStatNull(boolean idworkingStatNull)
	{
		this.idworkingStatNull = idworkingStatNull;
	}

	/** 
	 * Gets the value of idworkingStatNull
	 */
	public boolean isIdworkingStatNull()
	{
		return idworkingStatNull;
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
		
		if (!(_other instanceof WorkingStatusPk)) {
			return false;
		}
		
		final WorkingStatusPk _cast = (WorkingStatusPk) _other;
		if (idworkingStat != _cast.idworkingStat) {
			return false;
		}
		
		if (idworkingStatNull != _cast.idworkingStatNull) {
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
		_hashCode = 29 * _hashCode + idworkingStat;
		_hashCode = 29 * _hashCode + (idworkingStatNull ? 1 : 0);
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
		ret.append( "com.pm.app.dal.dto.WorkingStatusPk: " );
		ret.append( "idworkingStat=" + idworkingStat );
		return ret.toString();
	}

}
