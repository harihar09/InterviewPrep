package com.interviewPrep.DesignPatterns.Singleton;

public final class SingleTonEx {
    private static SingleTonEx INSTANCE = null;
    private SingleTonEx(){

    }
    public static SingleTonEx getInstance(){
        if(INSTANCE == null){
            INSTANCE = new SingleTonEx();
        }
        return  INSTANCE;
    }
    public static void main(String[] args) {
        SingleTonEx instance = getInstance();
        System.out.println(instance.hashCode());
        SingleTonEx instance1 = getInstance();
        System.out.println(instance1.hashCode());
        SingleTonEx instance2 = getInstance();
        System.out.println(instance2.hashCode());
    }
}
