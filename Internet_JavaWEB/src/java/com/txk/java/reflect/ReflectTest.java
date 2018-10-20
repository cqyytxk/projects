package com.txk.java.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {
	
	public ReflectServiceImpl getinstance() throws IllegalAccessException, IllegalArgumentException{
		ReflectServiceImpl object = null;
		try {
			object = (ReflectServiceImpl) Class.forName("com.txk.java.reflect.ReflectServiceImpl")
					.getConstructor(String.class).newInstance("����");
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
			object = method.invoke(target, "����");//�������ú��з���ֵ���Ƿ���ֵ������Ϊnull
		} catch (Exception e) {
			// TODO: handle exception
		}
		return object ;
	}
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException {
		ReflectTest test = new ReflectTest();
//		test.getinstance().sayHello();;//ͨ�������Լ��вι������������
		test.reflectMethod();//��ȡ�������󣬽��е���
	}

}
