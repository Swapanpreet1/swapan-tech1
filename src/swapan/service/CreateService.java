package swapan.service;

import swapan.dao.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.codehaus.jackson.map.ObjectMapper;

import oauth.signpost.basic.DefaultOAuthConsumer;
import swapan.main.createmain;

public class CreateService {

		
		
		static CreateDao1 dao = new CreateDao1();

	        public static String hitEventUrl(String eventUrl) {
			String responseJson = "";
			try {
				DefaultOAuthConsumer e = new DefaultOAuthConsumer("swapan12345-152060", "gdrL1j76JtMGghX6");
				URL url = new URL(eventUrl);
				HttpURLConnection request = (HttpURLConnection)url.openConnection();
				request.setRequestProperty("Accept", "application/json");
				e.sign(request);
				int responseCode = request.getResponseCode();
				System.out.println("Sending \'GET\' request to URL : {} " +eventUrl);
				System.out.println("Response Code : {} " +Integer.valueOf(responseCode));
				BufferedReader in = new BufferedReader(new InputStreamReader(request.getInputStream()));
				StringBuffer response = new StringBuffer();
				String inputLine;
				while((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				
				in.close();
				responseJson = response.toString();
				System.out.println("Response json from app direct server is - {} " +responseJson);
				 createmain m = new createmain();
		        m = new ObjectMapper().readValue(responseJson, createmain.class);
		         System.out.println("check " + m.getAttribute());
			} catch (Exception var3) {
				System.out.println("Error fetching data from eventUrl - {} " +var3.getMessage());
			}
			return responseJson;
		}

}
