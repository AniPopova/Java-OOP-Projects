package svetlanaProycheva.cleaning.company;

import java.util.Queue;

public class Chief implements Cookable{

  private Queue<FoodOrder> ordersToCook;


  public Chief(Queue<FoodOrder> ordersToCook) {
    this.ordersToCook = ordersToCook;
  }

  public Queue<FoodOrder> getOrdersToCook() {
    return ordersToCook;
  }

  public void setOrdersToCook(Queue<FoodOrder> ordersToCook) {
    this.ordersToCook = ordersToCook;
  }

  @Override
  public void cook() {
    if (ordersToCook.size() > 0) {
      System.out.println("I am cooking all day long.");
    } else {
      System.out.println("There is nothing to cook.");
    }
  }
}
