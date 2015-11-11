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
 * This class represents the primary key of the invoice_details table.
 */
public class InvoiceDetailsPk implements Serializable
{
	protected int idinvoiceDetails;

	/** 
	 * This attribute represents whether the primitive attribute idinvoiceDetails is null.
	 */
	protected boolean idinvoiceDetailsNull;

	/** 
	 * Sets the value of idinvoiceDetails
	 */
	public void setIdinvoiceDetails(int idinvoiceDetails)
	{
		this.idinvoiceDetails = idinvoiceDetails;
	}

	/** 
	 * Gets the value of idinvoiceDetails
	 */
	public int getIdinvoiceDetails()
	{
		return idinvoiceDetails;
	}

	/**
	 * Method 'InvoiceDetailsPk'
	 * 
	 */
	public InvoiceDetailsPk()
	{
	}

	/**
	 * Method 'InvoiceDetailsPk'
	 * 
	 * @param idinvoiceDetails
	 */
	public InvoiceDetailsPk(final int idinvoiceDetails)
	{
		this.idinvoiceDetails = idinvoiceDetails;
	}

	/** 
	 * Sets the value of idinvoiceDetailsNull
	 */
	public void setIdinvoiceDetailsNull(boolean idinvoiceDetailsNull)
	{
		this.idinvoiceDetailsNull = idinvoiceDetailsNull;
	}

	/** 
	 * Gets the value of idinvoiceDetailsNull
	 */
	public boolean isIdinvoiceDetailsNull()
	{
		return idinvoiceDetailsNull;
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
		
		if (!(_other instanceof InvoiceDetailsPk)) {
			return false;
		}
		
		final InvoiceDetailsPk _cast = (InvoiceDetailsPk) _other;
		if (idinvoiceDetails != _cast.idinvoiceDetails) {
			return false;
		}
		
		if (idinvoiceDetailsNull != _cast.idinvoiceDetailsNull) {
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
		_hashCode = 29 * _hashCode + idinvoiceDetails;
		_hashCode = 29 * _hashCode + (idinvoiceDetailsNull ? 1 : 0);
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
		ret.append( "com.pm.app.dal.dto.InvoiceDetailsPk: " );
		ret.append( "idinvoiceDetails=" + idinvoiceDetails );
		return ret.toString();
	}

}