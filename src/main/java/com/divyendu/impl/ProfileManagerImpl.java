package com.divyendu.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.TwitterProfile;
import org.springframework.social.twitter.api.impl.TwitterTemplate;
import org.springframework.stereotype.Service;

import com.divyendu.auth.AuthenticateClientDetails;
import com.divyendu.beans.UserDataBean;
import com.divyendu.mappers.UserDataMapper;

@Service
public class ProfileManagerImpl {
	
	@Autowired
	private AuthenticateClientDetails details;
	
	@Autowired
	private UserDataBean userDataBean;
	
	@Autowired
	private UserDataMapper userDataMapper;
	
	//Ensure name passed as parameter is not empty from UI
	public UserDataBean retrieveProfileData(String name) {
		//Write the below 3 lines and autowire AuthenticateClientDetails in any place where we want to connect to twitter API with user credentials
		details.init();
		List<String> detailsList = details.constructAuthAndAccessArray(); //retrieve the user auth and access details from class as an array
		Twitter twitter = new TwitterTemplate(detailsList.get(0),detailsList.get(1),detailsList.get(2),detailsList.get(3));
		
		//Get user profile data
		TwitterProfile profile = twitter.userOperations().getUserProfile(name);
		System.out.println(profile.getScreenName()+" screen name");
		
		//Get user profile tweets
		List<Tweet> tweets = twitter.timelineOperations().getUserTimeline(name);

		//Mapping user General Profile data to user data bean
		userDataMapper.mapUserGeneralInfo(profile, userDataBean);
		
		//Mapping user latest 10 tweets to user data bean
		userDataBean.setTweets(userDataMapper.mapUserTweets(tweets));
		
		return userDataBean;
	}

}
