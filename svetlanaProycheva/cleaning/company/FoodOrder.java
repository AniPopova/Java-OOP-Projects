package svetlanaProycheva.cleaning.company;

public class FoodOrder {

  private String foodOrder;

  public FoodOrder(String foodOrder) {
    this.foodOrder = foodOrder;
  }

  public String getFoodOrder() {
    return foodOrder;
  }

  public void setFoodOrder(String foodOrder) {
    this.foodOrder = foodOrder;
  }

  @Override
  public String toString() {
    return "FoodOrder for"+ foodOrder + "\n";
  }
}
