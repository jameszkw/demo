package com.zkw.loadbalance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 原地址哈希（Hash）法
 *
 * @author James
 * @create 2017-04-12 下午 9:49
 **/

public class ConsumerHash {
    private  static Map<String,Integer> serverWeightMap=new HashMap<String, Integer>();
    private static void servers(){
        serverWeightMap.put("192.168.31.2",1);
        serverWeightMap.put("192.168.31.3",2);
        serverWeightMap.put("192.168.31.4",3);
    }


    public static String testConsumerHash(String remoteip){
        //重新创建一个map,避免出现由于服务器上线下线导致的并发问题
        Map<String,Integer> serverMap=new HashMap<String, Integer>();
        serverMap.putAll(serverWeightMap);
        //取得IP地址list
        Set<String> keySet=serverMap.keySet();
        ArrayList<String> keyList=new ArrayList<String>();
        keyList.addAll(keySet);

        int hashCode=remoteip.hashCode();
        int serverListSize=keyList.size();
        int serverPos=hashCode%serverListSize;
        return keyList.get(serverPos);
    }
    public static void main(String[] args) {
        servers();
        System.out.println(testConsumerHash("192.168.31.1"));
    }
}
