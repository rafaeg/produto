package br.com.empresa.applicationConfig;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api")
public class MyApplication extends ResourceConfig{
	
	public MyApplication() {
		packages("br.com.empresa.service");
	}
	
}
