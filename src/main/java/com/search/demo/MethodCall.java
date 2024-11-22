package com.search.demo;

import static com.search.demo.MethodOverride.method1;

public class MethodCall {
    public static void main(String[] args) {
        MethodOverride methodOverride = new MethodOverride();
        methodOverride.method1("123");
        methodOverride.method1("123", "456");
    }


    public void callMethod(String str) {
        method1("123", "456", "789");
    }
}
