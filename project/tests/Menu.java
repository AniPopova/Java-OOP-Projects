//package project.tests;
//
//import java.math.BigDecimal;
//import java.util.*;
//
//import static java.math.BigDecimal.valueOf;
//import static java.util.Map.entry;
////import static utilities.ColorUtils.*;
//
//public class Menu
//{
//  static        Scanner                scanner = new Scanner(System.in);
//  public static Map<Drink, BigDecimal> drinks  = new HashMap<>(Map.ofEntries(
//      entry(Drink.MARGARITA, valueOf(30)),
//      entry(Drink.COSMOPOLITAN, valueOf(65)),
//      entry(Drink.MARTINI, valueOf(35)),
//      entry(Drink.MOJITO, valueOf(45)),
//      entry(Drink.WHISKEY_SOUR, valueOf(100)),
//      entry(Drink.OLD_FASHIONED, valueOf(100)),
//      entry(Drink.WHISKEY, valueOf(90)),
//      entry(Drink.VODKA, valueOf(40)),
//      entry(Drink.COINTREAU, valueOf(30)),
//      entry(Drink.RUM, valueOf(50)),
//      entry(Drink.WHITE_RUM, valueOf(30)),
//      entry(Drink.BOURBON, valueOf(40)),
//      entry(Drink.BEER, valueOf(10)),
//      entry(Drink.GINGER_BEER, valueOf(15)),
//      entry(Drink.TEQUILA, valueOf(30)),
//      entry(Drink.VERMOUTH, valueOf(30)),
//      entry(Drink.CAMPARI, valueOf(20)),
//      entry(Drink.GIN, valueOf(50)),
//      entry(Drink.COGNAC, valueOf(40)),
//      entry(Drink.LIQUEUR, valueOf(40)),
//      entry(Drink.CHAMPAGNE, valueOf(60)),
//      entry(Drink.RED_WINE, valueOf(25)),
//      entry(Drink.WHITE_WINE, valueOf(25)))
//  );
//
//  public Map<Drink, BigDecimal> getPrices()
//  {
//    return drinks;
//  }
//
//  public BigDecimal getPrice(Drink drink)
//  {
//    return drinks.get(drink);
//  }
//
//  public static void printMenu2()
//  {
//    System.out.printf("%-14sWelcome to Night Club 007!%s\n", COLOUR_CYAN, COLOUR_RESET);
//    System.out.println(COLOUR_YELLOW + "+" + "-".repeat(40) + "+" + COLOUR_RESET);
//    System.out.println(COLOUR_YELLOW + "||" + COLOUR_RESET + "            Our drinks are:           " + COLOUR_YELLOW + "||" + COLOUR_RESET);
//    System.out.println(COLOUR_YELLOW + "+" + "-".repeat(40) + "+" + COLOUR_RESET);
//    int index = 0;
//    for (Map.Entry<Drink, BigDecimal> entry : drinks.entrySet()) {
//      index++;
//      String printName = String.format(COLOUR_BLACK + "%02d" + ". " + entry.getKey().getName() + COLOUR_RESET,index);
//      String printPrice =COLOUR_BLACK + entry.getValue() + " BGN" +COLOUR_RESET+ " / " + entry.getKey().getMilliliters() + " ml";
//      String spaces = " ".repeat(56 - (printName.length()+printPrice.length()));
//      String frame = COLOUR_YELLOW+"||" + COLOUR_RESET;
//      System.out.println(frame+ TEXT_BRIGHT_WHITE+printName+TEXT_BRIGHT_WHITE + spaces + printPrice + frame);
//    }
//    System.out.println(COLOUR_YELLOW + "+" + "-".repeat(40) + "+" + COLOUR_RESET);
//    System.out.println(COLOUR_YELLOW + "||" + COLOUR_RESET + "          Enjoy your drink!!!         " + COLOUR_YELLOW + "||" + COLOUR_RESET);
//    System.out.println(COLOUR_YELLOW + "+" + "-".repeat(40) + "+" + COLOUR_RESET);
//
//  }
//
//}
//
