package dev.dinesh.BookMyshow.Exception;

import java.util.List;

public class CityNotFoundException extends RuntimeException {
    private List<String> errors;

    public CityNotFoundException(String message,List<String> errors) {
        super(message);
        this.errors = errors;
    }

}
