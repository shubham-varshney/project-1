package com.niit.service;

import com.niit.modal.Product;

import antlr.collections.List;

public interface ProductService {
	
	
	
	public void add(Product P);
	public void edit(Product p);
	public void delete(int productid);
	public Product getP(int productid);
	public List getAllP();

}
