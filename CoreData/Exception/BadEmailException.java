package CoreData.Exception;

public class BadEmailException extends Exception{
    public BadEmailException() {
        super("Неверный адрес электронной почты");
    }
}