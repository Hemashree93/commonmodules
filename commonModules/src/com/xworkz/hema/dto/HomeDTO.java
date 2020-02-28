package com.xworkz.hema.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HomeDTO {
	private String userName;
	private String email;
	private String mobile;
	private String password;
	private String confirmpassword;
	
	
	public HomeDTO() {
		System.out.println("created \t" + this.getClass().getSimpleName());
	}


	@Override
	public String toString() {
		return "SigninDTO [userName=" + userName + ", email=" + email + ", mobile=" + mobile + ", password=" + password
				+ ", confirmpassword=" + confirmpassword + "]";
	}
	

}
