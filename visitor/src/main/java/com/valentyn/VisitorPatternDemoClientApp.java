package com.valentyn;

public class VisitorPatternDemoClientApp {

    public static void main(String[] args) {
        ClientVisitor client = new ClientVisitor();
        client.executeVisitorPattern();
    }
}