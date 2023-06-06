package com.interviewPrep.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedUncheckedException {
    public static void main(String[] args) {

        try {
            System.out.println("hi");
            // go with child class exception first and then parent
       /* } catch (Exception e) {
            System.out.println(e);
        }*/
        } catch (ArithmeticException e) { // unchecked
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        // no chance of raising the checked exception hence it won't compile
        /*try{
            System.out.println("hello");
        }catch (IOException e){ // checked
            System.out.println(e);
        }*/
    }
}
