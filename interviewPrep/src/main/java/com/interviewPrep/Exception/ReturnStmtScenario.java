package com.interviewPrep.Exception;

public class ReturnStmtScenario {
    private static int test(){
        try{
            int i = 10/0;
            return 1;
        }catch (Exception e){
            return 2;
        }
        // finally block always get executed so it returns 3
        finally {
            // forcefully exit from finally block
           // System.exit(1);
            //return 3;
        }
    }
    public static void main(String[] args) {
        System.out.println(test());
    }
}
