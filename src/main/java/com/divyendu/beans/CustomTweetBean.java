package com.divyendu.beans;

public class CustomTweetBean {
	
	private String tweetContent;
	private boolean retweeted;
	private String retweetCount;
	private boolean favorited;
	private String favoritedCount;
	private String source;
	
	public CustomTweetBean() {}

	public String getTweetContent() {
		return tweetContent;
	}

	public void setTweetContent(String tweetContent) {
		this.tweetContent = tweetContent;
	}

	public boolean isRetweeted() {
		return retweeted;
	}

	public void setRetweeted(boolean retweeted) {
		this.retweeted = retweeted;
	}

	public String getRetweetCount() {
		return retweetCount;
	}

	public void setRetweetCount(String retweetCount) {
		this.retweetCount = retweetCount;
	}

	public boolean isFavorited() {
		return favorited;
	}

	public void setFavorited(boolean favorited) {
		this.favorited = favorited;
	}

	public String getFavoritedCount() {
		return favoritedCount;
	}

	public void setFavoritedCount(String favoritedCount) {
		this.favoritedCount = favoritedCount;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
	

}
