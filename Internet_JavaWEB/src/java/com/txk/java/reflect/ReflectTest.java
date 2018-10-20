package com.txk.java.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {
	
	public ReflectServiceImpl getinstance() throws IllegalAccessException, IllegalArgumentException{
		ReflectServiceImpl object = null;
		try {
			object = (ReflectServiceImpl) Class.forName("com.txk.java.reflect.ReflectServiceImpl")
					.getConstructor(String.class).newInstance("张三");
		} catch (ClassNotFoundException | InstantiationException | SecurityException 
				| NoSuchMethodException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return object;
	}
	public Object reflectMethod(){
		Object object = null;
		ReflectServiceImpl target = new ReflectServiceImpl();
		try {
			Method method = ReflectServiceImpl.class.getMethod("sayHelloWorld",String.class);
			object = method.invoke(target, "李四");//方法调用后，有返回值就是返回值，否则为null
		} catch (Exception e) {
			// TODO: handle exception
		}
		return object ;
	}
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException {
		ReflectTest test = new ReflectTest();
//		test.getinstance().sayHello();;//通过反射以及有参构造器反射对象
		test.reflectMethod();//获取方法对象，进行调用
	}

}
