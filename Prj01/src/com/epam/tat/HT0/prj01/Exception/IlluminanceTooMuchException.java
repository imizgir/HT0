package com.epam.tat.HT0.prj01.Exception;

public class IlluminanceTooMuchException extends Exception {
    public IlluminanceTooMuchException() {
    }

    public IlluminanceTooMuchException(String message) {
        super(message);
    }

    public IlluminanceTooMuchException(String message, Exception e) {
        super(message, e);
    }
}
