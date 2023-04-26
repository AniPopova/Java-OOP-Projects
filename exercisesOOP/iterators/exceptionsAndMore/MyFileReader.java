package exercisesOOP.iterators.exceptionsAndMore;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFileReader {

  public static void main(String[] args) throws FileNotFoundException
  {
    File file = new File("numbers.txt");
    Scanner reader = new Scanner(file); //можем да подадем името на файла за четене, което трябва да е точно като на файла
    //  Scanner reader = new Scanner(new File("numbers.txt")); //можем и по този начин

    while (reader.hasNextLine()) { // с този метод ще чете докато има нещо за четене
      String line = reader.nextLine(); // тук можем да прочетем различни видове данни int, double ...
      System.out.println(line);
      // System.out.println(reader.nextLine()); - може и така
    }
    //  reader.flush(); този метод се вика, само когато записваме файл, но не и при четенето му
    reader.close();

  }
}
