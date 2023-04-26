package exercisesOOP.filter;

import java.io.IOException;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

  public static void main(String[] args) throws IOException {

    // 1. Integer stream (using the IntStream class) that gives range from 1 to 9, since 10 is not included
    IntStream
        .range(1, 10)
        .forEach(System.out::println);
    System.out.println();

    // 2. Integer stream with skip
    IntStream
        .range(1, 10)
        .skip(6) // skips the first 6 elements in the stream
        .forEach(x -> System.out.println(" " + x)); // simple lambda expression
    System.out.println();

    // 3. Integer stream with sum
    System.out.println(
        IntStream
            .range(1, 5) //sum from 1 to 5
            .sum());
    System.out.println();

    // 4. Stream.of, sorted and findFirst - suitable for objects
    Stream.of("Nikola", "Vasil", "Boryana")
        .sorted() //alphabetically sorted
        .findFirst() //find first object
        .ifPresent(System.out::println);

    // 5. Stream from array, sort, filter and print the results
    String[] names = {"Simon", "George", "John", "Kramer", "Barbie", "Newman", "Fido", "Sarah",
        "Susan"};
    Arrays.stream(names)
        .filter(x -> x.startsWith("S")) //lambda expression
        .sorted() // .sorted(x -> x.endsWith("a")) - we can add also end statement
        .forEach(System.out::println);

    // 6. Average of squares of an int array
    Arrays.stream(new int[]{2, 4, 6, 8, 10})
        .map(x -> x * x)
        .average() //we take average of all items in the array
        .ifPresent(System.out::println); // gives double as a result

    // 7. Stream from List, filter and print
    List<String> people = Arrays.asList("Karen", "George", "John", "Kramer", "Barbie", "Newman",
        "Fido", "Sarah", "Susan");
    people
        .stream()
        .map(String::toLowerCase) //here we call the class "String" and tell it what to do "toLowerCase"
        .filter(x -> x.startsWith("k")) // make a selection
        .forEach(System.out::println); // gives double as a result

    //8. Reduction - sum
    double total = Stream.of(7.3, 1.5, 4.8)
        .reduce(0.0, (Double a, Double b) -> a + b); // starting point is 0.0
    System.out.println("Total: " + total);

    //9. Reduction - summary statistics - NB! works only with integers
    IntSummaryStatistics summary = IntStream.of(7,2,19,88,73,4,10)
        .summaryStatistics();
    System.out.println(summary);
  }

}
