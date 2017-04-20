

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Form1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<body bgcolor=pink>");
		out.println("<form action=Form2><h1>");
		out.println("Name<input type=text name=t1 size=30><br>");
		out.println("Age<input type=text name=t2 size=30><br>");
		out.println("Address<input type=text name=t3 size=30><br>");
		out.println("<input type=submit value=SUBMIT>");
		out.println("</form></body>");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
