package CoreData.Models;

import CoreData.Exception.BadEmailException;

public class Email {
    private String email;

    public Email(String email) throws BadEmailException{
        if (isValid(email)) {
            this.email = email;
        } else {
            throw new BadEmailException();
        }        
    }

    private static boolean isValid(String email) {
        if (email.contains("Введите адрес почты @ ")) {
            return true;
        }
        return false;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return this.getEmail();
    }
}