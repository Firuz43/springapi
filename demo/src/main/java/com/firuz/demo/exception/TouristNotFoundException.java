package com.firuz.demo.exception;

public class TouristNotFoundException extends RuntimeException {

    public TouristNotFoundException(String msg) {
        super(msg);
    }
}
