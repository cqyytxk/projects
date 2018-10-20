package com.txk.java.proxy.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


public class CglibProxyExample implements  MethodInterceptor{

	/** 
	 * 生成cglib代理对象
	 * @param cls class 类
	 * @return 代理对象
	 */
	public Object getProxy(Class cls){
		//增强类对象
		Enhancer ecEnhancer = new Enhancer();
		//设置增强类型
		ecEnhancer.setSuperclass(cls);
		//定义代理逻辑对象为当前对象，要求当前对象实现methodInterceptor 方法
		ecEnhancer.setCallback(this);
		//生成并返回对象
		return ecEnhancer.create();
	}
	/**
	 * @param proxy 代理对象
	 * @param method 方法
	 * @param args 方法参数
	 * @param methodProxy 方法处理
	 * @return 代理逻辑返回
	 * 
	 */
	@Override
	public Object intercept(Object proxy, Method method, Object[] args,
			MethodProxy methodProxy) throws Throwable {
		System.err.println("调用真实对象之前");
		Object result = methodProxy.invokeSuper(proxy, args);
		System.err.println("调用真实对象之后");
		return result;
	}

}
