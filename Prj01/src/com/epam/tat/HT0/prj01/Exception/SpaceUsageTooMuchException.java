package com.epam.tat.HT0.prj01.Exception;

public class SpaceUsageTooMuchException extends Exception {
    public SpaceUsageTooMuchException() {
    }

    public SpaceUsageTooMuchException(String message) {
        super(message);
    }

    public SpaceUsageTooMuchException(String message, Exception e) {
        super(message, e);
    }
}
