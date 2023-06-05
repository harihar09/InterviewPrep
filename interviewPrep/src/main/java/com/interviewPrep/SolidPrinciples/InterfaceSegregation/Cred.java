package com.interviewPrep.SolidPrinciples.InterfaceSegregation;

public class Cred implements UPIPayments,BonusPoints {
    @Override
    public String getBonusPoints() {
        return null;
    }

    @Override
    public void pay() {

    }

    @Override
    public String getCashBack() {
        return null;
    }
}
