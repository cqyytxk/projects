package com.txk.java.interceptor;

import java.lang.reflect.Method;

public class MyInterceptor implements Interceptor {

	@Override
	public boolean before(Object proxy, Object target, Method method,
			Object[] args) {
		System.out.println("反射方法前逻辑");
		return false;
	}

	@Override
	public void around(Object proxy, Object target, Method method, Object[] args) {
		System.out.println("取消被代理对象的方法");
	}

	@Override
	public void after(Object proxy, Object target, Method method, Object[] args) {
		System.out.println("反射方法后逻辑");
	}

}
