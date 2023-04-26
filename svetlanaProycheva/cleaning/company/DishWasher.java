package svetlanaProycheva.cleaning.company;

import java.util.Stack;

public class DishWasher implements Washable {

  private Stack<String> orders;

  public DishWasher(Stack<String> orders) {
    this.orders = orders;
  }

  public Stack<String> getOrders() {
    return orders;
  }

  public void setOrders(Stack<String> orders) {
    this.orders = orders;
  }

  @Override
  public void cleanDishes() {
    if (orders.size() > 0) {
      System.out.println("I am cleaning the dishes all day long.");
    } else {
      System.out.println("There is no dishes to wash.");
    }
  }
}
