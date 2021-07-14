package com.connellboyce.interfacedemo;

public interface SomeInterface {
    // public and abstract are implied
    String sayHello();

    // default methods can have a body in an interface
    default String sayDefault() {
        return "I am default";
    }
}
