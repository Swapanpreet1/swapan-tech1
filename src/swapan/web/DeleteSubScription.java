package swapan.web;

import swapan.model.*;
import swapan.service.*;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.codehaus.jackson.map.ObjectMapper;

public class DeleteSubScription extends HttpServlet {

	 
	  
	  protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException
	  {
	    response.setContentType("application/json");
	    PrintWriter out = response.getWriter();
	    String eventUrl = request.getParameter("eventUrl");
	    
	    ObjectMapper mapper = new ObjectMapper();
	    
	    String hitUrl = DeleteService.hitEventUrl(eventUrl);
	    
	    Sub s = new Sub();
	    System.out.println("dummy url" + eventUrl);
	    System.out.println("hit url" + hitUrl);
	    
	    s.setAccountIdentifier("xyzz");
	    s.setSuccess("true");
	    
	    String json = mapper.writeValueAsString(s);
	    out.print(json);
	  }
	  protected void doPost(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException
			  {}
}
