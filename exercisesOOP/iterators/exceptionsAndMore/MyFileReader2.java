package exercisesOOP.iterators.exceptionsAndMore;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFileReader2 {

  public static void main(String[] args) throws FileNotFoundException {
    read();
//файловете се считат за входно - изходни операции и затова трябва да се обработят за грешки
  }

  public static void read()  {
    Scanner reader = null;
    try {
      reader = new Scanner(new File("numbers.txt"));
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);// ДА ПИТАМ ???
    }

    while (reader.hasNextLine()) {
      String line = reader.nextLine();
      System.out.println(line);
    }
    reader.close();
  }
}
