package com.divyendu.comtroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.divyendu.beans.UserDataBean;
import com.divyendu.beans.UserRequestBean;
import com.divyendu.impl.ProfileManagerImpl;

@RestController
public class ProfileController1 {
	
	private ProfileManagerImpl profileManager;
	private static final Logger logger = LoggerFactory.getLogger(ProfileController1.class);

	@Autowired
	public ProfileController1(ProfileManagerImpl profileManager) {
		this.profileManager = profileManager;
	}
	
	//Enabling CORS so that our react app can send requests to out rest service	
	@CrossOrigin(origins = "http://localhost:3000")	
	@RequestMapping(value = "/profile",method = RequestMethod.POST)
	public UserDataBean getUserData(@RequestBody UserRequestBean request) {
		//System.out.println(request);
		String userName = "electon"; //Default screen name in case request from react app is null
		if(request != null) {
			userName = request.getName();
			logger.debug("Username recieved from request is "+ userName);
		}
		else {
			logger.debug("Request from react app is null, hence username is default: "+ userName);
		}
		return profileManager.retrieveProfileData(userName);
	}
	

}
