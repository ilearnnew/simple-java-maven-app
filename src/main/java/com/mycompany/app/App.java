package com.mycompany.app;

/**
 * Hello world!-welcome
 *newcomment
 */
public class App
{

    private final String message = "Hello Wrldo!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
