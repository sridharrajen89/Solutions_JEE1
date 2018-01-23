package com.htc.ureg;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserRegServlet
 */
@WebServlet("/UserRegServlet")
public class UserRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegServlet() {
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
		//doGet(request, response);
		try
		{
		IRegisterUserServiceProvider IRUS = new MatrimonyRegUser();
        String PersonName = request.getParameter("name");
        System.out.println(PersonName);
        String DOB=request.getParameter("dob");
        System.out.println(DOB);
        String gender=request.getParameter("gender");
        System.out.println(gender);
        String picslocation=request.getParameter("picsloc");
        System.out.println(picslocation);
        String Profession=request.getParameter("profession");
        System.out.println(Profession);
        String email=request.getParameter("email");
        System.out.println(email);
        String password=request.getParameter("password");
        System.out.println(password);
        UserRegistration ur = new UserRegistration(PersonName,DOB,gender,picslocation,Profession,email,password);
        IRUS.createUser(ur);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
