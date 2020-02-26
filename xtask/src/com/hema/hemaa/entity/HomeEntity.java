package com.hema.hemaa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Entity
@Table(name="xtask")
@Data

public class HomeEntity implements Serializable {
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "id")
	private int id;
	@Column(name = "userName")
	private String userName;
	@Column(name = "email")
	private String email;
	@Column(name = "mobile")
	private String mobile;
	@Column(name = "password")
	private String password;
	@Column(name = "confirmPassword")
	private String confirmPassword;
	
	public HomeEntity() {
	System.out.println("created \t"+this.getClass().getName() );
	}

	public HomeEntity(int id, String userName, String email, String mobile, String password, String confirmPassword) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	
	

}
