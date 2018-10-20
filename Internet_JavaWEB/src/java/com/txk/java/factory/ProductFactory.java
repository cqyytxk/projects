package com.txk.java.factory;
//抽象工厂去调用具体哪个工厂
public class ProductFactory implements IProductFactory{
	
	public IProduct createFactory(String num) {
		IProductFactory factory = null;
		switch (num) {
		case "1":
			 factory=  new ProductFactory1();
			break;
		case "2":
			 factory=  new ProductFactory2();
					break;
		case "3":
			 factory=  new ProductFactory3();
			break;
		default:
			break;
		}
		if(factory != null){
			return factory.createFactory(num);
		}
		return null;
	}

}
