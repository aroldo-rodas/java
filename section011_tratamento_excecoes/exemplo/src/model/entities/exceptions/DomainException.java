package model.entities.exceptions;

//Herda caracteríticas da classe Exception
public class DomainException extends RuntimeException {
    
    public DomainException(String msg) {
        super(msg);
    }
}
