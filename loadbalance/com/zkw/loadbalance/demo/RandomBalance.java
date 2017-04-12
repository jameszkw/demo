package com.zkw.loadbalance.demo;

import java.util.*;

/**
 * 负载均衡随机法(RandomBalance)
 * 吞吐量越大，效果越接近轮询。且不用synchronized控制位置。
 * 用此方法替代轮询法（RoundRobin），因为性能比RR好。
 *
 * @author James
 * @create 2017-04-12 下午 9:38
 **/

public class RandomBalance {
    private  static Map<String,Integer> serverWeightMap=new HashMap<String, Integer>();
    private static void servers(){
        serverWeightMap.put("192.168.31.1",1);
        serverWeightMap.put("192.168.31.3",2);
        serverWeightMap.put("192.168.31.4",3);
    }

    public static String testRandom(){
        //重新创建一个map,避免出现由于服务器上线下线导致的并发问题
        Map<String,Integer> serverMap=new HashMap<String, Integer>();
        serverMap.putAll(serverWeightMap);
        //取得IP地址list
        Set<String> keySet=serverMap.keySet();
        ArrayList<String> keyList=new ArrayList<String>();
        keyList.addAll(keySet);
        Random random=new Random();
        int randomPos=random.nextInt(keyList.size());
        String server=keyList.get(randomPos);
        return server;
    }

    public static void main(String[] args) {
        servers();
        while (true){
            System.out.println(testRandom());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
