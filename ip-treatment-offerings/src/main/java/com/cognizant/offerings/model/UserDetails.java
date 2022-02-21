package com.cognizant.offerings.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author Pratik, Shubham, Pratik, Kavya
 * 
 * 		model class for user details
 * 
 * 		@Entity indicates Spring Data JPA that it is an entity class for the
 *      application
 *      @Data is a convenient shortcut annotation that bundles 
 *      the features of @ToString , @EqualsAndHashCode , @Getter / @Setter 
 *      and @RequiredArgsConstructor together
 *
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {

	/**
	 * instance variables
	 * 
	 * @Id helps in defining the primary key
	 */
	@Id
	private long userId;
	private String userName;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public UserDetails() {
		super();
	}
	public UserDetails(long userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	
	
	
}
