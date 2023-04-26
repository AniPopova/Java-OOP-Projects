package counter.strike.project;

public class Weapon {
  private int price;
  private int dmg;
  private String name;

  public Weapon(int price, int dmg, String name) {
    this.price = price;
    this.dmg = dmg;
    this.name = name;
  }

  public Weapon() {
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getDmg() {
    return dmg;
  }
  public int getDmg(int bonus){
    return dmg + bonus;
  }


  public void setDmg(int dmg) {
    this.dmg = dmg;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Weapon{" +
        "price=" + price +
        ", dmg=" + dmg +
        ", name='" + name + '\'' +
        '}';
  }
}
