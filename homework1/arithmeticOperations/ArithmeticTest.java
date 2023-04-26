package homework1.arithmeticOperations;

import java.util.*;

public class ArithmeticTest {

  public static void main(String[] args) {
    Random rand = new Random();
    Arithmetic arithmetic =  new Adder();
    System.out.println(arithmetic.getClass());
    System.out.println(arithmetic.getClass().getSuperclass().getSuperclass());
    int low = 2;
    int high = 20;
    int N = rand.nextInt(high-low) + low;
    List<Integer> arithmeticList = new ArrayList<>();


    for (int i = 0; i <2000; i++) {
      N = rand.nextInt(high-low) + low;
      //N = 2_000_000_000;
      arithmeticList.add(N);
      System.out.println(N);
    }
    System.out.println(arithmetic.add(arithmeticList));

  }


}
