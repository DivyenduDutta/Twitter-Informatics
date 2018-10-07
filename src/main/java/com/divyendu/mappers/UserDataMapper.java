package com.divyendu.mappers;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.TwitterProfile;
import org.springframework.stereotype.Component;

import com.divyendu.beans.CustomTweetBean;
import com.divyendu.beans.UserDataBean;

@Component
public class UserDataMapper {
	
	public void mapUserGeneralInfo(TwitterProfile profile, UserDataBean userDataBean) {
		//Map General info of the user to the bean
		userDataBean.setScreenName(profile.getScreenName());
		userDataBean.setFollowing(Integer.toString(profile.getFriendsCount()));
		userDataBean.setFollowers(Integer.toString(profile.getFollowersCount()));
		userDataBean.setNumberOfTweets(Integer.toString(profile.getStatusesCount()));
		
		Format formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date myAccountCreationDate = profile.getCreatedDate();
		String accountCreationDate = formatter.format(myAccountCreationDate);
		userDataBean.setAccountCreationDate(accountCreationDate);
		
		userDataBean.setNumberOfFavTweets(Integer.toString(profile.getFavoritesCount()));
		
	}
	
	public List<CustomTweetBean> mapUserTweets(List<Tweet> tweets) {
		//This can be further used to map other list of tweets like mentions of the user etc.
		//Mapping from Tweet class to custom tweet class since a lot of the info is not needed, we can reduce size of response
		
		List<CustomTweetBean> customTweets = new ArrayList<CustomTweetBean>();
		
		for(Tweet tweet: tweets) {
			CustomTweetBean myTweet = new CustomTweetBean();
			myTweet.setTweetContent(tweet.getText());
			myTweet.setRetweeted(tweet.isRetweeted());
			myTweet.setRetweetCount(Integer.toString(tweet.getRetweetCount()));
			myTweet.setFavorited(tweet.isFavorited());
			myTweet.setFavoritedCount(Integer.toString(tweet.getFavoriteCount()));
			myTweet.setSource(tweet.getSource());
			
			customTweets.add(myTweet);
		}
		
		return customTweets;
		
	}

}
