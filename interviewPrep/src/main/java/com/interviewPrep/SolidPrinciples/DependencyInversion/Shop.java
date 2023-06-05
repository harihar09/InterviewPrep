package com.interviewPrep.SolidPrinciples.DependencyInversion;

public class Shop {

    // tightly coupled with card
    // private DebitCard debitCard;
    // for credit card we need to modify the class

    /* public Shop(DebitCard debitCard){
         this.debitCard = debitCard;
     }*/
    // loosely coupled - accept any bank card
    private Bankcard bankcard;

    public Shop(Bankcard bankcard) {
        this.bankcard = bankcard;
    }

    private void payment(int amount) {
        bankcard.pay(amount);
    }

    public static void main(String[] args) {
        //DebitCard debitCard = new DebitCard();
        Bankcard bankcard = new CreditCard();
        Shop shop = new Shop(bankcard);
        shop.payment(100);
    }
}
