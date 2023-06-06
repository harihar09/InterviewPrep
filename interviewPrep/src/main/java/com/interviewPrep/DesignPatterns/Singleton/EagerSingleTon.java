package com.interviewPrep.DesignPatterns.Singleton;

public class EagerSingleTon {
    private static EagerSingleTon instance = new EagerSingleTon();
    private EagerSingleTon(){

    }
    public static EagerSingleTon getInstance(){
        return  instance;
    }

    public static void main(String[] args) {
        EagerSingleTon obj1 = EagerSingleTon.getInstance();
        System.out.println(obj1.hashCode());
        EagerSingleTon obj2 = EagerSingleTon.getInstance();
        System.out.println(obj2.hashCode());
    }
}
