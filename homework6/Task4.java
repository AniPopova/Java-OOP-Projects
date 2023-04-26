package homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    List<Integer> myList = new ArrayList<>();
    System.out.print("Избрете дължинана списъка с елементи: ");
    int listSize = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < listSize; i++) {
      System.out.printf("Добавете елемент с индекс №% d в списъка: ", i);
      myList.add(Integer.parseInt(scanner.nextLine()));
    }
    for (int i = 0; i < myList.size() - 1; i++) { //взима първия елемнт и започва да обхожда списъка

      for (int j = i + 1; j < myList.size(); j++) { // взима втория елемнт и сравнява с първия
        int max = myList.get(i); // взима по-големия от двата сравнение последователни елемнти

        for (int k = i; k <= j; k++) {
          if (myList.get(k) > max) {
            max = myList.get(k); // още едно завъртане за максимална стойност преди да принтира двойките идекси + 1
          }
        }
        System.out.print("(" + (i + 1) + ", " + (j + 1) + ")");
      }
    }
  }
}



