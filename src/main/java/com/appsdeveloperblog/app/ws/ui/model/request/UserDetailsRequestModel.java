package com.appsdeveloperblog.app.ws.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDetailsRequestModel {
	@NotNull(message = "firstName cannot be null")
	@NotBlank(message = "firstName cannont be empty")
	@Size(min = 2, message = "firstName must not be less than 2 characters")
	private String firstName;
	
	@NotNull(message = "lastName cannot be null")
	@NotBlank(message = "lasttName cannont be empty")
	private String lastName;
	
	@NotNull(message = "email cannot be null")
	@Email
	private String email;
	
	@NotNull(message = "password cannot be null")
	@Size(min = 8, max = 16, message = "password must be equals or grater than 8  and less than 16")
	private String password;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
