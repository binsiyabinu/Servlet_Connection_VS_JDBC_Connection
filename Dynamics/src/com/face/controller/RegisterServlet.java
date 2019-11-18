package com.face.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.RegisterBO;
import com.face.dao.RegisterDAO;
import com.face.util.ConnectionManager;

/**
 * Author Binsiya 
 * Action Servlet implementation class to perform user Registration
 * @Date 14-11-2019
 * @category controller class	
 */

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    ConnectionManager conn = new ConnectionManager();
	/**
	 * @implSpec-> action method to register customer with database
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		//getting the parameters using names 
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String number=request.getParameter("num");
		String password=request.getParameter("password");
		
		RegisterBO regbo = new RegisterBO();
		
		regbo.setFname(fname);
		regbo.setLname(lname);
		regbo.setEmail(email);
		regbo.setNumber(number);
		regbo.setPassword(password);
		
		
			try {
				RegisterDAO.Save(conn.getConnection(), regbo);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	
	
	
	



