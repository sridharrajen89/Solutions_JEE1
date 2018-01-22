package com.register.classes;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.postgresql.util.PSQLException;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDAO user;
	int personId=0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
		try {
			
			IRegisterLoginUserServiceProvider irsp = new MatrimonyRegisterUser();
			
			String PersonName = request.getParameter("name");
			java.util.Date date = new SimpleDateFormat("yyyy-mm-dd").parse(request.getParameter("dob"));
			Date DOB=new java.sql.Date(date.getTime());
	        String gender=request.getParameter("gender");
	        String Proffesion=request.getParameter("profession");
	        String email=request.getParameter("email");
	        String password=request.getParameter("password");
	        
	        Person person = new Person(personId+1,PersonName, DOB,gender,Proffesion,email,password);
			
	        if(irsp.createUser(person))
	        {
	        	response.setContentType("text/html");
	        	response.getWriter().println("<h2> Thank You For Registration </h2> ");
				response.getWriter().println("<h2> !!!!!!!   Registration Sucessful !!!!!!!!!!! </h2> ");
				response.getWriter().println("<a href='./index.html'> Login Again </a>");
	        	
	        }
		} catch(PSQLException e) {
			response.setContentType("text/html");
			response.getWriter().println("<h2> Registration Failure , Email Already Present </h2> ");
			response.getWriter().println("<a href='./login.html'> Login Again </a>");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
