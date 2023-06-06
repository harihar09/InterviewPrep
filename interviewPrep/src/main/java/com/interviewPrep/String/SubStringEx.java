package com.interviewPrep.String;

public class SubStringEx {
    public static void main(String[] args) {
        // start - inclusive
        // end - exclusive

        String string = "hello";
        System.out.println(string.substring(1));
        System.out.println(string.substring(1,5));
        //StringIndexOutOfBoundException - end is more than string length
        System.out.println(string.substring(2,6));
    }
}
