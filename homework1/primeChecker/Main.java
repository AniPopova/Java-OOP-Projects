package homework1.primeChecker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int num = 0;
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < N; i++) {

      num = scanner.nextInt();

      if(PrimeChecker.checkPrime(num)) {
        list.add(num);
      }
    }
    System.out.println(Arrays.toString(list.toArray()).replace("[", "").replace("]", ""));
  }

}
