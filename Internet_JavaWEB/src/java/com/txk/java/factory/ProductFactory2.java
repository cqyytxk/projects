package com.txk.java.factory;

public class ProductFactory2 implements IProductFactory {

	@Override
	public IProduct createFactory(String num) {
		// TODO Auto-generated method stub
		IProduct iProduct = new IProduct() {
			
			@Override
			public void implents() {
				// TODO Auto-generated method stub
				
			}
		};
		return iProduct;
	}


}
