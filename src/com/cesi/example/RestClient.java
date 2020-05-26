package com.cesi.example;

import javax.annotation.ManagedBean;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

@ApplicationScoped
@Named(value = "restClient")
@ManagedBean
public class RestClient {

	public void call() {
		Client client = ClientBuilder.newClient();
		
		SimpleObject simpleObject = client.target("http://localhost:8282/RestExample/resources/MyRestService/simpleObject").request().get(SimpleObject.class);
		
		System.out.println(simpleObject);
	}
	
}
