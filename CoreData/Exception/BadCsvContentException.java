package CoreData.Exception;

public class BadCsvContentException extends Exception{
    public BadCsvContentException() {
        super("Недопустимый CSV-файл, невозможно загрузить телефонную книгу");
    }
}