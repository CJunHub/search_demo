package com.search.demo;

public class MethodCall {
    public static void main(String[] args) {
        MethodOverride methodOverride = new MethodOverride();
        methodOverride.method1("123");
        methodOverride.method1("123", "456");
    }
}
