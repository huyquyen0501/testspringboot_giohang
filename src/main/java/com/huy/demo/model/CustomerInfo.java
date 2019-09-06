package com.huy.demo.model;

import com.huy.demo.form.CustomerForm;

import lombok.Data;

@Data
public class CustomerInfo {
	private String name;
	private String address;
	private String email;
	private String phone;
	private boolean vaild;

	public CustomerInfo(CustomerForm customerForm) {
		this.name = customerForm.getName();
		this.address = customerForm.getAddress();
		this.email = customerForm.getEmail();
		this.phone = customerForm.getPhone();
		this.vaild = customerForm.isVaild();
	}
}
