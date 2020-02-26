package com.hema.hemaa.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hema.hemaa.dto.HomeDTO;
import com.hema.hemaa.entity.HomeEntity;
import com.hema.hemaa.service.HomeService;


@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	public HomeController() {
		System.out.println("created \t" +this.getClass().getSimpleName());
	}
	
	@RequestMapping("Sumbit.do")
	public String onSubmit(HomeDTO homeDTO, HomeEntity homeEntity, ModelMap map) {
		try {
			System.out.println("invoked onSubmit");
			boolean check=this.homeService.Save(homeDTO);
			if(check) {
				map.addAttribute("home.jsp", "Data saved");
			}else {
				map.addAttribute("home.jsp", "Data not saved");
			}
			//System.out.println(homeDTO);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/home.jsp";


}
}
