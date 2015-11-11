/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.pm.app.dal.factory;

import java.sql.Connection;
import com.pm.app.dal.dao.*;
import com.pm.app.dal.jdbc.*;

public class QouteDetailsDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return QouteDetailsDao
	 */
	public static QouteDetailsDao create()
	{
		return new QouteDetailsDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return QouteDetailsDao
	 */
	public static QouteDetailsDao create(Connection conn)
	{
		return new QouteDetailsDaoImpl( conn );
	}

}
