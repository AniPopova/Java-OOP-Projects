package exercisesOOP.iterators.exceptionsAndMore;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFileReader4 {

  public static void main(String[] args) {
    read();
  }
  public static void read(){
    Scanner reader = null;
    try {
      reader = new Scanner(new File("numbers2.txt"));

      while (reader.hasNextLine()) {
        String line = reader.nextLine();
        System.out.println(line);
      }
    } catch (FileNotFoundException e) {
      System.err.println(e.getMessage());
    } finally { //кода тук се изпълнява при всички възможни ситуации, това освобождава ресурсите
      try {
      if (reader != null) { //проверяваме дали имаме нещо и накрая при всички случаи освобождаваме (файла, ако имаме такъв)
        reader.close(); // за да позваме променливата тук, инициализирахме скенера по-горе с null
      }
      }catch (Exception e) {
        System.err.println(e.getMessage());
      }
    }
  }
}