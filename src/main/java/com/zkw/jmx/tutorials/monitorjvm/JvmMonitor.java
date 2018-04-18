package com.zkw.jmx.tutorials.monitorjvm;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

/**
 * 监控JVM参数
 *
 * @author James
 * @create 2017-07-14 下午 1:58
 **/

public class JvmMonitor {
    public static void main(String[] args) {
        MemoryMXBean memorymbean = ManagementFactory.getMemoryMXBean();
        MemoryUsage usage = memorymbean.getHeapMemoryUsage();
        System.out.println("INIT HEAP: " + usage.getInit());
        System.out.println("MAX HEAP: " + usage.getMax());
        System.out.println("USE HEAP: " + usage.getUsed());
    }
}
