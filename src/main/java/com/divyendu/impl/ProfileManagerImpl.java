package com.divyendu.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.TwitterProfile;
import org.springframework.social.twitter.api.impl.TwitterTemplate;
import org.springframework.stereotype.Service;

import com.divyendu.auth.AuthenticateClientDetails;

@Service
public class ProfileManagerImpl {
	
	@Autowired
	private AuthenticateClientDetails details;
	
	public TwitterProfile retrieveProfileData() {
		//Write the below 3 lines and autowire AuthenticateClientDetails in any place where we want to connect to twitter API with user credentials
		details.init();
		List<String> detailsList = details.constructAuthAndAccessArray(); //retrieve the user auth and access details from class as an array
		Twitter twitter = new TwitterTemplate(detailsList.get(0),detailsList.get(1),detailsList.get(2),detailsList.get(3));
		
		//Get user profile data
		TwitterProfile profile = twitter.userOperations().getUserProfile();
		System.out.println(profile.getScreenName()+" screen name");
		//can perform other operations before returning profile data of user
		
		return profile;
	}

}
