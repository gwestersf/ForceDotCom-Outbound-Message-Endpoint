package com.heroku.crm;

import javax.xml.ws.Endpoint;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class HerokuApp {
	 public static void main(String[] args) throws Exception {
	  String webPort = System.getenv("PORT");
	  String webappDirLocation = "src/main/webapp/";
	 
	  if(webPort == null || webPort.isEmpty()) {
	        webPort = "8443";
	  }
	  
	  Server server = new Server(Integer.valueOf(webPort));
	     WebAppContext root = new WebAppContext();
	     root.setContextPath("/");
	     root.setDescriptor(webappDirLocation+"/WEB-INF/web.xml");
	     root.setResourceBase(webappDirLocation);
	     root.setParentLoaderPriority(true);
	 
	     Endpoint.publish("http://localhost:" + webPort + "/payment", new CrmService());
	     
	     server.setHandler(root);
	     server.start();
	     server.join(); 
    }
    
}
