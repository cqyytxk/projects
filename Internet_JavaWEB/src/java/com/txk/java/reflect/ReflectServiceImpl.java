package com.txk.java.reflect;

public class ReflectServiceImpl {
	
	private String name;
	
	public ReflectServiceImpl() {}
	public ReflectServiceImpl(String name) {
		this.name = name;
	}
	public void sayHello(){
		System.err.println("Hello "+name);
	}
	public void sayHelloWorld(String name){
		System.err.println("Hello "+name);
	}
}
