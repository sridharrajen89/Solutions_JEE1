package com.register.classes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			IRegisterLoginUserServiceProvider irsp = new MatrimonyRegisterUser();
			boolean valid = irsp.ValidateUser(request.getParameter("username"), request.getParameter("password"));
			
			if(valid)
			{
				response.setContentType("text/html");
				response.getWriter().println("<h2> Registration Sucessful , Welcome to Homepage </h2> ");
				
			}
			else
			{
				response.setContentType("text/html");
				response.getWriter().println("<h2> Invalid Creditinals  , Login with valid details  </h2> ");
				response.getWriter().println("<a href='./login.html'> Login Again </a>");
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
