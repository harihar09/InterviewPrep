package com.interviewPrep.SolidPrinciples.SingleResponsibility;

public class NotificationService {
    private void getPassbookNotification(){
        // passBook related logic
    }
    private void getOtp(String medium){

        if(medium.equals("Mobile")){
            // otp on mobile
        }
        if(medium.equals("Email")){
            // otp on email
        }
    }
}
