import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HolisticCounter extends HttpServlet {

	static int classcount=0;
	int count=0;
	static Hashtable i=new Hashtable();
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter p=response.getWriter();
		
		Date  date=new Date();
		p.println("<h1>"+date.toString()+"</h1>");
		
		count++;
		p.println("This page is accessed "+count+" times");
		
		i.put(this,this);
		p.println("There are currently "+i.size()+"threads");
	}
}