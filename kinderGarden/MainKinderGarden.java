package kinderGarden;

import java.util.ArrayList;
import java.util.List;

public class MainKinderGarden {

  public static void main(String[] args) {

    Group kinderGroup1 = new Group();
    kinderGroup1.setTeacherName("Hristo Botev");
    kinderGroup1.setGroupType("NURSERY");
    Group kinderGroup2 = new Group();
    kinderGroup2.setTeacherName("Ivan Vazov");
    kinderGroup2.setGroupType("BIG CHILDREN");

    List<Group> groups = new ArrayList<>();
    groups.add(kinderGroup1);
    groups.add(kinderGroup2);

    KinderGarden garden = new KinderGarden();
    garden.setKinderGardenName("Ladybird");
    garden.setGroups(groups);


    Child child1 = new Child("Georgi", "Georgiev", 2);
    Parent parent1 = new Parent("Mariya", "Georgieva");
    Parent parent2 = new Parent("Miroslav", "Georgiev");
    child1.setGroupType();

    List<Parent> parents1 = new ArrayList<>();
    parents1.add(0, parent1);
    parents1.add(1, parent2);

    child1.setParents(parents1);

    Child child2 = new Child("Kalina", "Boncheva", 5);
    Parent parent3 = new Parent("Ivelina", "Boncheva");
    Parent parent4 = new Parent("Dobromir", "Bonchev");

    List<Parent> parents2 = new ArrayList<>();
    parents2.add(0, parent3);
    parents2.add(1, parent4);

    child2.setParents(parents2);
    child2.setGroupType();

    Child child3 = new Child("Nikolay", "Baltov", 4);
    Parent parent5 = new Parent("Darina", "Baltova");
    Parent parent6 = new Parent("Ivan", "Baltov");

    List<Parent> parents3 = new ArrayList<>();
    parents3.add(0, parent5);
    parents3.add(1, parent6);

    child3.setParents(parents3);
    child3.setGroupType();

    List<Child> children = new ArrayList<>();
    children.add(child1);
    children.add(child2);
    children.add(child3);

    kinderGroup2.setChildren(children);
    kinderGroup1.setChildren(children);

    System.out.println(garden);

  }
}
