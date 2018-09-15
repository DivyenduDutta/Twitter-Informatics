package com.divyendu.githubProject.config;

import org.springframework.core.env.Environment;
import org.springframework.social.UserIdSource;
import org.springframework.social.config.annotation.ConnectionFactoryConfigurer;
import org.springframework.social.config.annotation.SocialConfigurer;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.twitter.connect.TwitterConnectionFactory;

public class SocialConfig implements SocialConfigurer {

	@Override
	public void addConnectionFactories(ConnectionFactoryConfigurer connFacConfig, Environment env) {
		//Register Twitter Connection Factory
		connFacConfig.addConnectionFactory(new TwitterConnectionFactory(
				env.getProperty("twitter.consumerKey"), 
				env.getProperty("twitter.consumerSecret")));

	}

	@Override
	public UserIdSource getUserIdSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsersConnectionRepository getUsersConnectionRepository(ConnectionFactoryLocator arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
