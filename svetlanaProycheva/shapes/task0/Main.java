package svetlanaProycheva.shapes.task0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {
    Square square = new Square(3);
    Square square1 = new Square(7);
    Square square2 = new Square(3);
    Square square3 = new Square(11);
    Square square4 = new Square(15);
    Square square5 = new Square(6);
    Square square6 = new Square(12);
    //Rectangle square2 = new Rectangle(5,8);

    TreeSet<Square> treeSet = new TreeSet<>();
    treeSet.add(square);
    treeSet.add(square1);
    treeSet.add(square2);
    treeSet.add(square3);
    treeSet.add(square4);
    treeSet.add(square5);
    treeSet.add(square6);
    System.out.println("Initial treeSet"+treeSet);
    System.out.println("Reversed treeSet"+treeSet.descendingSet());

    List<Square> freeList = new ArrayList<>();
    List<Square> reversedList = new ArrayList<>();
    freeList.add(square);
    freeList.add(square1);
    freeList.add(square2);
    freeList.add(square3);
    freeList.add(square4);
    freeList.add(square5);
    freeList.add(square6);
    System.out.println("Initial list"+freeList);
    freeList.sort(Collections.reverseOrder());
   Collections.sort(freeList, Collections.reverseOrder());
    System.out.println("Reversed treeSet"+freeList);

    System.out.println("0 "+square);
    System.out.println("1 "+square1);
    System.out.println("2 "+square2);
    System.out.println("3 "+square3);
    System.out.println("4 "+square4);
    System.out.println("5 "+square5);
    System.out.println("6 "+square6);


    //System.out.println(square.getArea());


  }

}
