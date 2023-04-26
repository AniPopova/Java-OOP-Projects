package mentor.guestHouse;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeTest {
  public static void main(String[] args) throws ParseException {
//        Scanner scanner = new Scanner(System.in);
//        String dateFrom = scanner.nextLine();
//        SimpleDateFormat d1 = new SimpleDateFormat("yyyy/MM/dd");
//        Date date = d1.parse(dateFrom);
//        System.out.println(date);

    LocalDate now = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    LocalDate dateTo = LocalDate.from(formatter.parse("28/02/2022"));
    System.out.println(dateTo.format(formatter));

  }
}
