package homework3.arithmeticCalculator;

public class Calculator implements AdvancedArithmetic {


  @Override
  public double divisorSum(double myNumber) {

    double sum = 0;

    for (int i = 1; i < myNumber; i++) {
      if (myNumber % i == 0) {
        sum += i;
      }
    }
    return sum;
  }
}
