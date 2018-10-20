package com.txk.java.observe;

import java.util.Observable;
import java.util.Observer;


public class JingDongObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		String nameString = (String) arg;
		System.err.println("add new Prodcut JingDong:"+nameString);
		
	}

}
