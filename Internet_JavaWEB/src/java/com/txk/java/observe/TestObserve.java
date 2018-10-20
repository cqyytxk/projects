package com.txk.java.observe;

public class TestObserve {

	public static void main(String[] args) {
		ProductList observe = ProductList.getInstance();
		JingDongObserver jingDongObserver = new JingDongObserver();
		TaoBaoObserver taoBaoObserver = new TaoBaoObserver();
		observe.addObserver(jingDongObserver);
		observe.addObserver(taoBaoObserver);
		observe.addProduct("新增产品1");
	}

}
