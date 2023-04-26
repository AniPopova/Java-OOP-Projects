package exercisesOOP.iterators;

import java.util.Map;

public class IntelyIterator {

  public static void main(String[] args) {

    Map<String, String> map = createMap();

    System.out.println("Method 1 - Classic Iterator");
//    Iterator<Entry<String, String>> iteratorClassic = map.entrySet().iterator();
//    while (iteratorClassic.hasNext()) {
//      Entry<String, String> entry = iteratorClassic.next();
//      System.out.println(entry.getKey() + " - " + entry.getValue());
//    }

//    System.out.println("Method 2 - for each method");
//    for (Map.Entry<String, String> entry : map.entrySet()) {
//      System.out.println(entry.getKey() + " - " + entry.getValue());
//    }

//    System.out.println("Method 3 - Java 8 for each method");
//    map.forEach((k,v) -> System.out.println(k + " | " + v));

//    System.out.println("Method 4 - Iterate through keys and values");
//    for (String key : map.keySet()) {
//      System.out.println(key + "Key");
//    }
//    for (String value : map.values()) {
//      System.out.println(value + "Key");
//    }

    System.out.println("Method 5 - Iterate through key and get values");
    for (String key : map.keySet()) {
      System.out.println(key + "|" + map.get(key));
    }

  }

  private static Map<String, String> createMap() {
    return Map.of("Frank", "Developer",
        "Robert", "Senior-Developer",
        "Juliet", "Tester",
        "John", "Boss");
  }
}
