package com.pm.app.web.viewer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pm.app.business.businessDelegate;
import com.pm.app.dal.dto.BpView;
import com.pm.app.dal.dto.BusinessPartner;
import com.pm.app.dal.dto.Sysusers;

/**
 * Servlet implementation class BPview
 */
@WebServlet("/BPview")
public class BPview extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BPview() {
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

	protected void view(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try{
			HttpSession session=request.getSession();
			Sysusers loginData=(Sysusers)session.getAttribute("login");
			businessDelegate businessObj=new businessDelegate();
			BpView[] data=businessObj.getBranchParnter(loginData.getBranchId());
			request.setAttribute("data", data);
			RequestDispatcher redirect=request.getRequestDispatcher("/settingMenu/bp/view.jsp");
			redirect.forward(request, response);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
