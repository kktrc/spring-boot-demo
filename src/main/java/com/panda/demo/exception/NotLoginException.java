package com.panda.demo.exception;

public class NotLoginException extends RuntimeException {

    public NotLoginException(String message) {
        super(message);
    }
}
