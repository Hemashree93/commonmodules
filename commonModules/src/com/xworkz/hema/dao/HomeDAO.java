package com.xworkz.hema.dao;

import com.xworkz.hema.entity.HomeEntity;

public interface HomeDAO {
	public void save(HomeEntity homeEntity);
	public HomeEntity fetchByemail(String email);
	public HomeEntity fetchByEmailandPassword(String password, String email);

}
