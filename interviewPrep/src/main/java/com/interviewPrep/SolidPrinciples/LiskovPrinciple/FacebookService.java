package com.interviewPrep.SolidPrinciples.LiskovPrinciple;

public class FacebookService extends SocialMedia {
    @Override
    public void chat() {

    }

    @Override
    public void groupVideoCall() {

    }
// not applicable - so this class doesn't follow liskov principle
    @Override
    public void post() {

    }
}
