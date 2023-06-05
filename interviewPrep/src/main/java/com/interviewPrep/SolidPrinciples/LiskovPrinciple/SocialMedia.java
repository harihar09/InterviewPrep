package com.interviewPrep.SolidPrinciples.LiskovPrinciple;

public abstract class SocialMedia {
    // supported by FB, Whatsapp and instagram
    public abstract void chat();
    // supported by FB and Whatsapp
    public abstract  void groupVideoCall();
    // supported by FB and instagram
    public abstract  void post();
}
