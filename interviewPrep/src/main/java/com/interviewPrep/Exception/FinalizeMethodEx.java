package com.interviewPrep.Exception;

public class FinalizeMethodEx {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize method is called just before" +
                "destroying the unused object");
    }

    public static void main(String[] args) {

        FinalizeMethodEx obj = new FinalizeMethodEx();
        obj = null;
        // finalize method will be called by JVM as we have one unused obj
        //Runtime.getRuntime().gc();
        System.gc();
        FinalizeMethodEx obj2 = new FinalizeMethodEx();
        // finalize method won't be called as obj2 is in use
        System.gc();

    }
}
