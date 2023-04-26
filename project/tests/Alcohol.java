package project.tests;

public enum Alcohol
{
  BEER(5);

  int amount;

  Alcohol(int price)
  {
    this.amount = price;
  }

  public void setAmount(int amount)
  {
    this.amount = amount;
  }

  public int getAmount()
  {
    return amount;
  }
}
