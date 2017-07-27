package com.zkw.java.mockito;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-17 下午 1:56
 **/

public class MyClass {
    public int getUniqueId(){
        System.out.println("调用getUniqueId");
        SecClass sec=new SecClass();
        sec.getId();
        return new Integer(0);
    }

    public class SecClass{
        public void getId(){
            System.out.println("调用getId");
        }
    }
}
