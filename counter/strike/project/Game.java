////separate method for terrorist/CT kills
package counter.strike.project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Weapon> weapons = new ArrayList<>(10);
    //price, dmg, name
    Weapon knife = new Weapon(0, 5, "Tactical Knife");

    weapons.add(new Weapon(2400, 30, "Ak-47"));
    weapons.add(new Weapon(2200, 27, "M16"));
    weapons.add(new Weapon(600, 18, "Desert Eagle"));
    weapons.add(new Weapon(750, 20, "M4A4"));
    weapons.add(new Weapon(2600, 40, "AWP"));
    weapons.add(new Weapon(2100, 24, "SCAR20"));
    weapons.add(new Weapon(880, 16, "P90"));
    weapons.add(new Weapon(400, 32, "Grenade"));
    weapons.add(new Weapon(1800, 19, "USP"));

    List<Vest> vests = new ArrayList<>();
    vests.add(new Vest("Vest 1", 150, 20));
    vests.add(new Vest("Vest 2", 160, 30));
    vests.add(new Vest("Vest 3", 170, 40));
    vests.add(new Vest("Vest 4", 180, 50));
    vests.add(new Vest("Vest 5", 200, 70));

    History teams = new History();
    Random random = new Random();
    List<Player> terrorists = new ArrayList<>();
    List<Player> counterTerrorists = new ArrayList<>();
    int teamSize = generateNumberOfPlayers(5, 10);
    int startingMoney = generateNumberOfPlayers(1000, 2000);
    Weapon randomElement = weapons.get(random.nextInt(weapons.size()));
    for (int i = 0; i < teamSize * 2; i++) {
      Player player = new Player();
      if (i % 2 == 0) {
        player.setRole(Role.TERRORIST);
        player.setCash(startingMoney);
        player.setHp(100);
        terrorists.add(player);

      } else {
        player.setRole(Role.COUNTER_TERRORIS);
        player.setCash(startingMoney);
        player.setHp(100);
        counterTerrorists.add(player);
      }
    }
    teams.setTerrorist(terrorists);
    teams.setCounterTerrorist(counterTerrorists);

    setWeapon(weapons, knife, random, terrorists, startingMoney, randomElement);
    setWeapon(weapons, knife, random, counterTerrorists, startingMoney, randomElement);
    setVest(vests, random, terrorists);
    setVest(vests, random, counterTerrorists);
    //System.out.println(terrorists);
    int ctIndex = random.nextInt(teamSize);
    int tIndex = random.nextInt(teamSize);
    int isAllTDead = 0;
    int isAllCTDead = 0;
    int firstStrike = random.nextInt(1);
    for (int i = 1; i < 5; i++) {
      System.out.println(" CT size: "+counterTerrorists.size());
      System.out.println(" TT size: "+terrorists.size());
//      if (firstStrike % 2 == 0) { //else
      System.out.println("Round " + i);
      while (isAllCTDead < counterTerrorists.size() && isAllTDead < terrorists.size()) {

        if (counterTerrorists.get(ctIndex).isDead()) {
          System.out.println("CT: I am dead");
          tIndex = random.nextInt(terrorists.size());
          isAllCTDead += 1;
          if (isAllCTDead == counterTerrorists.size()) {
            break;
          }
        }
        ctShoot(random, terrorists, counterTerrorists, ctIndex, tIndex);
        if (terrorists.get(tIndex).isDead()) {
          System.out.println("TT: I am dead");
          tIndex = random.nextInt(counterTerrorists.size());
          isAllTDead += 1;
          if (isAllTDead == terrorists.size()) {
            break;
          }
        }
        tShoot(random, counterTerrorists, terrorists, ctIndex, tIndex);
      }
      System.out.println("Dead ct: "+isAllCTDead);
      System.out.println("Dead tt: "+isAllTDead);
      if (isAllCTDead == counterTerrorists.size()) {
        System.out.println("T win");
      } else if (isAllTDead == terrorists.size()) {
        System.out.println("CT win");
      }
      isAllCTDead = 0;
      isAllTDead = 0;
    }
    System.out.println(counterTerrorists);
    System.out.println(terrorists);
    System.out.println(teams);

  }


  private static void tShoot(Random random, List<Player> terrorists,
      List<Player> counterTerrorists, int ctIndex, int tIndex) {
    if (counterTerrorists.get(ctIndex).getVest() == null) {
      //check if terrorist has a vest
      counterTerrorists.get(ctIndex).setHp(
          counterTerrorists.get(ctIndex).getHp()
              - terrorists.get(tIndex)
              .getWeapon()
              .getDmg());
      //terrorist hp - weapon dmg
    } else {

      counterTerrorists.get(ctIndex).getVest().setDefense(
          counterTerrorists.get(ctIndex).getVest().getDefense()
              - terrorists.get(tIndex)
              .getWeapon().getDmg());
      //vest defense - weapon dmg
      if (counterTerrorists.get(ctIndex).getVest().getDefense()
          <= 0) {
        counterTerrorists.get(ctIndex).setHp(
            counterTerrorists.get(ctIndex).getHp() - Math.abs(
                terrorists.get(tIndex).getWeapon()
                    .getDmg()));
        //if defense is <= 0 -> hp - weapon dmg
      }
      if (counterTerrorists.get(ctIndex).getHp() <= 0) {
        counterTerrorists.get(ctIndex).setDead(true);
        counterTerrorists.get(ctIndex).setHp(0) ;
        terrorists.get(tIndex)
            .setNumberOfKills(terrorists.get(tIndex).getNumberOfKills()+1);
        //if hp <= 0, isDead -> true
        counterTerrorists.get(ctIndex).setNumberOfDeaths(counterTerrorists.get(tIndex).getNumberOfDeaths()+1);
        int sumForKill = random.nextInt(500 - 300) + 300;
        //get money for kill
        counterTerrorists.get(tIndex)
            .setCash(
                terrorists.get(tIndex).getCash()
                    + sumForKill);
      }
    }
  }

  private static void ctShoot(Random random, List<Player> terrorists,
      List<Player> counterTerrorists, int ctIndex, int tIndex) {
    if (terrorists.get(tIndex).getVest() == null) {
      terrorists.get(tIndex).setHp(
          terrorists.get(tIndex).getHp()
              - counterTerrorists.get(ctIndex)
              .getWeapon()
              .getDmg(Role.COUNTER_TERRORIS.getBONUS_DMG()));
    } else {

      terrorists.get(tIndex).getVest().setDefense(
          terrorists.get(tIndex).getVest().getDefense()
              - counterTerrorists.get(ctIndex)
              .getWeapon().getDmg(Role.COUNTER_TERRORIS.getBONUS_DMG()));
      if (terrorists.get(tIndex).getVest().getDefense()
          <= 0) {
        terrorists.get(tIndex).setHp(
            terrorists.get(tIndex).getHp() - Math.abs(
                counterTerrorists.get(ctIndex).getWeapon()
                    .getDmg(Role.COUNTER_TERRORIS.getBONUS_DMG())));
        terrorists.get(tIndex).getVest().setDefense(0);
      }
      if (terrorists.get(tIndex).getHp() <= 0) {
        terrorists.get(tIndex).setDead(true);
        terrorists.get(tIndex).setHp(0) ;
        counterTerrorists.get(ctIndex)
            .setNumberOfKills(counterTerrorists.get(ctIndex).getNumberOfKills()+1);
        terrorists.get(tIndex).setNumberOfDeaths(terrorists.get(tIndex).getNumberOfDeaths()+1);
        int sumForKill = random.nextInt(500 - 300) + 300;
        counterTerrorists.get(ctIndex)
            .setCash(
                counterTerrorists.get(ctIndex).getCash()
                    + sumForKill);
      }
    }
  }

  private static void setVest(List<Vest> vests, Random random, List<Player> players) {
    Vest randomVest;
    for (Player player : players) {
      if (player.getWeapon().getName().equals("Tactical Knife")) {
        continue;
      }
      randomVest = vests.get(random.nextInt(vests.size()));
      for (int i = 0; i < 3; i++) {
        if (randomVest.getPrice() < player.getCash()) {

          player.setVest(randomVest);
          player.setCash(player.getCash() - randomVest.getPrice());
        } else {
          randomVest = vests.get(random.nextInt(vests.size()));
        }
      }
    }
  }

  private static void setWeapon(List<Weapon> weapons, Weapon knife, Random random,
      Collection<Player> players, int startingMoney, Weapon randomElement) {
    for (Player player : players) {
      randomElement = weapons.get(random.nextInt(weapons.size()));
      boolean hasWeapon = false;
      for (int i = 0; i < 5; i++) {

        if (randomElement.getPrice() < player.getCash()) {
          hasWeapon = true;
          player.setWeapon(randomElement);
          player.setCash(startingMoney - player.getWeapon().getPrice());
          break;
        } else {
          randomElement = weapons.get(random.nextInt(weapons.size()));
        }
      }
      if (!hasWeapon) {
        player.setWeapon(knife);
      }

    }

  }

  public static int generateNumberOfPlayers(int min, int max) {
    Random random = new Random();
    return random.nextInt(max - min) + min;
  }
}

