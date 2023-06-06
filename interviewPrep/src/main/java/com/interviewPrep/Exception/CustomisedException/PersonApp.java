package com.interviewPrep.Exception.CustomisedException;

import java.util.Scanner;

public class PersonApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        if(age < 18 ){
            throw  new CustomisedException("Not allowed for voting");
        }
        System.out.println("Allowed");
    }
}
