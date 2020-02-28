package com.xworkz.hema.service;

import com.xworkz.hema.dto.SignInDTO;

public interface SignInService {
	public boolean validateLoginDetails(SignInDTO signInDTO);

}
