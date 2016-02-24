import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class SendRedirect extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter p = res.getWriter();
		
		String s1=req.getParameter("name");
		String s2=req.getParameter("pass");
		
		if(s2.equals("avinpatel")){
			p.println("Welcome, "+s1);
		}
		else{
			res.sendRedirect("login.html");
		}
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		doGet(req,res);
	}
}