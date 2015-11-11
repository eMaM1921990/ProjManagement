package com.pm.app.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pm.app.business.businessDelegate;
import com.pm.app.dal.dto.Sysusers;
import com.pm.app.dal.dto.Users;
import com.pm.app.web.common.LoginParamterValidate;

/**
 * Servlet implementation class doLogin
 */
@WebServlet("/doLogin")
public class doLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public doLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			String url="index.jsp";
			businessDelegate businessObj=new businessDelegate();
			String username=request.getParameter("username").trim().toLowerCase();
			String password=request.getParameter("password").trim().toLowerCase();
			Users dto=new Users();
			dto.setUsername(username);
			dto.setPassword(password);
			LoginParamterValidate param=new LoginParamterValidate();
			if(param.IsAccepted(dto)){
				Sysusers userdto=new Sysusers();
				userdto.setUsername(username);
				userdto.setPassword(password);
				Sysusers userLoginData=businessObj.appLogin(userdto);
				if(userLoginData!=null){
					url="Dashboard";
					HttpSession session=request.getSession();
					session.setAttribute("login", userLoginData);
				}
			}
			
			RequestDispatcher redirect=request.getRequestDispatcher(url);
			redirect.forward(request, response);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
