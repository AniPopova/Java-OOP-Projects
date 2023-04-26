package homework6;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Task1bSet {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Integer[] myArray = {96, 18, 9, 17, 16, 5, 9};
    Set<Integer> mySet = new HashSet<>(Arrays.asList(myArray));

    System.out.println("The size of my set is: " + mySet.size());
    System.out.println("The set contains: " + mySet);

    System.out.println("And now the set, but sorted:");
    mySet
        .stream()
        .sorted()
        .forEach(System.out::println);

    System.out.println("Now printed out again, but using another method: ");

    Iterator<Integer> setIterator = mySet.iterator();
    while (setIterator.hasNext()) {
      Integer next = setIterator.next();
      System.out.println("Next: " + next);
    }
    System.out.println("Enhanced for");
    for (Integer integer : mySet) {
      System.out.println("Next: " + integer);
    }

    int option = 0;
    while (option != 2) {
      System.out.print(
          "Do you want to add more numbers in the set? Please choose (1)-Yes, (2)-No ");
      option = scanner.nextInt();
      if (option == 1) {
        System.out.println("Please enter a number: ");
        int newNumber = Integer.parseInt(scanner.next());
        if (mySet.contains(newNumber)) {
          System.out.print("You can not repeat numbers. Add different number. ");
        } else {
          mySet.add(newNumber);
        }
      } else if (option == 2) {
        break;
      }
    }

    System.out.println("My new set unsorted: " + mySet);
    System.out.println("My new set sorted: ");

    Set<Integer> mySortedSet = new TreeSet<>(mySet);
    System.out.println(mySortedSet);
    mySet.add(77);

    System.out.println("Are the two sets equal " + mySet.equals(mySortedSet));
    System.out.println();
    Collections.reverse(Collections.singletonList(mySet));
  }
}


