/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.pm.app.dal.dto;

import com.pm.app.dal.dao.*;
import com.pm.app.dal.factory.*;
import com.pm.app.dal.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class InvoiceDetails implements Serializable
{
	/** 
	 * This attribute maps to the column idinvoice_details in the invoice_details table.
	 */
	protected int idinvoiceDetails;

	/** 
	 * This attribute maps to the column invoice_id in the invoice_details table.
	 */
	protected int invoiceId;

	/** 
	 * This attribute represents whether the primitive attribute invoiceId is null.
	 */
	protected boolean invoiceIdNull = true;

	/** 
	 * This attribute maps to the column item_id in the invoice_details table.
	 */
	protected int itemId;

	/** 
	 * This attribute represents whether the primitive attribute itemId is null.
	 */
	protected boolean itemIdNull = true;

	/** 
	 * This attribute maps to the column unit_id in the invoice_details table.
	 */
	protected int unitId;

	/** 
	 * This attribute represents whether the primitive attribute unitId is null.
	 */
	protected boolean unitIdNull = true;

	/** 
	 * This attribute maps to the column price in the invoice_details table.
	 */
	protected double price;

	/** 
	 * This attribute represents whether the primitive attribute price is null.
	 */
	protected boolean priceNull = true;

	/**
	 * Method 'InvoiceDetails'
	 * 
	 */
	public InvoiceDetails()
	{
	}

	/**
	 * Method 'getIdinvoiceDetails'
	 * 
	 * @return int
	 */
	public int getIdinvoiceDetails()
	{
		return idinvoiceDetails;
	}

	/**
	 * Method 'setIdinvoiceDetails'
	 * 
	 * @param idinvoiceDetails
	 */
	public void setIdinvoiceDetails(int idinvoiceDetails)
	{
		this.idinvoiceDetails = idinvoiceDetails;
	}

	/**
	 * Method 'getInvoiceId'
	 * 
	 * @return int
	 */
	public int getInvoiceId()
	{
		return invoiceId;
	}

	/**
	 * Method 'setInvoiceId'
	 * 
	 * @param invoiceId
	 */
	public void setInvoiceId(int invoiceId)
	{
		this.invoiceId = invoiceId;
		this.invoiceIdNull = false;
	}

	/**
	 * Method 'setInvoiceIdNull'
	 * 
	 * @param value
	 */
	public void setInvoiceIdNull(boolean value)
	{
		this.invoiceIdNull = value;
	}

	/**
	 * Method 'isInvoiceIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isInvoiceIdNull()
	{
		return invoiceIdNull;
	}

	/**
	 * Method 'getItemId'
	 * 
	 * @return int
	 */
	public int getItemId()
	{
		return itemId;
	}

	/**
	 * Method 'setItemId'
	 * 
	 * @param itemId
	 */
	public void setItemId(int itemId)
	{
		this.itemId = itemId;
		this.itemIdNull = false;
	}

	/**
	 * Method 'setItemIdNull'
	 * 
	 * @param value
	 */
	public void setItemIdNull(boolean value)
	{
		this.itemIdNull = value;
	}

	/**
	 * Method 'isItemIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isItemIdNull()
	{
		return itemIdNull;
	}

	/**
	 * Method 'getUnitId'
	 * 
	 * @return int
	 */
	public int getUnitId()
	{
		return unitId;
	}

	/**
	 * Method 'setUnitId'
	 * 
	 * @param unitId
	 */
	public void setUnitId(int unitId)
	{
		this.unitId = unitId;
		this.unitIdNull = false;
	}

	/**
	 * Method 'setUnitIdNull'
	 * 
	 * @param value
	 */
	public void setUnitIdNull(boolean value)
	{
		this.unitIdNull = value;
	}

	/**
	 * Method 'isUnitIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isUnitIdNull()
	{
		return unitIdNull;
	}

	/**
	 * Method 'getPrice'
	 * 
	 * @return double
	 */
	public double getPrice()
	{
		return price;
	}

	/**
	 * Method 'setPrice'
	 * 
	 * @param price
	 */
	public void setPrice(double price)
	{
		this.price = price;
		this.priceNull = false;
	}

	/**
	 * Method 'setPriceNull'
	 * 
	 * @param value
	 */
	public void setPriceNull(boolean value)
	{
		this.priceNull = value;
	}

	/**
	 * Method 'isPriceNull'
	 * 
	 * @return boolean
	 */
	public boolean isPriceNull()
	{
		return priceNull;
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
		
		if (!(_other instanceof InvoiceDetails)) {
			return false;
		}
		
		final InvoiceDetails _cast = (InvoiceDetails) _other;
		if (idinvoiceDetails != _cast.idinvoiceDetails) {
			return false;
		}
		
		if (invoiceId != _cast.invoiceId) {
			return false;
		}
		
		if (invoiceIdNull != _cast.invoiceIdNull) {
			return false;
		}
		
		if (itemId != _cast.itemId) {
			return false;
		}
		
		if (itemIdNull != _cast.itemIdNull) {
			return false;
		}
		
		if (unitId != _cast.unitId) {
			return false;
		}
		
		if (unitIdNull != _cast.unitIdNull) {
			return false;
		}
		
		if (price != _cast.price) {
			return false;
		}
		
		if (priceNull != _cast.priceNull) {
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
		_hashCode = 29 * _hashCode + invoiceId;
		_hashCode = 29 * _hashCode + (invoiceIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + itemId;
		_hashCode = 29 * _hashCode + (itemIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + unitId;
		_hashCode = 29 * _hashCode + (unitIdNull ? 1 : 0);
		long temp_price = Double.doubleToLongBits(price);
		_hashCode = 29 * _hashCode + (int) (temp_price ^ (temp_price >>> 32));
		_hashCode = 29 * _hashCode + (priceNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return InvoiceDetailsPk
	 */
	public InvoiceDetailsPk createPk()
	{
		return new InvoiceDetailsPk(idinvoiceDetails);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.pm.app.dal.dto.InvoiceDetails: " );
		ret.append( "idinvoiceDetails=" + idinvoiceDetails );
		ret.append( ", invoiceId=" + invoiceId );
		ret.append( ", itemId=" + itemId );
		ret.append( ", unitId=" + unitId );
		ret.append( ", price=" + price );
		return ret.toString();
	}

}
