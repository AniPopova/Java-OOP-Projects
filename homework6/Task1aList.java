package homework6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Task1aList {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int listSize = 0;
    int counter = 0;

    List<Integer> myFirstList = new ArrayList<>();
    System.out.print("Please enter the size of the list: ");
    listSize = Integer.parseInt(scanner.nextLine());
    for (int i = 0; i < listSize; i++) {
      System.out.print("Please enter a number to add to the list: ");
      int newNumber = Integer.parseInt(scanner.nextLine());
      myFirstList.add(newNumber);
    }

    System.out.println("My first list: " + myFirstList);
    Collections.sort(myFirstList);
    System.out.println("My first list sorted: " + myFirstList);
    Collections.reverse(myFirstList);
    System.out.println("My first list reversed: " + myFirstList);

    List<Integer> mySecondList = new ArrayList<>();
    for (int i = 0; i < listSize; i++) {
      System.out.print("Please enter a number to add to the second list: ");
      int newNumber = Integer.parseInt(scanner.nextLine());
      mySecondList.add(newNumber);
    }

    ListIterator<Integer> listIterator = mySecondList.listIterator();
    ListIterator<Integer> listIterator2 = mySecondList.listIterator();

    System.out.println("Are both lists equal: " + listIterator.equals(listIterator2));
    System.out.println(
        "Are both lists equal by direct comparison: " + myFirstList.equals(mySecondList));

    while (true) {
      int first = 0;
      int second = 0;
      if (mySecondList.size() != counter) {
        for (int i = 0; i < listSize; i++) {
          first = myFirstList.get(i);
          second = mySecondList.get(i);
          if (first > second) {
            System.out.println("Element " + myFirstList.get(i)
                + " from the first list is bigger than element " + mySecondList.get(i)
                + " from the second list");
          } else if (first < second) {
            System.out.println("Element " + mySecondList.get(i)
                + " from the second list is bigger than element " + myFirstList.get(i)
                + " from the first list");
          } else {
            System.out.println("Element " + myFirstList.get(i)
                + " from the first list is equal to element " + mySecondList.get(i)
                + " from the second list");
          }
          counter++;
        }
      } else {
        break;
      }
    }
  }
}

