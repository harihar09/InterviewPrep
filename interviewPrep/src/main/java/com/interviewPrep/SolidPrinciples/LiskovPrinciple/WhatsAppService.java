package com.interviewPrep.SolidPrinciples.LiskovPrinciple;

// WhatsAppService follows liskov principle as it's completely replace parents
public class WhatsAppService implements SocialMediaInterface,VideoCallMedia{
    @Override
    public void chat() {

    }

    @Override
    public void groupVideoCall() {

    }
}
