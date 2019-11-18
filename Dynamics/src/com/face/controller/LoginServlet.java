package com.face.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.LoginBO;
import com.face.bo.RegisterBO;
import com.face.dao.LoginDAO;
import com.face.util.ConnectionManager;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        
    }
    
    ConnectionManager conn = new ConnectionManager();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		
		//getting the parameters using names 
		String uname=request.getParameter("uname");
		
		String pass=request.getParameter("pass");
		
		LoginBO loginbo = new LoginBO();
		RegisterBO regbo = new RegisterBO();
		
		loginbo.setUname(uname);
		loginbo.setPass(pass);
		
		try {
			boolean status = LoginDAO.loginCheck(conn.getConnection(), loginbo , regbo);
			
			List loginList = new ArrayList();
			
		
			loginList.add(regbo.getFname());
			loginList.add(regbo.getLname());
			loginList.add(regbo.getEmail());
			loginList.add(regbo.getNumber());
			loginList.add(regbo.getPassword());
			
			
			request.setAttribute("data", status);
			request.setAttribute("data1", loginList);
			
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			 if (dispatcher != null) {
			       dispatcher.forward(request, response);
			 }
			 
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
