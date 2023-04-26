package homework1.arithmeticOperations;

import java.util.List;

public class Arithmetic {

 //public int add(int a, int b) {  return a + b; }

  public int add(List<Integer> args) {
    int sum = 0;
    for (int arg : args) {
      sum +=arg;
    }
    return sum;
  }

}
