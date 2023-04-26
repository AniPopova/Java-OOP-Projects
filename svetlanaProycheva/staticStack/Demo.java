package svetlanaProycheva.staticStack;

public class Demo {

  public static void main(String[] args) {
    StaticStack staticStack=new StaticStack();
    int[]numbers=new int[]{};
    staticStack.setStackNumbers(numbers);
    staticStack.setSize(5);

    staticStack.push(1);
    //staticStack.pop();

    staticStack.push(2);
  //  staticStack.pop();
    staticStack.push(3);
 //   staticStack.pop();
    staticStack.push(4);
  //  staticStack.pop();
    staticStack.push(5);
//    staticStack.pop();
    staticStack.push(1);
  //  staticStack.pop();



    System.out.println(staticStack.peek());

    System.out.println(staticStack.toString());
    System.out.println(staticStack.empty());

  }

}
