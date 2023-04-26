package exercisesOOP.iterators.exceptionsAndMore;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MyFileReaderWithResources {

  public static void main(String[] args) {
    read();
  }
  public static void read(){

    try (Scanner reader = new Scanner(new File("numbers2.txt"))){

      while (reader.hasNextLine()) {
        String line = reader.nextLine();
        System.out.println(line);
      }
    } catch (FileNotFoundException e) {
      e.getSuppressed();
      System.err.println(e.getMessage());
    }catch (IOException e) {
      System.err.println(e.getMessage());
    }
  }
}