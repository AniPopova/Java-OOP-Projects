package svetlanaProycheva.invertArray;

import java.util.Stack;

public class Task1 {

  public static void main(String[] args) {

    int[] myArray = {3, 5, 9, 15, 38, 5 , 72, 14};

    Stack<Integer> myStack = new Stack<>();
    for (int i = 0; i < myArray.length; i++){
      myStack.push(myArray[i]);
    }

    myStack
        .stream()
        .sorted()
        .forEach(System.out::println);


    System.out.println(myStack);
  }

}
