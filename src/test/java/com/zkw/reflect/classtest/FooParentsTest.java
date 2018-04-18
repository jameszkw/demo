package com.zkw.reflect.classtest;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-07-27 上午 10:05
 **/
public class FooParentsTest {

    /**
     * <U> Class<? extends U> asSubclass(Class<U> clazz)
     * 说明：判断Class是否是clazz的子类或本身
     * */
    @Test
    public void test_asSubclass(){
        try {
            //子类
            Class.forName("com.zkw.reflect.classtest.Foo").asSubclass(FooParents.class);
            //本身
            Class.forName("com.zkw.reflect.classtest.Foo").asSubclass(Foo.class);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * instanceof 关键字
     * 说明：一个对象是类或接口的实现类的对象、对象、子类的对象
     * */
    @Test
    public void test_isa(){
        //对象
        assertTrue(new Foo() instanceof Foo);
        //实现类的对象
        assertTrue(new Foo() instanceof FooParents);
        //子类的对象
        assertTrue(new Foo2() instanceof Foo);
        //实现类的子类的对象
        assertTrue(new Foo2() instanceof FooParents);
    }
}