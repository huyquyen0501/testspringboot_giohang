package com.huy.demo.model;

import com.huy.demo.entity.Product;

import lombok.Data;

@Data
public class ProductInfo {
	private String code;
	private String name;
	private int price;
	
	public ProductInfo(Product product) {
		this.code=code;
		this.name= name;
		this.price=price;
	}
}
