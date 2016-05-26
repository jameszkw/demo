package com.zkw.keyword.transientdemo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Created by Administrator on 2016/5/26 0026.
 */
public class Blip implements Externalizable {
    private int i ;
    private String s;//没有初始化

    public Blip() {
        //默认构造函数必须有，而且必须是public
        System.out.println("p默认构造函数");
    }

    public Blip(String s,int i) {
        //s,i只是在带参数的构造函数中进行初始化。
        System.out.println("带参数构造函数");
        this.i = i;
        this.s = s;
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("调用writeExternal（）方法");
        out.writeObject(s);//如果我们不将s和i的值写入的话，那么在反序列化的时候，就不会得到这些值。
        out.writeInt(i);
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("调用readExternal（）方法");
        s = (String)in.readObject();//在反序列化时，需要初始化s和i，否则只是调用默认构造函数，得不到s和i的值
        i = in.readInt();
    }

    @Override
    public String toString() {
        return "Blip{" +
                "i=" + i +
                ", s='" + s + '\'' +
                '}';
    }
}
