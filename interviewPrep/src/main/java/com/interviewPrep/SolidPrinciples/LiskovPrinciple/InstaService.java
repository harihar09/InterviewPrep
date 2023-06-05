package com.interviewPrep.SolidPrinciples.LiskovPrinciple;

// InstaService follows liskov principle as it's completely replace parents
public class InstaService implements SocialMediaInterface,PostMedia{
    @Override
    public void post() {

    }

    @Override
    public void chat() {

    }
}
