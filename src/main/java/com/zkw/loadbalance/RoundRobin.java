package com.zkw.loadbalance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 负载均衡轮询法RoundRobin
 * 存在的问题：
 * 1.无法感知地址列表的上线、下线。
 * 2.由于synchronized，代码并发吞吐量明显下降
 * 3.当服务下线时有可能访问到刚下线的那台。
 * @author James
 * @create 2017-04-12 下午 9:09
 **/

public class RoundRobin {
    private  static Map<String,Integer> serverWeightMap=new HashMap<String, Integer>();
    private  static Integer pos = 0;
    private static void servers(){
        serverWeightMap.put("192.168.31.1",1);
        serverWeightMap.put("192.168.31.3",2);
        serverWeightMap.put("192.168.31.4",3);
    }

    public static String testRoundRobin(){
        //重新创建一个map,避免出现由于服务器上线下线导致的并发问题
        Map<String,Integer> serverMap=new HashMap<String, Integer>();
        serverMap.putAll(serverWeightMap);
        //取得IP地址list
        Set<String> keySet=serverMap.keySet();
        ArrayList<String> keyList=new ArrayList<String>();
        keyList.addAll(keySet);
        String server = null;

        synchronized (pos){
            if (pos>=keySet.size()){
                pos=0;
            }
            server=keyList.get(pos);
            pos++;
        }
        return server;
    }
    public static void main(String[] args) {
        servers();
        while (true){
            System.out.println(testRoundRobin());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
