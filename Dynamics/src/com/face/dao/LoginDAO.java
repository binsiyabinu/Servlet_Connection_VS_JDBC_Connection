package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import javax.swing.JOptionPane;

import com.face.bo.LoginBO;
import com.face.bo.RegisterBO;

public class LoginDAO {
	
	
	public static boolean loginCheck(Connection connection,LoginBO loginbo,RegisterBO regbo) throws SQLException
	{
	boolean status = false;

	Statement statement1 = connection.createStatement();

	String q="select * from web_register";
	ResultSet rs=statement1.executeQuery(q);
	while(rs.next())
	{
	if(loginbo.getUname().equals(rs.getString("email")) && (loginbo.getPass().equals(rs.getString("password"))))
	{
	System.out.println("successfully login");
	//JOptionPane.showMessageDialog(null, " \nSuccessful login\n");
	status = true;
	
	regbo.setFname(rs.getString("fname"));
	regbo.setLname(rs.getString("lname"));
	regbo.setEmail(rs.getString("email"));
	regbo.setNumber(rs.getString("phone"));
	regbo.setPassword(rs.getString("password"));
	}
	}
	if(status==false)
	{
		System.out.println("Invalid username or password!");
	}
	return status;
	}
	
}	


