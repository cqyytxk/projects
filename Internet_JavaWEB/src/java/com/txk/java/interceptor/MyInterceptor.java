package com.txk.java.interceptor;

import java.lang.reflect.Method;

public class MyInterceptor implements Interceptor {

	@Override
	public boolean before(Object proxy, Object target, Method method,
			Object[] args) {
		System.out.println("���䷽��ǰ�߼�");
		return false;
	}

	@Override
	public void around(Object proxy, Object target, Method method, Object[] args) {
		System.out.println("ȡ�����������ķ���");
	}

	@Override
	public void after(Object proxy, Object target, Method method, Object[] args) {
		System.out.println("���䷽�����߼�");
	}

}
