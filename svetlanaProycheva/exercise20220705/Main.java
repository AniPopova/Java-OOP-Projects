package svetlanaProycheva.exercise20220705;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    List flowers = new ArrayList();
    flowers.add("Rose");
    flowers.add("Jasmine");
    flowers.add("sunflower");
    Iterator flowersIterator = flowers.iterator();
    System.out.println("Contents of ArrayList:");
    while (flowersIterator.hasNext()) {
      System.out.print(flowersIterator.next() + "\n");
    }
  }
}