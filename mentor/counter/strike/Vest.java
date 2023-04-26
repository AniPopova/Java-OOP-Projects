package mentor.counter.strike;

public class Vest {
  private String name;
  private int price;
  private int defense;

  public Vest() {
  }

  public Vest(String name, int price, int defense) {
    this.name = name;
    this.price = price;
    this.defense = defense;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getDefense() {
    return defense;
  }

  public void setDefense(int defense) {
    this.defense = defense;
  }

  @Override
  public String toString() {
    return "Vest " + name + "\n" +
        "price: " + price +"\n"+
        "defense: " + defense +"\n";
  }
}
