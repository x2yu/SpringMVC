package com.x2y.controller;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.x2y.pojo.Product;
import com.x2y.pojo.ProductList;
import com.x2y.pojo.ProductMap;

@Controller
public class ProductController {
	
	@RequestMapping("/addProduct")
	public ModelAndView addProduct(Product product)throws Exception{//Product 参数，用于接收注入
		ModelAndView mav = new ModelAndView("showProduct");
		return mav;
	}
	
	@RequestMapping("/docount")
	public ModelAndView doCount(int count)throws Exception{
		ModelAndView mav = new ModelAndView("showInt");
		System.out.println(count);
		mav.addObject("productcount", count);
		return mav;
	}
	
	@RequestMapping("/addProductAndCategory")
	public ModelAndView addProductAndCategory(Product product)throws Exception{
		ModelAndView mav = new ModelAndView("showProduct");
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getCategory().getCid());
		System.out.println(product.getCategory().getCname());
		return mav;
	}
	
	@RequestMapping("addListProducts")
	public void addListProducts(ProductList productList)throws Exception{
		ModelAndView mav = new ModelAndView("showList");
		mav.addObject("products",productList);
		for(Product product:productList.getProducts()) {
			System.out.println(product.getName()+" "+product.getPrice()+" "+product.getCategory().getCname());
		}
	}
	
	@RequestMapping("addMapProduct")
	public void addMapProduct(ProductMap productMap) {
			for(Entry<String, Product> entry : productMap.getProducts().entrySet())
			System.out.println(entry.getKey() + ": " + 
			entry.getValue().getName() + " - " +
			entry.getValue().getPrice()+ " - "+
			entry.getValue().getCategory().getCname() );
		}
	}
