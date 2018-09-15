package com.divyendu.comtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.TwitterProfile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divyendu.impl.ProfileManagerImpl;

@RestController
public class ProfileController {
	
	private ProfileManagerImpl profileManager;

	@Autowired
	public ProfileController(ProfileManagerImpl profileManager) {
		this.profileManager = profileManager;
	}
	
	@RequestMapping(value = "/profile")
	public TwitterProfile getScreenName() {
		return profileManager.retrieveProfileData();
	}
	

}
