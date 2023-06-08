package com.interviewPrep.String;

public class StringInternMethod {
    public static void main(String[] args) {
        // heap - john and scp - john -> two objects
        String str1 = new String("john");
        // scp - refers to existing john object -
        String str2 = "john";
        // so total 2 objects will be created
        // intern() will be used to get reference from scp
        System.out.println(str1.intern());
        System.out.println(str1.intern().hashCode()==str2.hashCode());

    }
}
