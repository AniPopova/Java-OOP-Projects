package svetlanaProycheva.stack;

public class nestedStack {
  private element head;

  private  class element {

    private int value;
    private element next;

    private element(int v, element n) {
      value = v;
      next = n;
    }
  }


  public void  push(int v) {
    head = new element(v, head);
  }

  public int pop() {
    int x = head.value;
    head = head.next;
    return x;
  }
  public int peek(){
    return head.value;
  }

}
