package svetlanaProycheva.stack;

public class StaticStack {

  private Integer[] arr;
  private int top;
  private int capacity = 2;


  @Override
  public String toString() {
    String elements = "";
    for (int i = 0; i <= top; i++) {
      elements += arr[i] + " ";
    }
    return elements;
  }

  StaticStack() {
    arr = new Integer[capacity];

    top = -1;
  }


  public void push(int x) {

    if (isFull()) {
      capacity *= 2;
      Integer[] arr2 = new Integer[capacity];

      for (int i = 0; i < arr.length; i++) {
        arr2[i] = arr[i];
      }
      arr = arr2;
    }

    arr[++top] = x;

  }


  public Integer pop() {
    Integer element = null;

    if (!isEmpty()) {
      element = peek();
      top--;
    }

    return element;
  }


  public Integer peek() {
    if (!isEmpty()) {
      return arr[top];
    }

    return null;
  }


  public int size() {
    return top + 1;
  }


  public boolean isEmpty() {
    return top == -1;
  }


  public boolean isFull() {
    return top == capacity - 1;
  }

}


