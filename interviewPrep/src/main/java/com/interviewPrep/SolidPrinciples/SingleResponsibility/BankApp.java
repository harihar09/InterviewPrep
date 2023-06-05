package com.interviewPrep.SolidPrinciples.SingleResponsibility;

// this class doesn't follow SR principle as it contains many functionalities
public class BankApp {
    private void deposit(){
        // deposit related logic
    }
    private void withdraw(){
        // withdraw related logic
    }
    private void getPassbookNotification(){
        // passBook related logic
    }
    private void getOtp(){
        // notification related logic
    }
    private void viewAccountDetails(){
        // notification related logic
    }
    private void loanDetails(String loanType){
        // loan related logic
    }

}
