package com.huy.demo.entity;
import javax.persistence.Column;

import com.vaadin.flow.component.polymertemplate.Id;

import lombok.*;
@Data
public class Account {
	public static final String ROLE_MANAGER="MANAGER";
	public static final String ROLE_EMPLOYEE="EMPLOYEE";
	
	@Id
	@Column(name = "User_Name", length = 20, nullable = false)
	private String userName;
	@Column(name = "Encryted_password", length = 128, nullable = false)
	private String enCrytedPassword;
	@Column(name = "User_role", length = 20, nullable = false)
	private String userRole;
	@Column(name = "active", length = 1, nullable = false)
	private boolean active;
}
