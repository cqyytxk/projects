package com.txk.java.proxy.cglibproxy;

import com.txk.java.reflect.ReflectServiceImpl;

public class CglibProxyTest {

	public static void main(String[] args) {
		CglibProxyExample cglib = new CglibProxyExample();
		ReflectServiceImpl reflectServiceImpl = (ReflectServiceImpl)cglib.getProxy(ReflectServiceImpl.class);
		reflectServiceImpl.sayHelloWorld("уехЩ");
	}

}
