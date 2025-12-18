
package com.example.demo.exception;

public class ResourceNotFoundExceptionHandler extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }

}