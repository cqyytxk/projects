package com.txk.java.builder;

public class Testbuilder {
	public static void main(String[] args) {
		ConfigBuilder configBuilder  = new ConfigBuilder();
		configBuilder.first();
		configBuilder.second();
		configBuilder.third();
		configBuilder.forth();
		System.out.println("封装完该对象所需要的配置");
		Object object = Builder.builder(configBuilder);
	}
}
