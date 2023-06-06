package com.interviewPrep.DesignPatterns.Singleton;

public class LazySingleTon {
    private static LazySingleTon instance ;
    private LazySingleTon(){

    }
    public static LazySingleTon getInstance(){
        if(instance == null)
            instance = new LazySingleTon();
        return  instance;
    }

    public static void main(String[] args) {
        LazySingleTon obj1 = LazySingleTon.getInstance();
        System.out.println(obj1.hashCode());
        LazySingleTon obj2 = LazySingleTon.getInstance();
        System.out.println(obj2.hashCode());
    }
}
