package com.zkw.asm.demo.myself;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;

/**
 * @ClassName: AsmDemo
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年10月19日 下午3:27:04
 *
 */
public class AsmDemo {
	@SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        /*生成类文件的结构，代码现在是这样
         * public class HelloWorld{
         *
         * }
         */
        ClassWriter cw=new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cw.visit(49, Opcodes.ACC_PUBLIC, "HelloWorld", null, "java/lang/Object", null);
        Method m=Method.getMethod("void <init> ()");
        GeneratorAdapter ga=new GeneratorAdapter(Opcodes.ACC_PUBLIC,m,null,null,cw);
        ga.loadThis();
        ga.invokeConstructor(Type.getType(Object.class), m);
        ga.returnValue();
        ga.endMethod();
        /*
         * 在HelloWorld中添加main方法，在main方法中添加代码，代码现在是这样子
         * public class HelloWorld{
         *  public static void mian(String[] args){
         *      System.out.println("Hello World!");
         *  }
         * }
         */
        m = Method.getMethod("void main (String[])");
        ga = new GeneratorAdapter(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, m, null, null, cw);
        ga.getStatic(Type.getType(System.class), "out", Type.getType(PrintStream.class));
        ga.push("Hello World!");
        ga.invokeVirtual(Type.getType(PrintStream.class), Method.getMethod("void println (String)"));
        ga.returnValue();
        ga.endMethod();
        cw.visitEnd();
        /*
         * 这个方法用于后面的类动态加载测试,HelloWorld中的结构现在已经变成
         * public class HelloWorld{
         *  public static void mian(String[] args){
         *      System.out.println("Hello World!");
         *  }
         *  public void doSomething(){
         *      System.out.println("动态生成，动态加载调用方法");
         *  }
         * }
         */
        m=Method.getMethod("void doSomething()");
        ga=new GeneratorAdapter(Opcodes.ACC_PUBLIC,m,null,null,cw);
        ga.getStatic(Type.getType(System.class), "out", Type.getType(PrintStream.class));
        ga.push("动态生成，动态加载调用方法");
        ga.invokeVirtual(Type.getType(PrintStream.class), Method.getMethod("void println(String)"));
        ga.returnValue();
        ga.endMethod();


        MyClassLoader mcl=new MyClassLoader();
        //利用自定义的类加载器把生成类文件加载到jvm 。
        byte[]  bytes=cw.toByteArray();
        //返回的对象时被加载类的class
        Class hw=mcl.defineClassByName("HelloWorld", bytes, 0, bytes.length);
        try
        {
            //利用反射创建对象
            Object o=hw.newInstance();
            java.lang.reflect.Method method=   o.getClass().getMethod("doSomething");
            method.invoke(o);
            /*把文件生成的class文件写入磁盘 File.separator为文件分隔符（知道的勿喷）
             * ，它会根据操作系统不同，而自动转换，比直接写成\\这种通用性强。
             * 这个路径原来一般写成d:\\HelloWorld.class
             */
            File file=new File("d:"+File.separator+"test"+File.separator+"HelloWorld.class");
            FileOutputStream fos=new FileOutputStream(file);
            fos.write(cw.toByteArray());
            fos.flush();
            fos.close();
        }
        catch (FileNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (InstantiationException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (SecurityException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (NoSuchMethodException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IllegalArgumentException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (InvocationTargetException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
