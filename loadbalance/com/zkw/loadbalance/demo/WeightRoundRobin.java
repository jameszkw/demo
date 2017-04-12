package com.zkw.loadbalance.demo;

import java.util.*;

/**
 * 加权轮询（Weight Round Robin）
 * 与轮询法类似，只是获取服务器地址前增加了一段权重计算代码
 * @author James
 * @create 2017-04-12 下午 10:17
 **/

public class WeightRoundRobin {
    private  static Map<String,Integer> serverWeightMap=new HashMap<String, Integer>();
    private static Integer pos = 0;
    private static void servers(){
        serverWeightMap.put("192.168.31.2",1);
        serverWeightMap.put("192.168.31.3",2);
        serverWeightMap.put("192.168.31.4",3);
    }

    public static String testWeightRoundRobin(){
        //重新创建一个map,避免出现由于服务器上线下线导致的并发问题
        Map<String,Integer> serverMap=new HashMap<String, Integer>();
        serverMap.putAll(serverWeightMap);
        //取得IP地址list
        List<String> serverList=new ArrayList<String>();
        Set<Map.Entry<String,Integer>> entrysSet = serverMap.entrySet();
        for (Map.Entry<String,Integer> entry:entrysSet){
            String server=entry.getKey();
            Integer weight=entry.getValue();
            for (int i=0;i<weight;i++){
                serverList.add(server);
            }
        }
        String server=null;
        synchronized (pos){
            if (pos>=serverList.size()){
                pos=0;
            }
            server=serverList.get(pos);
            pos++;
        }
        return server;
    }

    public static void main(String[] args) {
        servers();
        while (true){
            System.out.println(testWeightRoundRobin());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
