package exercisesOOP.vectors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

  public static void main(String[] args) {
    /*Векторите имплементират динамичен масив, подобен на ArrayList,
     *но Vectors са синхронизирани - много хора могат да работят с един вектор едновременно и той се синхронизира!
     *Vector is Class that  implements  List interface, extends AbstractList!!!!- взима техните методи и функционалност
     *Vector v = new Vector(); - създава вектор с начален капацитет от 10 елемента с празен конструкто
     *Vector v = new Vector(int size); - можем в началото да кажем размера
     *Vector v = new Vector(int size, int increase); -можем да кажем началния размер и с колко ще се увеличава
     *Vector v = new Vector(Collection c); - взима стойности от попълнена колекция
     * */
    Vector v = new Vector(); //- декларираме празен вектор, и можем да подадем променливи от различен тип
    v.add("Java"); // string value
    v.add(1); // integer values

    Iterator i = v.iterator();
    while (i.hasNext()) {
      System.out.println("Element: " + i.next());
    }
    System.out.println();

    Vector<Integer> a = new Vector<>(2); // тук сме казали, че ще му подаваме само обекти от тип Integer с капацитет 2
    a.add(1); // integer values - 1 елемент
    a.add(2); // integer values - 2ри елемнт и вектора е запълнен
    a.add(2); // но можем да му подаваме още стойности, вектора променя размера си автоматично
    a.add(2);

    Iterator<Integer> i1 = a.iterator();
    while (i1.hasNext()) {
      System.out.println(i1.next() + " ");
    }
    System.out.println();

    Vector<Integer> b = new Vector<>(2, 5); // тук сме казали, с капацитет 2, който ще се увеличава с 5
    b.add(1);
    b.add(2);
    b.add(3);
    b.add(1);

    Iterator<Integer> i2 = b.iterator();
    while (i2.hasNext()) {
      System.out.println(i2.next() + " ");
    }
    System.out.println();
    Collection<String> collection = new ArrayList<>();
    collection.add("Allison");
    collection.add("Katya");
    collection.add("Svetlana");
    collection.add("Yoana");

    Vector<String> vector = new Vector<>(collection);
    Iterator i3 = vector.iterator();
    while (i3.hasNext()) {
      System.out.println("The name is " + i3.next());
    }
  }

}
