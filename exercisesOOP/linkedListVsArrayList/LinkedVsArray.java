package exercisesOOP.linkedListVsArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedVsArray {

  public static void main(String[] args) {

    LinkedList<String> namesLinkedList = new LinkedList<>();
    namesLinkedList.add("John");
    namesLinkedList.add("Ana");
    namesLinkedList.add("Juliet");
    namesLinkedList.add("Sam");
    System.out.println(namesLinkedList.get(2));
    namesLinkedList.add(1, "Jerry");

    ArrayList<String> namesArrayList = new ArrayList<>();
    namesArrayList.add("John");
    namesArrayList.add("Ana");
    namesArrayList.add("Juliet");
    namesArrayList.add("Sam");
    System.out.println(namesArrayList.get(2));
    namesArrayList.add(1, "Jerry");

  }

}
