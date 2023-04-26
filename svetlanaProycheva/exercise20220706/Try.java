package svetlanaProycheva.exercise20220706;

public class Try {

  public static void main(String[] args) {
    Experiment e1 = Experiment.getInstance();
    //Experiment e3 = new Experiment();
    e1.setNum(5);
    System.out.println(e1);
    e1.setNum(7);
    System.out.println(e1);
    Experiment e2 = Experiment.getInstance();
    System.out.println(e2);
    e2.setNum(123);
    System.out.println(e2);
    System.out.println(e1);
    if(e1 == e2){
      System.out.println("The same instance");
    } else{
      System.out.println("Different instance");
    }
    Integer number1 = 5;
    Integer number2 = new Integer(5);
    //System.out.println(number1 == number2);
    Integer number3 = Integer.valueOf(5);
    System.out.println(number1 == number3);
    Integer number4 = Integer.valueOf(5);
    System.out.println(number3 == number4);
    number3 = 6;
    System.out.println(number4);
    System.out.println(number3 == number4);
  }

}
