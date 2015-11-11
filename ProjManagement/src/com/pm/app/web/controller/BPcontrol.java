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
import com.pm.app.dal.dto.BusinessPartner;
import com.pm.app.dal.dto.BusinessPartnerPk;
import com.pm.app.dal.dto.Sysusers;

/**
 * Servlet implementation class BPcontrol
 */
@WebServlet("/BPcontrol")
public class BPcontrol extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BPcontrol() {
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
			HttpSession session=request.getSession();
			Sysusers loginData=(Sysusers)session.getAttribute("login");
			String action=request.getParameter("control");
			String url="BPview";
			if(action.equals("new")){
				String name=request.getParameter("name").trim();
				String address=request.getParameter("address").trim();
				String phone=request.getParameter("phone").trim();
				String working_as=request.getParameter("working_as");
				
				
				BusinessPartner dto=new BusinessPartner();
				dto.setName(name);
				dto.setPhone(phone);
				dto.setAddress(address);
				dto.setWorkingAs(Integer.valueOf(working_as));
				dto.setBranchId(loginData.getBranchId());
				
				businessDelegate businessObj=new businessDelegate();
				BusinessPartnerPk pk=businessObj.createBusinessPartner(dto);
				if(pk!=null){
					url="BPview";
					request.setAttribute("msg", "saved");
				}else{
					url="BPadd";
					request.setAttribute("msg", "[#10]error during save");
				}
						
				
			}else if(action.equals("delete")){
				String id=request.getParameter("id");
				BusinessPartnerPk pk=new BusinessPartnerPk(Integer.valueOf(id));
				businessDelegate businessObj=new businessDelegate();
				int rowEffected=businessObj.deleteBusinessPartner(pk);
				if(rowEffected>0){
					
					request.setAttribute("msg", "deleted");
				}else{
					request.setAttribute("msg", "[#10] error during delete");
				}
				url="BPview";
				
			}else if(action.equals("edit")){
				String name=request.getParameter("name").trim();
				String address=request.getParameter("address").trim();
				String phone=request.getParameter("phone").trim();
				String working_as=request.getParameter("working_as");
				String id=request.getParameter("id");
				BusinessPartner dto=new BusinessPartner();
				dto.setName(name);
				dto.setPhone(phone);
				dto.setAddress(address);
				dto.setWorkingAs(Integer.valueOf(working_as));
				dto.setIdbusinessPartner(Integer.valueOf(id));
				dto.setBranchId(loginData.getBranchId());
				BusinessPartnerPk pk=new BusinessPartnerPk();
				pk.setIdbusinessPartner(Integer.valueOf(id));
				businessDelegate businessObj=new businessDelegate();
				int rowEffected=businessObj.updateBusinessPartner(pk, dto);
				if(rowEffected>0){
					url="BPview";
					request.setAttribute("msg", "updated");
				}else{
					url="BPedit";
					request.setAttribute("msg", "[#10] error during update");
				}
	
			}else if(action.equals("edit_redirect")){
				url="BPedit";
			}
			RequestDispatcher redirect=request.getRequestDispatcher(url);
			redirect.forward(request, response);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
