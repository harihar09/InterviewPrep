package com.interviewPrep.SolidPrinciples.DipendencyInversion;

public class DebitCard implements  Bankcard {
    public void pay(int amount) {
        System.out.println("Paid "+amount+" rupees via debit card");
    }
}
