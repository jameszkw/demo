package com.zkw.reflect.staticproxy;

/**
 * @ClassName: CalculatorStaticFactory
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年9月22日 下午6:59:43
 *
 */
public class CalculatorStaticFactory {
	//客户类调用此工厂方法获得代理对象。
	 //对客户类来说，其并不知道返回的是代理类对象还是委托类对象。
	 public static Calculator getInstance(){
	  return new CalculatorProxy(new CalculatorImpl1());
	 }
}
