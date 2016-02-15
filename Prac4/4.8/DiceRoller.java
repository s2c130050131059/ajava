import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class DiceRoller extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		res.setContentType("text/html");
		PrintWriter p = res.getWriter();
		
		int dice1,dice2,t;
		dice1=(int)(Math.random()*6)+1;
		dice2=(int)(Math.random()*6)+1;
		t=dice1+dice2;
		
		p.println("<html><body>");
		p.println("<font size=6 color=green>Value of dice 1 = "+dice1+" & dice 2 = "+dice2+"</font><br></br>");
		p.println("Total value of dice = "+t);
		p.println("</body></html>");
	}
}