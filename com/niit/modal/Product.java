package com.niit.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	int productid;
	
	
	String name;
	

	String description;
	
	
	String image;
	
	
	double price;
	
	
	double qnt;
	
	
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQnt() {
		return qnt;
	}
	public void setQnt(double qnt) {
		this.qnt = qnt;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", name=" + name + ", description=" + description + ", image="
				+ image + ", price=" + price + ", qnt=" + qnt + "]";
	}
	

}
