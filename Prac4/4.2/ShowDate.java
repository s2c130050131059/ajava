import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class ShowDate extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter p = res.getWriter();
		Date  date=new Date();
		p.println("<h1>"+date.toString()+"</h1>");
	}
}