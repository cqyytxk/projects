package com.txk.java.proxy.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


public class CglibProxyExample implements  MethodInterceptor{

	/** 
	 * ����cglib�������
	 * @param cls class ��
	 * @return �������
	 */
	public Object getProxy(Class cls){
		//��ǿ�����
		Enhancer ecEnhancer = new Enhancer();
		//������ǿ����
		ecEnhancer.setSuperclass(cls);
		//��������߼�����Ϊ��ǰ����Ҫ��ǰ����ʵ��methodInterceptor ����
		ecEnhancer.setCallback(this);
		//���ɲ����ض���
		return ecEnhancer.create();
	}
	/**
	 * @param proxy �������
	 * @param method ����
	 * @param args ��������
	 * @param methodProxy ��������
	 * @return �����߼�����
	 * 
	 */
	@Override
	public Object intercept(Object proxy, Method method, Object[] args,
			MethodProxy methodProxy) throws Throwable {
		System.err.println("������ʵ����֮ǰ");
		Object result = methodProxy.invokeSuper(proxy, args);
		System.err.println("������ʵ����֮��");
		return result;
	}

}
