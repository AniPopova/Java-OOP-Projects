package exercisesOOP.iterators.exceptionsAndMore;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MyFileWriter {

  public static void main(String[] args) throws FileNotFoundException {
    PrintWriter writer = new PrintWriter("numbers.txt"); //ако файла съществува ще бъде презаписан, ако не ще бъде създаден

    for (int i = 1; i <=10 ; i++) {
      writer.println(i); //ще пише на нов ред на всяка итерация във файла "numbers.txt"
    }
    writer.flush(); //с този метод изпразваме буфера, ако има нещо останало в него и го записваме във файла
    writer.close(); //с този метод затваряме самия файл, за да могат и други ппрограми/юзъри да го ползват
  }

}
