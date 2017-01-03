package com.niit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDAO;
import com.niit.modal.Product;
import com.niit.service.ProductService;

import antlr.collections.List;


@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDAO ProductDao;

	
	public void add(Product P) {
		
		ProductDao.add(P);
		
		

	}


	public void edit(Product p) {
		
		ProductDao.edit(p);
		// TODO Auto-generated method stub

	}


	public void delete(int productid) {
		
		ProductDao.delete(productid);
		// TODO Auto-generated method stub

	}


	public Product getP(int productid) {
		
		ProductDao.getP(productid);
		// TODO Auto-generated method stub
		return null;
	}


	public List getAllP() {
		
		ProductDao.getAllP();
	
		return null;
	}

}
