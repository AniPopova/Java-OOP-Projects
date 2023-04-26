package homework5.phonebook.modification;

public class PhoneBookFullException extends Exception
{
  public PhoneBookFullException()
  {
    System.err.println("Телефонния указател е пълен!");
  }
}
