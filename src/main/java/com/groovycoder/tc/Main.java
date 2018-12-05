package com.groovycoder.tc;

import org.testcontainers.containers.GenericContainer;

public class Main {


    public static void main(String[] args) {
        new GenericContainer<>("httpd").withExposedPorts(80).start();
    }
}
