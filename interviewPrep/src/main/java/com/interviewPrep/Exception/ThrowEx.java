package com.interviewPrep.Exception;

import java.io.FileNotFoundException;

public class ThrowEx {

    static ArithmeticException exception = new ArithmeticException();
    static CustomisedThrowClass customisedThrowClass = null;

    public static void main(String[] args) {
        // throw is used to handover manually created exception object to JVM
        //   throw  exception;
        //   System.out.println("unreachable code");
        // class should be throwable. should extend RuntimeException class
        //  throw customisedThrowClass;
        //throw exception;  // Unchecked exception hence it's not required to handel it
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println(e);
        }
        //in program if there is chance of raising exception i.e. in case of
        // checked exception we need to handle it either by declaring it using throws keyword
        // or by using try catch block

    }
}
