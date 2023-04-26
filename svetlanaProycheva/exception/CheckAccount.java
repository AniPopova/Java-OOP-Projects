package svetlanaProycheva.exception;

public class CheckAccount {

  private double balance;
  private int number;

  public CheckAccount(double balance, int number) {
    this.balance = balance;
    this.number = number;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public void deposit(double amount) {
    this.balance += amount;
  }

  public void withdraw(double amount) {
    try {
      if (this.balance <= 0) {
        throw new AniException();
      } else if (this.balance < amount) {
        throw new AniException();
      } else {
        this.balance -= amount;
      }
    } catch (AniException ise) {
      System.err.println(ise.getMessage());
    }
  }
  @Override
  public String toString() {
    return "CheckAccount: " + "\n" +
        "balance: " + balance + "\n" +
        "number: " + number;
  }
}
