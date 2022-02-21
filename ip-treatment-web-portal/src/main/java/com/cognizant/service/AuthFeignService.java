package com.cognizant.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.cognizant.clients.AuthenticationFeign;
import com.cognizant.model.Admin;

import lombok.extern.slf4j.Slf4j;
/**
 * 
 * @author Pratik, Shubham, Pratik, Kavya
 * 
 * 		Service Class For Authentication
 * 
 * @slf4j Causes lombok to generate a logger field. 
 * @Service Indicates that an annotated class is a "Service", 
 * originally defined by Domain-DrivenDesign (Evans, 2003) as 
 * "an operation offered as an interface that stands alone in the model, 
 * with no encapsulated state." 
 */
@Slf4j
@Service
public class AuthFeignService {
	private static final Logger log= LoggerFactory.getLogger(AuthenticationFeign.class);
	@Autowired
	private AuthenticationFeign authClient;

	public ResponseEntity<?> getToken(Admin usercredentials) {
		log.debug("userCredentials{}:", usercredentials);
		return authClient.login(usercredentials);
	}

}