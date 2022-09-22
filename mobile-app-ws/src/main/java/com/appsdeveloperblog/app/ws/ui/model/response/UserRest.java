package com.appsdeveloperblog.app.ws.ui.model.response;

public class UserRest {

	private String userId; // plubic userID must be different than database id
	private String firstName; // plubic userID must be different than database id
	private String lastName; // plubic userID must be different than database id
	private String email; // plubic userID must be different than database id

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
