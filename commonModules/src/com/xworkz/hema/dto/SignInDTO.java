package com.xworkz.hema.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SignInDTO {
	private String email;
	private String password; 
	
	public SignInDTO() {
		System.out.println("created \t"+this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "SignInDTO [Email=" + email + ", Password=" + password + "]";
	}
	
	

}

