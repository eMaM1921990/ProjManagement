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

public class TaskManagementDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return TaskManagementDao
	 */
	public static TaskManagementDao create()
	{
		return new TaskManagementDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return TaskManagementDao
	 */
	public static TaskManagementDao create(Connection conn)
	{
		return new TaskManagementDaoImpl( conn );
	}

}
