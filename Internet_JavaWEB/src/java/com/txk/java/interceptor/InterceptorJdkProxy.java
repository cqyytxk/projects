package com.txk.java.interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InterceptorJdkProxy implements InvocationHandler{

	private Object target;
	private String interceptorClass = null;
	
	/**
	 * @param target 目标对象
	 * @param interceptorClass 拦截器全限定名称
	 */
	public InterceptorJdkProxy(Object target, String interceptorClass) {
		this.target = target;
		this.interceptorClass = interceptorClass;
	}
	 public static Object bind(Object target,String interceptorClass){
		 return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				 new InterceptorJdkProxy(target, interceptorClass));
	 }
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object object = null;
		if(interceptorClass == null){
			return method.invoke(target, args);
		}
		Interceptor interceptor = (Interceptor)Class.forName(interceptorClass).newInstance();
		if(interceptor.before(proxy, target, method, args)){
			System.out.println(111);
			object = method.invoke(target, args);
		}else{
			interceptor.around(proxy, target, method, args);
		}
		interceptor.after(proxy, target, method, args);
		return object;
	}

}
