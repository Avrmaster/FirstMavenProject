package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () {
    }

    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }

    public HelloClass(String name, String period) { this.message = "Good " + period + ", " + name + "!"; }

    public static HelloClass fromGender(String name, String gender) {
        HelloClass helloClass = new HelloClass();
        helloClass.message = "Hello, " + gender + " " + name;
        return helloClass;
    }

    public String getMessage() {
        return message;
    }
}
