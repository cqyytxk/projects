package com.txk.java.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyExample implements InvocationHandler{

	private Object target = null;
	/**
	 * �����������
	 * @param object
	 * @return �������
	 */
	public Object bind(Object object) {
		this.target = object;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	/**
	 * @param proxy �������
	 * @param method ���ȷ�����
	 * @param args ��������
	 * @return ����������
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("��������߼�����");
		System.out.println("������ʵ����֮ǰ�ķ���");
		System.out.println(method);
		System.out.println(args);
		Object object = method.invoke(target, args);//target �ӿ��µľ���ʵ�ֶ���
		System.out.println("������ʵ����֮�����");
		return object;
	}
	
}
