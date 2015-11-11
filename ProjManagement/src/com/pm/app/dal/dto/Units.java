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

public class Units implements Serializable
{
	/** 
	 * This attribute maps to the column idunits in the units table.
	 */
	protected int idunits;

	/** 
	 * This attribute maps to the column name in the units table.
	 */
	protected String name;

	/** 
	 * This attribute maps to the column conversion_rate in the units table.
	 */
	protected double conversionRate;

	/** 
	 * This attribute represents whether the primitive attribute conversionRate is null.
	 */
	protected boolean conversionRateNull = true;

	/** 
	 * This attribute maps to the column branch_id in the units table.
	 */
	protected int branchId;

	/** 
	 * This attribute represents whether the primitive attribute branchId is null.
	 */
	protected boolean branchIdNull = true;

	/**
	 * Method 'Units'
	 * 
	 */
	public Units()
	{
	}

	/**
	 * Method 'getIdunits'
	 * 
	 * @return int
	 */
	public int getIdunits()
	{
		return idunits;
	}

	/**
	 * Method 'setIdunits'
	 * 
	 * @param idunits
	 */
	public void setIdunits(int idunits)
	{
		this.idunits = idunits;
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
	 * Method 'getConversionRate'
	 * 
	 * @return double
	 */
	public double getConversionRate()
	{
		return conversionRate;
	}

	/**
	 * Method 'setConversionRate'
	 * 
	 * @param conversionRate
	 */
	public void setConversionRate(double conversionRate)
	{
		this.conversionRate = conversionRate;
		this.conversionRateNull = false;
	}

	/**
	 * Method 'setConversionRateNull'
	 * 
	 * @param value
	 */
	public void setConversionRateNull(boolean value)
	{
		this.conversionRateNull = value;
	}

	/**
	 * Method 'isConversionRateNull'
	 * 
	 * @return boolean
	 */
	public boolean isConversionRateNull()
	{
		return conversionRateNull;
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
		
		if (!(_other instanceof Units)) {
			return false;
		}
		
		final Units _cast = (Units) _other;
		if (idunits != _cast.idunits) {
			return false;
		}
		
		if (name == null ? _cast.name != name : !name.equals( _cast.name )) {
			return false;
		}
		
		if (conversionRate != _cast.conversionRate) {
			return false;
		}
		
		if (conversionRateNull != _cast.conversionRateNull) {
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
		_hashCode = 29 * _hashCode + idunits;
		if (name != null) {
			_hashCode = 29 * _hashCode + name.hashCode();
		}
		
		long temp_conversionRate = Double.doubleToLongBits(conversionRate);
		_hashCode = 29 * _hashCode + (int) (temp_conversionRate ^ (temp_conversionRate >>> 32));
		_hashCode = 29 * _hashCode + (conversionRateNull ? 1 : 0);
		_hashCode = 29 * _hashCode + branchId;
		_hashCode = 29 * _hashCode + (branchIdNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return UnitsPk
	 */
	public UnitsPk createPk()
	{
		return new UnitsPk(idunits);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.pm.app.dal.dto.Units: " );
		ret.append( "idunits=" + idunits );
		ret.append( ", name=" + name );
		ret.append( ", conversionRate=" + conversionRate );
		ret.append( ", branchId=" + branchId );
		return ret.toString();
	}

}