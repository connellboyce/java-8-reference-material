package com.connellboyce.interfacedemo;

public class SomeClass implements SomeInterface {
    @Override
    public String sayHello() {
        return "hello";
    }

    public String testDefault() {
        return sayDefault();
    }
}
