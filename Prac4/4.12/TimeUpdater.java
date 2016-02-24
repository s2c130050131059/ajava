import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class TimeUpdater extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		res.setContentType("text/html");
		PrintWriter p = res.getWriter();
		
		res.setIntHeader("Refresh",1);
		p.println("<h1>Updating time every second</h1>");
		Date  date=new Date();
		p.println("<h>"+date.toString()+"</h3>");
	}
}