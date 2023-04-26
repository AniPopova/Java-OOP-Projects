package homework6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2aList {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    List<Integer> list1 = new ArrayList<>();
    System.out.println("How long is your first list? ");
    int list1Size = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < list1Size; i++) {
      System.out.printf("Enter number Nr:%d -> ", i);
      list1.add(Integer.parseInt(scanner.nextLine()));
    }
    System.out.println("My first list is " + list1);

    List<Integer> list2 = new ArrayList<>();
    System.out.println("How long is your second list? ");
    int list2Size = Integer.parseInt(scanner.nextLine());
    for (int i = 0; i < list2Size; i++) {
      System.out.printf("Enter number Nr:%d -> ", i);
      list2.add(Integer.parseInt(scanner.nextLine()));
    }
    System.out.println("My second  list is " + list2);

    for (Integer i : list1) {
      if (list2.contains(i)) {
        list2.remove(i);
        System.out.println(i + " is common.");
      }
    }

    List<Integer> list3 = Stream.of(list1, list2)
        .flatMap(Collection::stream)
        .collect(Collectors.toList());
    System.out.println("List 1 + List 2 = list 3 =>" + list3);

    Collections.sort(list3);
    System.out.println("List 3 sorted: " + list3);

  }
}
