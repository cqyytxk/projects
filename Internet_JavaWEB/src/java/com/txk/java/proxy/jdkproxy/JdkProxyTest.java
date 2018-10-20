package com.txk.java.proxy.jdkproxy;

public class JdkProxyTest {

	public static void main(String[] args) {
		JdkProxyExample jdk = new JdkProxyExample();
		HelloWorld helloWorld = (HelloWorld)jdk.bind(new HelloWorldImpl());
		helloWorld.sayHelloWorld();
	}

}
