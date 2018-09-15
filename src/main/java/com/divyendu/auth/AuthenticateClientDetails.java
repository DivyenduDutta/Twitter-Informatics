package com.divyendu.auth;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:app.properties")
public class AuthenticateClientDetails {
	
	@Resource
    public Environment env; 
	
	private String consumerKey;
	private String consumerSecret;
	private String accessToken;
	private String accessTokenSecret;
	
	@PostConstruct
	public void init(){
		//initialize the authentication and access variables from app.properties
		System.out.println(env);
		this.consumerKey = env.getProperty("twitter.consumerKey"); // The application's consumer key
		this.consumerSecret = env.getProperty("twitter.consumerSecret"); // The application's consumer secret
		this.accessToken = env.getProperty("twitter.accessToken"); // The access token granted after OAuth authorization
		this.accessTokenSecret = env.getProperty("twitter.accessTokenSecret"); // The access token secret granted after OAuth authorization
	}
	
	public AuthenticateClientDetails() {
		System.out.println("Creating AuthenticateClientDetails object");
	}
	
	
	
	public String getConsumerKey() {
		return consumerKey;
	}



	public String getConsumerSecret() {
		return consumerSecret;
	}



	public String getAccessToken() {
		return accessToken;
	}



	public String getAccessTokenSecret() {
		return accessTokenSecret;
	}



	public List<String> constructAuthAndAccessArray() {
		List<String> details = new ArrayList<String>();
		details.add(getConsumerKey());
		details.add(getConsumerSecret());
		details.add(getAccessToken());
		details.add(getAccessTokenSecret());
		
		return details;
	}
	
	
	
	

}
