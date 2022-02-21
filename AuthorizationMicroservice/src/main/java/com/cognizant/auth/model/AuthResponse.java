package com.cognizant.auth.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {
	
	/**
	 * instance variables
	 */
	private String uid;
	private String name;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isValid() {
		return isValid;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	private boolean isValid;
	public AuthResponse(String uid, String name, boolean isValid) {
		super();
		this.uid = uid;
		this.name = name;
		this.isValid = isValid;
	}
	public AuthResponse() {
		super();
	}
	
}
