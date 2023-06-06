package com.interviewPrep.DesignPatterns.Singleton;

import lombok.Synchronized;

public class DoubleLockSingleTon {

    private static DoubleLockSingleTon instance;

    private DoubleLockSingleTon() {

    }
    public static DoubleLockSingleTon getInstance() {
        if (instance == null) {
            synchronized (DoubleLockSingleTon.class) {
                if (instance == null) {
                    instance = new DoubleLockSingleTon();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        DoubleLockSingleTon obj = getInstance();
        System.out.println(obj.hashCode());
        DoubleLockSingleTon obj1 = getInstance();
        System.out.println(obj1.hashCode());
        DoubleLockSingleTon obj2 = getInstance();
        System.out.println(obj2.hashCode());
    }

}
