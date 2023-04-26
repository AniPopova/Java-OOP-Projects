package exercisesOOP.iterators.exceptionsAndMore;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFileReader3 {

  public static void main(String[] args){
    try {
      read();
    } catch (FileNotFoundException e) {
      System.err.println(e.getMessage());
    }
    //файловете се считат за входно - изходни операции и затова трябва да се обработят за грешки
  }
  public static void read() throws FileNotFoundException {
    Scanner reader;
//    try {
      reader = new Scanner(new File("numbers2.txt"));

      while (reader.hasNextLine()) {
        String line = reader.nextLine();
        System.out.println(line);
      }
      reader.close();

//    } catch (FileNotFoundException e) {
//     // e.printStackTrace(); //FileNotFoundException: numbers2.txt (The system cannot find the file specified) - АКО ТЪРСИМ ФАЙЛ, КОЙТО НЕ СЪЩЕСТВУВА!!!
//      System.err.println(e.getMessage());
//    }
  }
}
