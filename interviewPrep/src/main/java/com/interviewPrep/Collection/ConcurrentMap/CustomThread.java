package com.interviewPrep.Collection.ConcurrentMap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CustomThread extends Thread {
    //ConcurrentModificationException
   // static Map<String, Integer> map = new HashMap<>();
    static Map<String, Integer> map = new ConcurrentHashMap<>();

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            map.put("s", 3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        map.put("a", 2);
        map.put("d", 3);
        CustomThread thread = new CustomThread();
        thread.start();
        // main thread iterating the map
        for(Object obj : map.entrySet()){
            System.out.println(obj);
            Thread.sleep(1000);
        }
        Thread.sleep(1000);
        System.out.println(map);
    }
}
