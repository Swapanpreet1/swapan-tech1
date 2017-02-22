package swapan.web;

import swapan.service.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import swapan.model.Sub;
import swapan.service.DeleteService;

public class CreateSubscription extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();

        String eventUrl = (String) request.getParameter("eventUrl");
        System.out.println(" URl "+ eventUrl);

        ObjectMapper mapper = new ObjectMapper();
        String hitUrl = CreateService.hitEventUrl(eventUrl);
        System.out.println("dummy url" + eventUrl);
	    System.out.println("hit url" + hitUrl);
        
        Sub s=new Sub();
        s.setAccountIdentifier("789xyz");
        s.setSuccess("true");
        String json1 = mapper.writeValueAsString(s);
        out.print(json1);
       
/*   
        BufferedReader reader = request.getReader();
        User user1 = mapper.readValue(reader, User.class);
*/

     //   TestJson testJson = new TestJson();
     //   testJson.setEventUrl(eventUrl);
//        testJson.setUser(user1);

     //   String json = mapper.writeValueAsString(testJson);
     //   out.print(json);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
    }



}
