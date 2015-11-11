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
 * This class represents the primary key of the company table.
 */
public class CompanyPk implements Serializable
{
	protected int idcompany;

	/** 
	 * This attribute represents whether the primitive attribute idcompany is null.
	 */
	protected boolean idcompanyNull;

	/** 
	 * Sets the value of idcompany
	 */
	public void setIdcompany(int idcompany)
	{
		this.idcompany = idcompany;
	}

	/** 
	 * Gets the value of idcompany
	 */
	public int getIdcompany()
	{
		return idcompany;
	}

	/**
	 * Method 'CompanyPk'
	 * 
	 */
	public CompanyPk()
	{
	}

	/**
	 * Method 'CompanyPk'
	 * 
	 * @param idcompany
	 */
	public CompanyPk(final int idcompany)
	{
		this.idcompany = idcompany;
	}

	/** 
	 * Sets the value of idcompanyNull
	 */
	public void setIdcompanyNull(boolean idcompanyNull)
	{
		this.idcompanyNull = idcompanyNull;
	}

	/** 
	 * Gets the value of idcompanyNull
	 */
	public boolean isIdcompanyNull()
	{
		return idcompanyNull;
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
		
		if (!(_other instanceof CompanyPk)) {
			return false;
		}
		
		final CompanyPk _cast = (CompanyPk) _other;
		if (idcompany != _cast.idcompany) {
			return false;
		}
		
		if (idcompanyNull != _cast.idcompanyNull) {
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
		_hashCode = 29 * _hashCode + idcompany;
		_hashCode = 29 * _hashCode + (idcompanyNull ? 1 : 0);
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
		ret.append( "com.pm.app.dal.dto.CompanyPk: " );
		ret.append( "idcompany=" + idcompany );
		return ret.toString();
	}

}
