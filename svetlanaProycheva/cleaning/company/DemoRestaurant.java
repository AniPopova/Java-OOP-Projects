package svetlanaProycheva.cleaning.company;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class DemoRestaurant {

  public static void main(String[] args) {

    Stack<String> dirtyDishes = new Stack<>();
    Queue<FoodOrder> ordersOfFood = new ArrayDeque<>();

    Chief chief = new Chief(ordersOfFood);
    DishWasher dishWasher = new DishWasher(dirtyDishes);

  }

}
