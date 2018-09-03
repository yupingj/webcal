package com.mletech.webapp.services;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class Calculator {
	
	Client client = ClientBuilder.newClient();
	String urlString = "http://localhost:9080/com.mltech.webservice/rest/webcal/";

	public int add(int a, int b) {
		
		 Client client = ClientBuilder.newClient();
		  WebTarget target = client.target(urlString);	
		 
		  
		  String result = target.path("/add/"+String.valueOf(a)+"/"+String.valueOf(b)).request(MediaType.TEXT_PLAIN).get(String.class);
		
		return Integer.parseInt(result);
	}

	public int minus(int a, int b) {
		return a - b;
	}

	public int times(int a, int b) {
		return a * b;
	}

	public int divid(int a, int b) {
		return a/b;
	}

}
