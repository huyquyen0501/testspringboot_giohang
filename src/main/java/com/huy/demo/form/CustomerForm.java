package com.huy.demo.form;

import com.huy.demo.model.CustomerInfo;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class CustomerForm {

	private String name;
	private String address;
	private String email;
	private String phone;
	private boolean vaild;

	public CustomerForm(CustomerInfo customerInfo) {
		if (customerInfo != null) {
			this.name = customerInfo.getName();
			this.address = customerInfo.getAddress();
			this.email = customerInfo.getEmail();
			this.phone = customerInfo.getPhone();
			this.vaild = customerInfo.isVaild();
		}
	}
}
