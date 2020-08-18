package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = " Product_TBL")
public class Product {
	@Id
    @GeneratedValue
	private int compnayId ;
	 private String companyName ;
	private double companyRevenue;
	private int productId; 
	  private String productName;
	 private String productType ;
	  private double productPrice ;
	  private int productQuantity;
	public int getCompnayId() {
		return compnayId;
	}
	public void setCompnayId(int compnayId) {
		this.compnayId = compnayId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getCompanyRevenue() {
		return companyRevenue;
	}
	public void setCompanyRevenue(double companyRevenue) {
		this.companyRevenue = companyRevenue;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

}
