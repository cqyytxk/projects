package com.txk.java.interceptor;

import com.txk.java.proxy.jdkproxy.HelloWorld;
import com.txk.java.proxy.jdkproxy.HelloWorldImpl;

public class InterceptorTest {

	public static void main(String[] args) {
		HelloWorld helloWorld = (HelloWorld)InterceptorJdkProxy.bind(new HelloWorldImpl(), "com.txk.java.interceptor.MyInterceptor");
		helloWorld.sayHelloWorld();
	}

}
