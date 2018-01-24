

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	response.setContentType("text/html");  
	PrintWriter out = response.getWriter();          
	String n=request.getParameter("userName");  
	String p=request.getParameter("userPass");  
	String e=request.getParameter("userEmail");  
	String c=request.getParameter("userCountry");  
	          
	try{  
		DBConnector dbc=new DBConnector();
		Connection con=dbc.getConnection();
		MatrimonyRegisterUser reg = new MatrimonyRegisterUser(con);
	    
		RegisterUser user = new RegisterUser(n,p,e,c);
		reg.createUser(user);
		out.print("Registration Successful ");
		out.close();
	          
	}catch (Exception e2) {System.out.println(e2);}  
	          
	out.close();  
	}  
	  
	} 