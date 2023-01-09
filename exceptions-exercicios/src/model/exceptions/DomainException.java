package model.exceptions;

public class DomainException extends Exception {

    private String msg;


    public DomainException(String msg){
        super(msg);
    }
    
}
