package com.example.fn;

public class HelloFunction {

    public Response handleRequest(String input) {
        Response response = new Response();
        response.setTitle("My Code Card");
        response.setSubtitle("Duke");
        response.setBodytext("Hello world");
        response.setTemplate("template1");
        response.setIcon("duke");
        response.setBackgroundColor("white");
        return response;
    }

}