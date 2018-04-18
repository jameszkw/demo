package com.zkw.loadbalance;

import java.util.*;

/**
 * 加权随机法（WeightRandom）
 *
 * @author James
 * @create 2017-04-12 下午 10:30
 **/

public class WeightRandom {
    private static Map<String, Integer> serverWeightMap = new HashMap<String, Integer>();
    private static Integer pos = 0;

    private static void servers() {
        serverWeightMap.put("192.168.31.2", 1);
        serverWeightMap.put("192.168.31.3", 1);
        serverWeightMap.put("192.168.31.4", 9);
    }

    public static String testWeightRandom() {
        //重新创建一个map,避免出现由于服务器上线下线导致的并发问题
        Map<String, Integer> serverMap = new HashMap<String, Integer>();
        serverMap.putAll(serverWeightMap);
        //取得IP地址list
        List<String> serverList = new ArrayList<String>();
        Set<Map.Entry<String, Integer>> entrysSet = serverMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrysSet) {
            String server = entry.getKey();
            Integer weight = entry.getValue();
            for (int i = 0; i < 3; i++) {
                serverList.add(server);
            }
        }

        Random random = new Random();
        int randomPos = random.nextInt(serverList.size());
        String server=serverList.get(randomPos);
        return server;
    }

    public static void main(String[] args) {
        servers();
        while (true){
            System.out.println(testWeightRandom());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
