package com.txk.java.factory;
//���幤��1
public class ProductFactory1 implements IProductFactory {

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
