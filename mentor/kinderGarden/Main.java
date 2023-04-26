package mentor.kinderGarden;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Child> children = new ArrayList<>();

    List<Parent> parentsChild1 = new ArrayList<>();
    Parent parentChild1 = new Parent("Viktoria", "Mitkova");
    Parent parentChild12 = new Parent("Rosen", "Zapryanov");
    parentsChild1.add(parentChild1);
    parentsChild1.add(parentChild12);

    Child child1 = new Child("Monika", "Zaprqnova", 2, parentsChild1);
    child1.setGroupType();
    children.add(child1);

    List<Parent> parentsChild2 = new ArrayList<>();
    Parent parentChild2 = new Parent("Vanya", "Tsvetkova");
    Parent parentChild22 = new Parent("Yordan", "Tsvetkov");
    parentsChild2.add(parentChild2);
    parentsChild2.add(parentChild22);

    Child child2 = new Child("Dimitar", "Tsvetkov", 4, parentsChild2);
    child2.setGroupType();
    children.add(child2);

    List<Parent> parentsChild3 = new ArrayList<>();
    Parent parentChild3 = new Parent("Lilyana", "Yaneva");
    Parent parentChild33 = new Parent("Petar", "Yanev");
    parentsChild3.add(parentChild3);
    parentsChild3.add(parentChild33);

    Child child3 = new Child("Simona", "Yaneva", 5, parentsChild3);
    child3.setGroupType();
    children.add(child3);

    KinderGarden kinderGarden = new KinderGarden("Lady Bird",children);

    System.out.println(kinderGarden);
  }
}
