package svetlanaProycheva.exception;

import java.util.Scanner;

public class AccountDemo {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    CheckAccount myAccount = new CheckAccount(101, 123);
    myAccount.deposit(500);
    System.out.println(myAccount);

    System.out.println("Моля въведете сумата, която желаете да изтеглите: ");
    double sumToWithdraw = scanner.nextDouble();
    myAccount.withdraw(sumToWithdraw);
  }
}
