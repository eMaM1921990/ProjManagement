/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.pm.app.dal.dao;

import com.pm.app.dal.dto.*;
import com.pm.app.dal.exceptions.*;

public interface InvoiceDetailsDao
{
	/** 
	 * Inserts a new row in the invoice_details table.
	 */
	public InvoiceDetailsPk insert(InvoiceDetails dto) throws InvoiceDetailsDaoException;

	/** 
	 * Updates a single row in the invoice_details table.
	 */
	public void update(InvoiceDetailsPk pk, InvoiceDetails dto) throws InvoiceDetailsDaoException;

	/** 
	 * Deletes a single row in the invoice_details table.
	 */
	public void delete(InvoiceDetailsPk pk) throws InvoiceDetailsDaoException;

	/** 
	 * Returns the rows from the invoice_details table that matches the specified primary-key value.
	 */
	public InvoiceDetails findByPrimaryKey(InvoiceDetailsPk pk) throws InvoiceDetailsDaoException;

	/** 
	 * Returns all rows from the invoice_details table that match the criteria 'idinvoice_details = :idinvoiceDetails'.
	 */
	public InvoiceDetails findByPrimaryKey(int idinvoiceDetails) throws InvoiceDetailsDaoException;

	/** 
	 * Returns all rows from the invoice_details table that match the criteria ''.
	 */
	public InvoiceDetails[] findAll() throws InvoiceDetailsDaoException;

	/** 
	 * Returns all rows from the invoice_details table that match the criteria 'invoice_id = :invoiceId'.
	 */
	public InvoiceDetails[] findByInvoices(int invoiceId) throws InvoiceDetailsDaoException;

	/** 
	 * Returns all rows from the invoice_details table that match the criteria 'item_id = :itemId'.
	 */
	public InvoiceDetails[] findByItems(int itemId) throws InvoiceDetailsDaoException;

	/** 
	 * Returns all rows from the invoice_details table that match the criteria 'unit_id = :unitId'.
	 */
	public InvoiceDetails[] findByUnits(int unitId) throws InvoiceDetailsDaoException;

	/** 
	 * Returns all rows from the invoice_details table that match the criteria 'idinvoice_details = :idinvoiceDetails'.
	 */
	public InvoiceDetails[] findWhereIdinvoiceDetailsEquals(int idinvoiceDetails) throws InvoiceDetailsDaoException;

	/** 
	 * Returns all rows from the invoice_details table that match the criteria 'invoice_id = :invoiceId'.
	 */
	public InvoiceDetails[] findWhereInvoiceIdEquals(int invoiceId) throws InvoiceDetailsDaoException;

	/** 
	 * Returns all rows from the invoice_details table that match the criteria 'item_id = :itemId'.
	 */
	public InvoiceDetails[] findWhereItemIdEquals(int itemId) throws InvoiceDetailsDaoException;

	/** 
	 * Returns all rows from the invoice_details table that match the criteria 'unit_id = :unitId'.
	 */
	public InvoiceDetails[] findWhereUnitIdEquals(int unitId) throws InvoiceDetailsDaoException;

	/** 
	 * Returns all rows from the invoice_details table that match the criteria 'price = :price'.
	 */
	public InvoiceDetails[] findWherePriceEquals(double price) throws InvoiceDetailsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the invoice_details table that match the specified arbitrary SQL statement
	 */
	public InvoiceDetails[] findByDynamicSelect(String sql, Object[] sqlParams) throws InvoiceDetailsDaoException;

	/** 
	 * Returns all rows from the invoice_details table that match the specified arbitrary SQL statement
	 */
	public InvoiceDetails[] findByDynamicWhere(String sql, Object[] sqlParams) throws InvoiceDetailsDaoException;

}
