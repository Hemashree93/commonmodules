package com.xworkz.hema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.hema.dto.SignInDTO;
import com.xworkz.hema.service.HomeService;
import com.xworkz.hema.service.SignInService;


@Controller
@RequestMapping("/")
public class SignInController {
	
	@Autowired
	private SignInService signInService;
	
	

	public SignInController() {
	 	System.out.println("created \t"+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/signin.do")
	public String onSignIn(SignInDTO signInDTO, ModelMap map) {
		try {
			System.out.println("invoked onSignIn");
			boolean check=this.signInService.validateLoginDetails(signInDTO);
			
			
			if(check) {
				ModelMap success=map.addAttribute("successmessage", signInDTO.getEmail());
				return "last";
			}else {
				ModelMap failure=map.addAttribute("failureMessage","Signin unsuccessfull");
				System.out.println("the email is not correct, enter the correct email");
				return "signin";
				}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("signin:"+e.getMessage());
		}
		return "signin";
	}
}

