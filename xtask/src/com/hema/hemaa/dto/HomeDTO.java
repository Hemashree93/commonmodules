package com.hema.hemaa.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HomeDTO {
	private String Username;
	private String email;
	private String mobile;
	private String password;
	private String confirmpassword;
	
	
	public HomeDTO() {
		System.out.println("created \t" + this.getClass().getSimpleName());
	}


	@Override
	public String toString() {
		return "SigninDTO [Username=" + Username + ", email=" + email + ", mobile=" + mobile + ", password=" + password
				+ ", confirmpassword=" + confirmpassword + "]";
	}
	

}
