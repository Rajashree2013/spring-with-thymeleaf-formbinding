package se.lexicon.rajashree.exception;

import java.time.LocalDateTime;

public class Error {
    private String code;
    private String message;
    private final LocalDateTime dateTime;

    public Error() {
        dateTime = LocalDateTime.now();
    }

    public Error(String code, String message) {
        this();
        this.code = code;
        this.message = message;
    }
}
