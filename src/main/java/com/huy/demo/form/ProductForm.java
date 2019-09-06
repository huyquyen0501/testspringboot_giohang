package com.huy.demo.form;

import org.springframework.web.multipart.MultipartFile;

import com.huy.demo.entity.Product;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter

public class ProductForm {
	private String code;
	private String name;
	private int price;
	 private boolean newProduct= false;
	 
	 private MultipartFile fileData;
	 public ProductForm() {
		 this.newProduct=true;
	 }
	 public ProductForm(Product product) {
		 this.code=product.getCode();
		 this.name=product.getName();
		 this.price=product.getPrice();
	 }
}
