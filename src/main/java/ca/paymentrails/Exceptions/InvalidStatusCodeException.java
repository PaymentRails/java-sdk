package ca.paymentrails.Exceptions;

public class InvalidStatusCodeException extends Exception {

    public InvalidStatusCodeException() {
        super();
    }

    public InvalidStatusCodeException(String message) {
        super(message);
    }

}
