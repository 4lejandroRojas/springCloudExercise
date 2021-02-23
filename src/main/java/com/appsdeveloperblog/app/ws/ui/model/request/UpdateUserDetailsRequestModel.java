package com.appsdeveloperblog.app.ws.ui.model.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UpdateUserDetailsRequestModel {

	@NotNull(message = "firstName cannot be null")
	@NotBlank(message = "firstName cannont be empty")
	@Size(min = 2, message = "firstName must not be less than 2 characters")
	private String firstName;
	
	@NotNull(message = "lastName cannot be null")
	@NotBlank(message = "lasttName cannont be empty")
	private String lastName;

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
	
	
}
