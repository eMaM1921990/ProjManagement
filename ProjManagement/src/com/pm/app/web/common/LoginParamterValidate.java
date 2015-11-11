package com.pm.app.web.common;

import com.pm.app.dal.dto.Users;

public class LoginParamterValidate {

	public boolean IsAccepted(Users dto){
		if(dto.getUsername().length()>0 && dto.getPassword().length()>0){
			return true;
		}else{
			return false;
		}
	}
}
