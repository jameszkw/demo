package com.zkw.reflect.invokemethod;

import java.lang.reflect.Method;

/**
 * @ClassName: InvokeMethodDemo
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年9月20日 下午4:10:53
 *
 */
public class InvokeMethodDemo {
	/**
     * 执行某对象方法
     *
     * @param objName
     *            对象
     * @param methodName
     *            方法名
     * @param args
     *            参数
     * @return 方法返回值
     * @throws Exception
     */
    public void invokeMethod2(String objName,String methodName, Class[] argsType,Object[] args){
    	try {
    		Class<?> cls = Class.forName(objName);
    		Object obj = cls.newInstance();
    		Method method = cls.getDeclaredMethod(methodName, argsType);
    		Object returnV = method.invoke(obj, args);
    		System.out.println(returnV);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	public static void main(String[] args) {
		Object[] arg = new Object[1];
		arg[0] = "ddddddd";
		Class[] argsType = new Class[1];
		argsType[0] = String.class;
		InvokeMethodDemo demo = new InvokeMethodDemo();
		demo.invokeMethod2("com.zkw.reflect.invokemethod.TestObject","method",argsType,arg);
	}
}
