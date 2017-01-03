package com.niit.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDAO;
import com.niit.modal.Product;

import antlr.collections.List;


@Repository
public class ProductDaoImpl implements ProductDAO {

	@Autowired

	private SessionFactory session;
	
	public void add(Product P) {
		// TODO Auto-generated method stub

		session.openSession().save(P);
		((Session) session).flush();
	
	}

	public void edit(Product P) {
		// TODO Auto-generated method stub

		session.getCurrentSession().update(P);
		
	}

	public void delete(int productid) {
		// TODO Auto-generated method stub

		
		session.getCurrentSession().delete(getP(productid));
	}

	public Product getP(int productid) {
		// TODO Auto-generated method stub
		
		
		return (Product)session.getCurrentSession().get(Product.class, productid);
	}

	public List getAllP() {
		// TODO Auto-generated method stub
		return (List) session.getCurrentSession().createQuery("from Product").list();
	}

}
