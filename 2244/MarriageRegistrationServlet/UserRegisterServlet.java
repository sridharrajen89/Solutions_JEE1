package com.htc.servletExercise;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserRegisterServlet
 */
@WebServlet("/UserRegisterServlet")
public class UserRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegisterServlet() {
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

		// TODO Auto-generated method stub
		try
		{
			IRegisterUserServiceProvider registeruser = new MatrimonyRegisterUser();
			PrintWriter printwriter=response.getWriter();	
	        String PersonName = request.getParameter("name");
	        System.out.println(PersonName);
	        String DOB=request.getParameter("dob");
	        System.out.println(DOB);
	        String gender=request.getParameter("gender");
	        System.out.println(gender);
	        String picureloc=request.getParameter("picureloc");
	        System.out.println(picureloc);
	        String Profession=request.getParameter("profession");
	        System.out.println(Profession);
	        String emailID=request.getParameter("emailID");
	        System.out.println(emailID);
	        String password=request.getParameter("password");
	        System.out.println(password);
	        UserRegistration userregistration = new UserRegistration(PersonName,DOB,gender,picureloc,Profession,emailID,password);
	        registeruser.createUser(userregistration);       
	        printwriter.println("User Successfully Registered.."+emailID+ " is your UserID");
		}
		catch(Exception e)
		{
			System.out.println(e);

		}

	}

}
