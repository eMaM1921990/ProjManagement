package com.pm.app.web.viewer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pm.app.business.businessDelegate;
import com.pm.app.dal.dto.BusinessPartnerType;

/**
 * Servlet implementation class BPadd
 */
@WebServlet("/BPadd")
public class BPadd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BPadd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		view(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		view(request, response);
	}
	
	protected void view(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			businessDelegate businessObj=new businessDelegate();
			BusinessPartnerType[] data=businessObj.getBusinessPartnerType();
			request.setAttribute("data", data);
			RequestDispatcher redirect=request.getRequestDispatcher("/settingMenu/bp/add.jsp");
			redirect.forward(request, response);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
