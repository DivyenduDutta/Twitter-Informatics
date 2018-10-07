package com.divyendu.beans;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDataBean {
	
	private String screenName;
	private String following;
	private String followers;
	private String numberOfTweets;
	private String accountCreationDate;
	private String numberOfFavTweets;
	private List<CustomTweetBean> tweets;

	
	
	public UserDataBean() {}
	
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public String getFollowing() {
		return following;
	}
	public void setFollowing(String following) {
		this.following = following;
	}
	public String getFollowers() {
		return followers;
	}
	public void setFollowers(String followers) {
		this.followers = followers;
	}
	public String getNumberOfTweets() {
		return numberOfTweets;
	}
	public void setNumberOfTweets(String numberOfTweets) {
		this.numberOfTweets = numberOfTweets;
	}
	public String getAccountCreationDate() {
		return accountCreationDate;
	}
	public void setAccountCreationDate(String accountCreationDate) {
		this.accountCreationDate = accountCreationDate;
	}
	public String getNumberOfFavTweets() {
		return numberOfFavTweets;
	}
	public void setNumberOfFavTweets(String numberOfFavTweets) {
		this.numberOfFavTweets = numberOfFavTweets;
	}

	public List<CustomTweetBean> getTweets() {
		return tweets;
	}

	public void setTweets(List<CustomTweetBean> tweets) {
		this.tweets = tweets;
	}
	
	
	

}
