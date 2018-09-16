package com.divyendu.comtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.TwitterProfile;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	
	//Enabling CORS so that our react app can send requests to out rest service	
	@CrossOrigin(origins = "http://localhost:3000")	
	@RequestMapping(value = "/profile")
	public TwitterProfile getScreenName() {
		return profileManager.retrieveProfileData();
	}
	

}
