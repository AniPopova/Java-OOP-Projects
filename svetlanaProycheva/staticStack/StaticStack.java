package svetlanaProycheva.staticStack;

public class StaticStack {

  private int[] stackNumbers;
  private int size;
  private int position = -1;

  public int getSize() {
    return size;
  }

  public int[] getStackNumbers() {
    return stackNumbers;
  }

  public void setStackNumbers(int[] stackNumbers) {
    this.stackNumbers = stackNumbers;
  }

  public void setSize(int size) {
    this.size = size;
    this.stackNumbers = new int[size];
  }

  public void push(int number) {
    if (position + 1 == size) {
      System.out.println("The array is full");
    } else {
      position = position + 1;
      stackNumbers[position] = number;
    }
  }

  public void pop() {
    if (position == -1) {

      System.out.println("The array is empty");
    } else {
      position--;
    }

  }

  public Integer peek() {
    if (position == -1) {

      System.out.println("The array is empty");
      return null;
    } else {
      return stackNumbers[position];
    }
  }

  public boolean empty() {
    if (position == -1) {
      return true;
    } else {
      return false;
    }
  }

  public String toString() {
    String test = "";
    for (int i = 0; i <= position; i++) {
      test += stackNumbers[i] + " ";
    }
    return test;
  }
}
