package com.interviewPrep.Exception.CustomisedException;

public class CustomisedException extends  RuntimeException{
    public CustomisedException(String message){
        super(message);
        // this message would be passed to parent class constructor i.e. RuntimeException
        // and then to Exception constructor and at last to Throwable class.
        // printStack() is available in Throwable class which will be called
        // by JVM default exception handler
    }
}



