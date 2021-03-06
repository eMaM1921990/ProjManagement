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

public class BpView implements Serializable
{
	/** 
	 * This attribute maps to the column idbusiness_partner in the bp_view table.
	 */
	protected int idbusinessPartner;

	/** 
	 * This attribute maps to the column name in the bp_view table.
	 */
	protected String name;

	/** 
	 * This attribute maps to the column address in the bp_view table.
	 */
	protected String address;

	/** 
	 * This attribute maps to the column phone in the bp_view table.
	 */
	protected String phone;

	/** 
	 * This attribute maps to the column working_as in the bp_view table.
	 */
	protected int workingAs;

	/** 
	 * This attribute represents whether the primitive attribute workingAs is null.
	 */
	protected boolean workingAsNull = true;

	/** 
	 * This attribute maps to the column branch_id in the bp_view table.
	 */
	protected int branchId;

	/** 
	 * This attribute represents whether the primitive attribute branchId is null.
	 */
	protected boolean branchIdNull = true;

	/** 
	 * This attribute maps to the column idbusiness_partner_type in the bp_view table.
	 */
	protected int idbusinessPartnerType;

	/** 
	 * This attribute maps to the column type in the bp_view table.
	 */
	protected String type;

	/**
	 * Method 'BpView'
	 * 
	 */
	public BpView()
	{
	}

	/**
	 * Method 'getIdbusinessPartner'
	 * 
	 * @return int
	 */
	public int getIdbusinessPartner()
	{
		return idbusinessPartner;
	}

	/**
	 * Method 'setIdbusinessPartner'
	 * 
	 * @param idbusinessPartner
	 */
	public void setIdbusinessPartner(int idbusinessPartner)
	{
		this.idbusinessPartner = idbusinessPartner;
	}

	/**
	 * Method 'getName'
	 * 
	 * @return String
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Method 'setName'
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Method 'getAddress'
	 * 
	 * @return String
	 */
	public String getAddress()
	{
		return address;
	}

	/**
	 * Method 'setAddress'
	 * 
	 * @param address
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}

	/**
	 * Method 'getPhone'
	 * 
	 * @return String
	 */
	public String getPhone()
	{
		return phone;
	}

	/**
	 * Method 'setPhone'
	 * 
	 * @param phone
	 */
	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	/**
	 * Method 'getWorkingAs'
	 * 
	 * @return int
	 */
	public int getWorkingAs()
	{
		return workingAs;
	}

	/**
	 * Method 'setWorkingAs'
	 * 
	 * @param workingAs
	 */
	public void setWorkingAs(int workingAs)
	{
		this.workingAs = workingAs;
		this.workingAsNull = false;
	}

	/**
	 * Method 'setWorkingAsNull'
	 * 
	 * @param value
	 */
	public void setWorkingAsNull(boolean value)
	{
		this.workingAsNull = value;
	}

	/**
	 * Method 'isWorkingAsNull'
	 * 
	 * @return boolean
	 */
	public boolean isWorkingAsNull()
	{
		return workingAsNull;
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
	 * Method 'getIdbusinessPartnerType'
	 * 
	 * @return int
	 */
	public int getIdbusinessPartnerType()
	{
		return idbusinessPartnerType;
	}

	/**
	 * Method 'setIdbusinessPartnerType'
	 * 
	 * @param idbusinessPartnerType
	 */
	public void setIdbusinessPartnerType(int idbusinessPartnerType)
	{
		this.idbusinessPartnerType = idbusinessPartnerType;
	}

	/**
	 * Method 'getType'
	 * 
	 * @return String
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * Method 'setType'
	 * 
	 * @param type
	 */
	public void setType(String type)
	{
		this.type = type;
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
		
		if (!(_other instanceof BpView)) {
			return false;
		}
		
		final BpView _cast = (BpView) _other;
		if (idbusinessPartner != _cast.idbusinessPartner) {
			return false;
		}
		
		if (name == null ? _cast.name != name : !name.equals( _cast.name )) {
			return false;
		}
		
		if (address == null ? _cast.address != address : !address.equals( _cast.address )) {
			return false;
		}
		
		if (phone == null ? _cast.phone != phone : !phone.equals( _cast.phone )) {
			return false;
		}
		
		if (workingAs != _cast.workingAs) {
			return false;
		}
		
		if (workingAsNull != _cast.workingAsNull) {
			return false;
		}
		
		if (branchId != _cast.branchId) {
			return false;
		}
		
		if (branchIdNull != _cast.branchIdNull) {
			return false;
		}
		
		if (idbusinessPartnerType != _cast.idbusinessPartnerType) {
			return false;
		}
		
		if (type == null ? _cast.type != type : !type.equals( _cast.type )) {
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
		_hashCode = 29 * _hashCode + idbusinessPartner;
		if (name != null) {
			_hashCode = 29 * _hashCode + name.hashCode();
		}
		
		if (address != null) {
			_hashCode = 29 * _hashCode + address.hashCode();
		}
		
		if (phone != null) {
			_hashCode = 29 * _hashCode + phone.hashCode();
		}
		
		_hashCode = 29 * _hashCode + workingAs;
		_hashCode = 29 * _hashCode + (workingAsNull ? 1 : 0);
		_hashCode = 29 * _hashCode + branchId;
		_hashCode = 29 * _hashCode + (branchIdNull ? 1 : 0);
		_hashCode = 29 * _hashCode + idbusinessPartnerType;
		if (type != null) {
			_hashCode = 29 * _hashCode + type.hashCode();
		}
		
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
		ret.append( "com.pm.app.dal.dto.BpView: " );
		ret.append( "idbusinessPartner=" + idbusinessPartner );
		ret.append( ", name=" + name );
		ret.append( ", address=" + address );
		ret.append( ", phone=" + phone );
		ret.append( ", workingAs=" + workingAs );
		ret.append( ", branchId=" + branchId );
		ret.append( ", idbusinessPartnerType=" + idbusinessPartnerType );
		ret.append( ", type=" + type );
		return ret.toString();
	}

}
