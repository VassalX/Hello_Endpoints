package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () {
    }

    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }
    
    public HelloClass (String name,String period) {
        this.message = "Good " + period + ", " + name + "!";
    }
    
    public HelloClass (String name,String period,String gender) {
    	System.out.println(gender);
        this.message = "Good " + period + ", " + name + "!\nHow are you, " + gender + "?";
    }

    public String getMessage() {
        return message;
    }
}
