package com.interviewPrep.SolidPrinciples.LiskovPrinciple;

// FBService follows liskov principle as it's completely replace parents
public class FBService implements SocialMediaInterface, VideoCallMedia, PostMedia {
    @Override
    public void chat() {

    }

    @Override
    public void groupVideoCall() {

    }

    @Override
    public void post() {

    }
}
