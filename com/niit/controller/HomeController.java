package com.niit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.modal.Product;
import com.niit.service.ProductService;

@Controller
public class HomeController {


@RequestMapping("/")
	public String home(){
		
		return "home";
		
	}
 
 @RequestMapping("/product")
 public ModelAndView getaddproduct()
 {
	 
	 ModelAndView model=new ModelAndView("addproduct");
	
	return model;
	 
	 
 }
 
 @ModelAttribute("prod")
 public Product newProduct()
 {
	 return new Product();
 }
 
 
 @Autowired
 private ProductService productService;
 
 @RequestMapping(value="/productSubmitted", method=RequestMethod.POST)
 public ModelAndView setaddprduct(@ModelAttribute("product")Product product,BindingResult result, HttpServletRequest request)
 {
	 productService.add(product);
	 ModelAndView model=new ModelAndView("productadded");
	 model.addObject("msg","your product is added");
	 
	 return model;
	 
	 
 }
 
 


 
  



 
}
