package homework6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2b {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Set<Integer> mySet1 = new HashSet<Integer>();
    System.out.println("How long is your first set? ");
    int set1Size = Integer.parseInt(scanner.nextLine());
    for (int i = 0; i < set1Size; i++) {
      System.out.printf("Enter number Nr:%d -> ", i);
      mySet1.add(Integer.parseInt(scanner.nextLine()));
    }
    System.out.println("My first set is " + mySet1);

    Set<Integer> mySet2 = new HashSet<Integer>();
    System.out.println("How long is your second set? ");
    int set2Size = Integer.parseInt(scanner.nextLine());
    for (int i = 0; i < set2Size; i++) {
      System.out.printf("Enter number Nr:%d -> ", i);
      mySet2.add(Integer.parseInt(scanner.nextLine()));
    }
    System.out.println("My second set  is " + mySet2);

    Set<Integer> mySet3 = new HashSet<>();

    mySet3.addAll(mySet2);
    mySet3.addAll(mySet1);
    System.out.println("My combined set is =>"+mySet3);

    for (Integer i : mySet1) {
      if (mySet2.contains(i)) {
        System.out.println(i+" is common.");
      }
    }
  }
}
