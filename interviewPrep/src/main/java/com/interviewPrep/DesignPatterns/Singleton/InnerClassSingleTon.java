package com.interviewPrep.DesignPatterns.Singleton;

public class InnerClassSingleTon {
    private InnerClassSingleTon() {

    }

    private static class SingleTonHelper {
        private static final InnerClassSingleTon instance = new InnerClassSingleTon();
    }

    public static InnerClassSingleTon getInstance() {
        return SingleTonHelper.instance;
    }

    public static void main(String[] args) {
        InnerClassSingleTon obj = getInstance();
        System.out.println(obj.hashCode());
        InnerClassSingleTon obj1 = getInstance();
        System.out.println(obj1.hashCode());
        InnerClassSingleTon obj2 = getInstance();
        System.out.println(obj2.hashCode());

    }
}
