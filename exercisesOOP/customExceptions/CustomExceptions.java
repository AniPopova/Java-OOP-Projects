package exercisesOOP.customExceptions;

public class CustomExceptions {

  public static void main(String[] args)  {
    validateAge(3);
  }

  private static void validateAge(int age) {
    if (age > 0) {
      throw new AgeLessThanZeroException(); //if we want to throw it here, must add it to the method signature

    }
  }
}
