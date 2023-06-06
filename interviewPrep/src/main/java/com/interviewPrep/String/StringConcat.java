package com.interviewPrep.String;

public class StringConcat {
    public static void main(String[] args) {
        // using + and concat method
        // after String object
        String string = 10+20+"clare"+30+40;
        System.out.println(string);
        String str = "clare";
        str.concat("maria");
        System.out.println(str);
        str = str.concat("maria");
        System.out.println(str);
    }
}
