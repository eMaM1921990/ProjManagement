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
import java.util.Date;

public class Invoices implements Serializable
{
	/** 
	 * This attribute maps to the column idinvoice in the invoices table.
	 */
	protected int idinvoice;

	/** 
	 * This attribute maps to the column invoice_date in the invoices table.
	 */
	protected Date invoiceDate;

	/** 
	 * This attribute maps to the column isTrx in the invoices table.
	 */
	protected int isTrx;

	/** 
	 * This attribute represents whether the primitive attribute isTrx is null.
	 */
	protected boolean isTrxNull = true;

	/** 
	 * This attribute maps to the column valid_to in the invoices table.
	 */
	protected Date validTo;

	/** 
	 * This attribute maps to the column business_partnet_id in the invoices table.
	 */
	protected int businessPartnetId;

	/** 
	 * This attribute represents whether the primitive attribute businessPartnetId is null.
	 */
	protected boolean businessPartnetIdNull = true;

	/** 
	 * This attribute maps to the column tax in the invoices table.
	 */
	protected double tax;

	/** 
	 * This attribute represents whether the primitive attribute tax is null.
	 */
	protected boolean taxNull = true;

	/** 
	 * This attribute maps to the column sub_total in the invoices table.
	 */
	protected double subTotal;

	/** 
	 * This attribute represents whether the primitive attribute subTotal is null.
	 */
	protected boolean subTotalNull = true;

	/** 
	 * This attribute maps to the column grand_total in the invoices table.
	 */
	protected double grandTotal;

	/** 
	 * This attribute represents whether the primitive attribute grandTotal is null.
	 */
	protected boolean grandTotalNull = true;

	/** 
	 * This attribute maps to the column project_id in the invoices table.
	 */
	protected int projectId;

	/** 
	 * This attribute represents whether the primitive attribute projectId is null.
	 */
	protected boolean projectIdNull = true;

	/** 
	 * This attribute maps to the column branch_id in the invoices table.
	 */
	protected int branchId;

	/** 
	 * This attribute represents whether the primitive attribute branchId is null.
	 */
	protected boolean branchIdNull = true;

	/**
	 * Method 'Invoices'
	 * 
	 */
	public Invoices()
	{
	}

	/**
	 * Method 'getIdinvoice'
	 * 
	 * @return int
	 */
	public int getIdinvoice()
	{
		return idinvoice;
	}

	/**
	 * Method 'setIdinvoice'
	 * 
	 * @param idinvoice
	 */
	public void setIdinvoice(int idinvoice)
	{
		this.idinvoice = idinvoice;
	}

	/**
	 * Method 'getInvoiceDate'
	 * 
	 * @return Date
	 */
	public Date getInvoiceDate()
	{
		return invoiceDate;
	}

	/**
	 * Method 'setInvoiceDate'
	 * 
	 * @param invoiceDate
	 */
	public void setInvoiceDate(Date invoiceDate)
	{
		this.invoiceDate = invoiceDate;
	}

	/**
	 * Method 'getIsTrx'
	 * 
	 * @return int
	 */
	public int getIsTrx()
	{
		return isTrx;
	}

	/**
	 * Method 'setIsTrx'
	 * 
	 * @param isTrx
	 */
	public void setIsTrx(int isTrx)
	{
		this.isTrx = isTrx;
		this.isTrxNull = false;
	}

	/**
	 * Method 'setIsTrxNull'
	 * 
	 * @param value
	 */
	public void setIsTrxNull(boolean value)
	{
		this.isTrxNull = value;
	}

	/**
	 * Method 'isIsTrxNull'
	 * 
	 * @return boolean
	 */
	public boolean isIsTrxNull()
	{
		return isTrxNull;
	}

	/**
	 * Method 'getValidTo'
	 * 
	 * @return Date
	 */
	public Date getValidTo()
	{
		return validTo;
	}

	/**
	 * Method 'setValidTo'
	 * 
	 * @param validTo
	 */
	public void setValidTo(Date validTo)
	{
		this.validTo = validTo;
	}

	/**
	 * Method 'getBusinessPartnetId'
	 * 
	 * @return int
	 */
	public int getBusinessPartnetId()
	{
		return businessPartnetId;
	}

	/**
	 * Method 'setBusinessPartnetId'
	 * 
	 * @param businessPartnetId
	 */
	public void setBusinessPartnetId(int businessPartnetId)
	{
		this.businessPartnetId = businessPartnetId;
		this.businessPartnetIdNull = false;
	}

	/**
	 * Method 'setBusinessPartnetIdNull'
	 * 
	 * @param value
	 */
	public void setBusinessPartnetIdNull(boolean value)
	{
		this.businessPartnetIdNull = value;
	}

	/**
	 * Method 'isBusinessPartnetIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isBusinessPartnetIdNull()
	{
		return businessPartnetIdNull;
	}

	/**
	 * Method 'getTax'
	 * 
	 * @return double
	 */
	public double getTax()
	{
		return tax;
	}

	/**
	 * Method 'setTax'
	 * 
	 * @param tax
	 */
	public void setTax(double tax)
	{
		this.tax = tax;
		this.taxNull = false;
	}

	/**
	 * Method 'setTaxNull'
	 * 
	 * @param value
	 */
	public void setTaxNull(boolean value)
	{
		this.taxNull = value;
	}

	/**
	 * Method 'isTaxNull'
	 * 
	 * @return boolean
	 */
	public boolean isTaxNull()
	{
		return taxNull;
	}

	/**
	 * Method 'getSubTotal'
	 * 
	 * @return double
	 */
	public double getSubTotal()
	{
		return subTotal;
	}

	/**
	 * Method 'setSubTotal'
	 * 
	 * @param subTotal
	 */
	public void setSubTotal(double subTotal)
	{
		this.subTotal = subTotal;
		this.subTotalNull = false;
	}

	/**
	 * Method 'setSubTotalNull'
	 * 
	 * @param value
	 */
	public void setSubTotalNull(boolean value)
	{
		this.subTotalNull = value;
	}

	/**
	 * Method 'isSubTotalNull'
	 * 
	 * @return boolean
	 */
	public boolean isSubTotalNull()
	{
		return subTotalNull;
	}

	/**
	 * Method 'getGrandTotal'
	 * 
	 * @return double
	 */
	public double getGrandTotal()
	{
		return grandTotal;
	}

	/**
	 * Method 'setGrandTotal'
	 * 
	 * @param grandTotal
	 */
	public void setGrandTotal(double grandTotal)
	{
		this.grandTotal = grandTotal;
		this.grandTotalNull = false;
	}

	/**
	 * Method 'setGrandTotalNull'
	 * 
	 * @param value
	 */
	public void setGrandTotalNull(boolean value)
	{
		this.grandTotalNull = value;
	}

	/**
	 * Method 'isGrandTotalNull'
	 * 
	 * @return boolean
	 */
	public boolean isGrandTotalNull()
	{
		return grandTotalNull;
	}

	/**
	 * Method 'getProjectId'
	 * 
	 * @return int
	 */
	public int getProjectId()
	{
		return projectId;
	}

	/**
	 * Method 'setProjectId'
	 * 
	 * @param projectId
	 */
	public void setProjectId(int projectId)
	{
		this.projectId = projectId;
		this.projectIdNull = false;
	}

	/**
	 * Method 'setProjectIdNull'
	 * 
	 * @param value
	 */
	public void setProjectIdNull(boolean value)
	{
		this.projectIdNull = value;
	}

	/**
	 * Method 'isProjectIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isProjectIdNull()
	{
		return projectIdNull;
	}

	/**
	 * Method 'getBranchId'
	 * 
	 * @return int
	 */
	public int getBranchId()
	{
		return branchId;
	}

	/**
	 * Method 'setBranchId'
	 * 
	 * @param branchId
	 */
	public void setBranchId(int branchId)
	{
		this.branchId = branchId;
		this.branchIdNull = false;
	}

	/**
	 * Method 'setBranchIdNull'
	 * 
	 * @param value
	 */
	public void setBranchIdNull(boolean value)
	{
		this.branchIdNull = value;
	}

	/**
	 * Method 'isBranchIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isBranchIdNull()
	{
		return branchIdNull;
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
		
		if (!(_other instanceof Invoices)) {
			return false;
		}
		
		final Invoices _cast = (Invoices) _other;
		if (idinvoice != _cast.idinvoice) {
			return false;
		}
		
		if (invoiceDate == null ? _cast.invoiceDate != invoiceDate : !invoiceDate.equals( _cast.invoiceDate )) {
			return false;
		}
		
		if (isTrx != _cast.isTrx) {
			return false;
		}
		
		if (isTrxNull != _cast.isTrxNull) {
			return false;
		}
		
		if (validTo == null ? _cast.validTo != validTo : !validTo.equals( _cast.validTo )) {
			return false;
		}
		
		if (businessPartnetId != _cast.businessPartnetId) {
			return false;
		}
		
		if (businessPartnetIdNull != _cast.businessPartnetIdNull) {
			return false;
		}
		
		if (tax != _cast.tax) {
			return false;
		}
		
		if (taxNull != _cast.taxNull) {
			return false;
		}
		
		if (subTotal != _cast.subTotal) {
			return false;
		}
		
		if (subTotalNull != _cast.subTotalNull) {
			return false;
		}
		
		if (grandTotal != _cast.grandTotal) {
			return false;
		}
		
		if (grandTotalNull != _cast.grandTotalNull) {
			return false;
		}
		
		if (projectId != _cast.projectId) {
			return false;
		}
		
		if (projectIdNull != _cast.projectIdNull) {
			return false;
		}
		
		if (branchId != _cast.branchId) {
			return false;
		}
		
		if (branchIdNull != _cast.branchIdNull) {
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
		_hashCode = 29 * _hashCode + idinvoice;
		if (invoiceDate != null) {
			_hashCode = 29 * _hashCode + invoiceDate.hashCode();
		}
		
		_hashCode = 29 * _hashCode + isTrx;
		_hashCode = 29 * _hashCode + (isTrxNull ? 1 : 0);
		if (validTo != null) {
			_hashCode = 29 * _hashCode + validTo.hashCode();
		}
		
		_hashCode = 29 * _hashCode + businessPartnetId;
		_hashCode = 29 * _hashCode + (businessPartnetIdNull ? 1 : 0);
		long temp_tax = Double.doubleToLongBits(tax);
		_hashCode = 29 * _hashCode + (int) (temp_tax ^ (temp_tax >>> 32));
		_hashCode = 29 * _hashCode + (taxNull ? 1 : 0);
		long temp_subTotal = Double.doubleToLongBits(subTotal);
		_hashCode = 29 * _hashCode + (int) (temp_subTotal ^ (temp_subTotal >>> 32));
		_hashCode = 29 * _hashCode + (subTotalNull ? 1 : 0);
		long temp_grandTotal = Double.doubleToLongBits(grandTotal);
		_hashCode = 29 * _hashCode + (int) (temp_grandTotal ^ (temp_grandTotal >>> 32));
		_hashCode = 29 * _hashCode + (grandTotalNull ? 1 : 0);
		_hashCode = 29 * _hashCode + projectId;
		_hashCode = 29 * _hashCode + (projectIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + branchId;
		_hashCode = 29 * _hashCode + (branchIdNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return InvoicesPk
	 */
	public InvoicesPk createPk()
	{
		return new InvoicesPk(idinvoice);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.pm.app.dal.dto.Invoices: " );
		ret.append( "idinvoice=" + idinvoice );
		ret.append( ", invoiceDate=" + invoiceDate );
		ret.append( ", isTrx=" + isTrx );
		ret.append( ", validTo=" + validTo );
		ret.append( ", businessPartnetId=" + businessPartnetId );
		ret.append( ", tax=" + tax );
		ret.append( ", subTotal=" + subTotal );
		ret.append( ", grandTotal=" + grandTotal );
		ret.append( ", projectId=" + projectId );
		ret.append( ", branchId=" + branchId );
		return ret.toString();
	}

}
