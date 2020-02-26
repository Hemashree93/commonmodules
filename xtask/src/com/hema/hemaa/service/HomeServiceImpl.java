package com.hema.hemaa.service;

import java.util.Objects;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.hema.hemaa.dao.HomeDAO;
import com.hema.hemaa.dto.HomeDTO;
import com.hema.hemaa.entity.HomeEntity;

@Service
public class HomeServiceImpl implements HomeService{
	@Autowired
	private HomeDAO homeDAO;
	
	
	public HomeServiceImpl() {
		System.out.println("created \t"+this.getClass().getSimpleName());
	}
	


	public boolean Save(HomeDTO homeDTO) {
		boolean valid = false;
		try {
			System.out.println("dataSave invoked " + homeDTO);
			
			if(Objects.nonNull(homeDTO)) {
				System.out.println("starting validation for " + homeDTO);
				String UserName = homeDTO.getUsername();
				
				if (UserName !=null && !UserName.isEmpty() && UserName.length() >=5) {
				System.out.println("UserName is valid");
				valid = true;
				} else {
					System.out.println("UserName is invalid");
					if(UserName == null) {
						System.out.println("UserName is null");
					}
					if(UserName !=null && UserName.length() <5) {
						System.out.println("name length is less than 5");
					}
					valid = false;
				}
				String email = homeDTO.getEmail();
				if (email !=null && !email.isEmpty() && email.length() >=5) {
					System.out.println("email is valid");
					valid = true;	
			} else {
				if(valid) {
					System.out.println("email is invalid");
					valid = false;
				}	
				}
				String mobile = homeDTO.getMobile();
				if (mobile !=null && !mobile.isEmpty() && mobile.length() >=5) {
					System.out.println("mobile is valid");
					valid = true;	
			} else {
				if(valid) {
					System.out.println("mobile is invalid");
					valid = false;
					
				}
			}
				
				String password = homeDTO.getPassword();
				if (password !=null && !password.isEmpty() && password.length() >=5) {
					System.out.println("password is valid");
					valid = true;	
			} else {
				if(valid) {
					System.out.println("password is invalid");
					valid = false;
					
				}
			}
				String confirmpassword = homeDTO.getConfirmpassword();
				if (confirmpassword !=null && !confirmpassword.isEmpty() && confirmpassword.length() >=5) {
					System.out.println("confirmpassword is valid");
					valid = true;	
			} else {
				if(valid) {
					System.out.println("confirmpassword is invalid");
					valid = false;
					
				}
			}
			}
				if(valid) {
					System.out.println("Data is valid ,will convert  to entity");
					
					HomeEntity homeEntity = new HomeEntity();
					
					BeanUtils.copyProperties(homeDTO, homeEntity);
					
					System.out.println("entity is ready \t "+ homeEntity);
					homeDAO.save(homeEntity);
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			return false;

	}
}

