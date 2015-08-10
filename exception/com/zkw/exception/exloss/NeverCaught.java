package com.zkw.exception.exloss;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-6-7 上午11:46:21
 *
 */
public class NeverCaught {
	static void f() throws ExceptionB{
        throw new ExceptionB("exception b");
    }
	
	static void g() throws ExceptionC {
        try {
            f();
        } catch (ExceptionB e) {
            ExceptionC c = new ExceptionC("exception a");
            throw c;
        }
    }
	
	 public static void main(String[] args) {
         try {
             g();
         } catch (ExceptionC e) {
             e.printStackTrace();
         }
 }
}
