package com.txk.java.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyExample implements InvocationHandler{

	private Object target = null;
	/**
	 * 代理对象生成
	 * @param object
	 * @return 代理对象
	 */
	public Object bind(Object object) {
		this.target = object;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	/**
	 * @param proxy 代理对象
	 * @param method 调度方法、
	 * @param args 方法参数
	 * @return 代理结果返回
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("进入代理逻辑方法");
		System.out.println("调度真实对象之前的服务");
		System.out.println(method);
		System.out.println(args);
		Object object = method.invoke(target, args);//target 接口下的具体实现对象
		System.out.println("调度真实对象之后服务");
		return object;
	}
	
}
