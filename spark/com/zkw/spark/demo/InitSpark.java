package com.zkw.spark.demo;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;

/**
 * Created by Administrator on 2016/11/26 0026.
 */
public class InitSpark {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setMaster("192.168.1.103").setAppName("error number");
        JavaSparkContext sc = new JavaSparkContext(conf);
        JavaRDD<String> inputRDD = sc.textFile("bytebuffer.txt");
        JavaRDD<String> errorRDD = inputRDD.filter(
                new Function<String, Boolean>() {
                    public Boolean call(String s) throws Exception {
                        return s.contains("error");
                    }
                }
        );
    }
}
