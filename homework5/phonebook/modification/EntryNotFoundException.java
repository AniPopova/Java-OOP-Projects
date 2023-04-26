package homework5.phonebook.modification;

public class EntryNotFoundException extends Exception{
    public EntryNotFoundException() {
        System.err.println("Записът не е намерен!");
    }
}
