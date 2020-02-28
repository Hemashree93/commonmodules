package com.xworkz.hema.service;

import java.util.Objects;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.hema.dao.HomeDAO;
import com.xworkz.hema.dto.SignInDTO;
import com.xworkz.hema.entity.HomeEntity;

@Service
public class SignInServiceImpl implements SignInService {
	
	@Autowired
	private HomeDAO dao;

	public SignInServiceImpl() {
		System.out.println("created \t"+this.getClass().getSimpleName());
	}
	public boolean validateLoginDetails(SignInDTO signInDTO) {
		boolean valid = false;
		try {
			System.out.println("dataSave invoked " + signInDTO);

			if (Objects.nonNull(signInDTO)) {

				HomeEntity home=new HomeEntity();
				BeanUtils.copyProperties(signInDTO, home);
				HomeEntity home1=dao.fetchByEmailandPassword(signInDTO.getEmail(), signInDTO.getPassword());

				if (home1 !=null) {
					System.out.println("entity is ready \t " + home);
					dao.fetchByEmailandPassword(signInDTO.getEmail(), signInDTO.getPassword());
					System.out.println("Email is exist");
					return true;
				}
				} else {
					System.out.println("entity as saved email already exits");
					return false;
				}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return valid;

	}
}
