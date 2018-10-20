package com.txk.java.observe;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ProductList extends Observable {
	private static ProductList instance;
	private List<String> productList = null; 
	private ProductList(){};
	
	public static ProductList getInstance(){
		if(instance == null){
			instance = new ProductList();
			instance.productList = new ArrayList<String>();
		}
		return instance;
	}
	public void  addProductListObserve(Observer observer) {
		this.addObserver(observer);
	}
	public void  addProduct(String productName) {
		productList.add(productName);
		System.err.println("产品增加新东西:"+productName);
		this.setChanged();
		this.notifyObservers(productName);
	}
	
}
