package danceStudio;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Client client1 = new Client();
    client1.setName("Papa");
    client1.setMiddleName("\b");
    client1.setSurname("Smurf");
    client1.setEmail("sugarDaddy@smurf.com");
    client1.setHasMultiSportCard(true);
    client1.setNumberOfCard();

    Client client2 = new Client();
    client2.setName("Little");
    client2.setMiddleName("\b");
    client2.setSurname("Mermaid");
    client2.setEmail("ariel69@seaside.com");
    client2.setHasMultiSportCard(false);

    Client client3 = new Client();
    client3.setName("Mighty");
    client3.setMiddleName("\b");
    client3.setSurname("Hercules");
    client3.setEmail("badAss@zeus.com");
    client3.setHasMultiSportCard(true);
    client3.setNumberOfCard();

    Client client4 = new Client();
    client4.setName("Little");
    client4.setMiddleName("Red");
    client4.setSurname("RiddingHood");
    client4.setEmail("redish@blackForest.com");
    client4.setHasMultiSportCard(false);

    Client client5 = new Client();
    client5.setName("Sleeping");
    client5.setMiddleName("Beauty");
    client5.setSurname("Aurora");
    client5.setEmail("sleepingBeauty@sunrise.com");
    client5.setHasMultiSportCard(true);
    client5.setNumberOfCard();

    Client client6 = new Client();
    client6.setName("Snow");
    client6.setMiddleName("\b");
    client6.setSurname("White");
    client6.setEmail("puppetMaster@dwarf.com");
    client6.setHasMultiSportCard(true);
    client6.setNumberOfCard();

    Client client7 = new Client();
    client7.setName("Belle");
    client7.setMiddleName("\b");
    client7.setSurname("Beast");
    client7.setEmail("beautyBeast@crimsonPeak.com");
    client7.setHasMultiSportCard(false);

    Client client8 = new Client();
    client8.setName("Hans");
    client8.setMiddleName("Christian");
    client8.setSurname("Andersen");
    client8.setEmail("storyteller@wonderland.com");
    client8.setHasMultiSportCard(true);
    client8.setNumberOfCard();

    Client client9 = new Client();
    client9.setName("Aladdin");
    client9.setMiddleName("The");
    client9.setSurname("Arabian");
    client9.setEmail("jinnie@ofthelamp.com");
    client9.setHasMultiSportCard(true);
    client9.setNumberOfCard();

    Client client10 = new Client();
    client10.setName("Jasmine");
    client10.setMiddleName("Arabian");
    client10.setSurname("Princess");
    client10.setEmail("oasis@inthedesert.com");
    client10.setHasMultiSportCard(false);

    DanceClass newAgeFolkDance = new DanceClass();
    newAgeFolkDance.setDanceClassName("Fellinis' eight");
    newAgeFolkDance.setTax(10);
    DanceTeacher teacher1 = new DanceTeacher("Gargamel");
    teacher1.setNickName("Cinderella");

    DanceClass witchDance = new DanceClass();
    witchDance.setDanceClassName("Wicked dance");
    witchDance.setTax(10);
    DanceTeacher teacher2 = new DanceTeacher("Lilith");
    teacher2.setNickName("Eve");

    List<Client> clientsOfGargamel = new ArrayList<>(7);
    clientsOfGargamel.add(client1);
    clientsOfGargamel.add(client2);
    clientsOfGargamel.add(client3);
    clientsOfGargamel.add(client4);
    clientsOfGargamel.add(client5);
    clientsOfGargamel.add(client6);
    clientsOfGargamel.add(client7);

    List<Client> clientsOfLilith = new ArrayList<>(3);
    clientsOfLilith.add(client8);
    clientsOfLilith.add(client9);
    clientsOfLilith.add(client10);

    newAgeFolkDance.setClients(clientsOfGargamel);
    witchDance.setClients(clientsOfLilith);
    newAgeFolkDance.setTeacher(teacher1);
    witchDance.setTeacher(teacher2);

    List<DanceClass> danceClasses = new ArrayList<>();
    danceClasses.add(newAgeFolkDance);
    danceClasses.add(witchDance);

    DanceAcademy danceAcademy = new DanceAcademy();
    danceAcademy.setNameOfAcademy("Fairy tales");
    danceAcademy.setDanceClasses(danceClasses);

    System.out.println(danceAcademy);
    System.out.println();

    newAgeFolkDance.calcDailyTurnover();
    System.out.println();
    witchDance.calcDailyTurnover();

  }


}
