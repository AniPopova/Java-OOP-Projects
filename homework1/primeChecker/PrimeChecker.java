package homework1.primeChecker;

public class PrimeChecker {

  public static boolean checkPrime(int num) {

    boolean isItPrime = false;
    for (int i = 2; i <= num / 2; ++i) {

      if (num % i == 0) {
        isItPrime = true;
        break;
      }
    }
    return !isItPrime;
  }

}
