package com.mycompany.app;

/**
 * Hello world!-welcome
 */
public class App
{

    private final String message = "Hello Wrldo!-Welcome";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
