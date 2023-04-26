package exercisesOOP.iterators.exceptionsAndMore;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFileReader5 {

  public static void main(String[] args)  {
    try { // на това ниво вече, защото е последно трябва да обработим възможното изключение
      read();
    } catch (FileNotFoundException e) {
      System.err.println(e.getMessage());
    }
  }
  public static void read() throws FileNotFoundException { // тук оказваме, че всъщност няма да обработваме изключението и по този начин го качваме едно ниво нагоре
    Scanner reader = null;

      reader = new Scanner(new File("numbers2.txt"));

      while (reader.hasNextLine()) {
        String line = reader.nextLine();
        System.out.println(line);
      }
      reader.close();
    }
  }
