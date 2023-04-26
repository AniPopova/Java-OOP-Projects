//package mentor.counterStrike;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//import java.util.Random;
//import java.util.Scanner;
//
//public class Game {
//
//  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    List<Weapon> weapons = new ArrayList<>(10);
//    //price, dmg, name
//    Weapon ak47 = new Weapon(2400, 30, "Ak-47");
//    Weapon m16 = new Weapon(2200, 27, "M16");
//    Weapon desertEagle = new Weapon(600, 18, "Desert Eagle");
//    Weapon m4a4 = new Weapon(750, 20, "M4A4");
//    Weapon awp = new Weapon(2600, 40, "AWP");
//    Weapon scar20 = new Weapon(2100, 24, "SCAR20");
//    Weapon p90 = new Weapon(880, 16, "P90");
//    Weapon grenade = new Weapon(400, 32, "Grenade");
//    Weapon usp = new Weapon(1800, 19, "USP");
//    Weapon knife = new Weapon(0, 5, "Tactical Knife");
//    weapons.add(ak47);
//    weapons.add(m16);
//    weapons.add(desertEagle);
//    weapons.add(m4a4);
//    weapons.add(awp);
//    weapons.add(scar20);
//    weapons.add(p90);
//    weapons.add(grenade);
//    weapons.add(usp);
//    Vest vest1 = new Vest("Vest 1", 150, 20);
//    Vest vest2 = new Vest("Vest 2", 160, 30);
//    Vest vest3 = new Vest("Vest 3", 170, 40);
//    Vest vest4 = new Vest("Vest 4", 180, 50);
//    Vest vest5 = new Vest("Vest 5", 200, 70);
//    List<Vest> vests = new ArrayList<>();
//    vests.add(vest1);
//    vests.add(vest2);
//    vests.add(vest3);
//    vests.add(vest4);
//    vests.add(vest5);
//    History teams = new History();
//    Random random = new Random();
//    Collection<Player> terrorists = new ArrayList<>();
//    Collection<Player> counterTerrorists = new ArrayList<>();
//    int teamSize = generateNumberOfPlayers(5, 10);
//    int startingMoney = generateNumberOfPlayers(1000, 2000);
//    Weapon randomElement = weapons.get(random.nextInt(weapons.size()));
//    for (int i = 0; i < teamSize * 2; i++) {
//      Player player = new Player();
//      if (i % 2 == 0) {
//        player.setRole(Role.TERRORIST);
//        player.setCash(startingMoney);
//        player.setHp(100);
////        System.out.println("Dear terrorist, please enter your nickname: ");
//        //player.setUsername(scanner.nextLine());
//        terrorists.add(player);
//      }
//      else{
//        player.setRole(Role.COUNTER_TERRORIST);
//        player.setCash(startingMoney);
//        player.setHp(100);
//        //System.out.println("Dear counter-terrorist, please enter your nickname: ");
//        //player.setUsername(scanner.nextLine());
//        counterTerrorists.add(player);
//      }
//    }
//    teams.setTerrorist(terrorists);
//    teams.setCounterTerrorist(counterTerrorists);
//    //System.out.println("How many rounds?"); + scanner
//    //Starting round
//
//    SetWeapon(weapons, knife, random, terrorists, startingMoney, randomElement);
//    SetWeapon(weapons, knife, random, counterTerrorists, startingMoney, randomElement);
//    SetVest(vests, random, terrorists);
//    SetVest(vests, random, counterTerrorists);
//    //System.out.println(terrorists);
//    int ctIndex = random.nextInt(10);
//    int tIndex = random.nextInt(10);
//    for (int i = 0; i < 3; i++) {
//      int firstStrike = random.nextInt(1);
//      while (terrorists.size() > 0 ||  counterTerrorists.size() > 0) {
//        if (firstStrike == 0) {
//            if (terrorists.stream().toList().get(tIndex).getVest() == null) {
//              terrorists.stream().toList().get(tIndex).setHp(
//                  terrorists.stream().toList().get(tIndex).getHp()
//                      - counterTerrorists.stream().toList().get(ctIndex)
//                      .getWeapon()
//                      .getDmg());
//            } else {
//              terrorists.stream().toList().stream().toList().get(tIndex).getVest().setDefense(
//                  terrorists.stream().toList().stream().toList().get(tIndex).getVest().getDefense()
//                      - counterTerrorists.stream().toList().stream().toList().get(ctIndex)
//                      .getWeapon().getDmg());
//              if (terrorists.stream().toList().stream().toList().get(tIndex).getVest().getDefense()
//                  < 0) {
//                terrorists.stream().toList().stream().toList().get(tIndex).setHp(
//                    terrorists.stream().toList().stream().toList().get(tIndex).getHp() - Math.abs(
//                        terrorists.stream().toList().stream().toList().get(tIndex).getVest()
//                            .getDefense()));
//                terrorists.stream().toList().stream().toList().get(tIndex).getVest().setDefense(0);
//              }
//              if (terrorists.stream().toList().stream().toList().get(tIndex).getHp() <= 0) {
//                terrorists.stream().toList().stream().toList().get(tIndex).setDead(true);
//                terrorists.stream().toList().remove(tIndex);
//                counterTerrorists.stream().toList().stream().toList().get(ctIndex)
//                    .setNumberOfKills(+1);
//                terrorists.stream().toList().stream().toList().get(tIndex).setNumberOfDeaths(+1);
//                int sumForKill = random.nextInt(500 - 300) + 300;
//                counterTerrorists.stream().toList().get(ctIndex)
//                    .setCash(
//                        counterTerrorists.stream().toList().get(ctIndex).getCash()
//                            + sumForKill);
//              }
//            }
//            if (counterTerrorists.stream().toList().stream().toList().get(ctIndex).getVest()
//                == null) {
//              counterTerrorists.stream().toList().stream().toList().get(ctIndex).setHp(
//                  counterTerrorists.stream().toList().stream().toList().get(ctIndex).getHp()
//                      - terrorists.stream().toList().stream().toList().get(tIndex).getWeapon()
//                      .getDmg());
//            } else {
//              counterTerrorists.stream().toList().stream().toList().get(ctIndex).getVest()
//                  .setDefense(
//                      counterTerrorists.stream().toList().stream().toList().get(ctIndex).getVest()
//                          .getDefense() - terrorists.stream().toList().stream().toList().get(tIndex)
//                          .getWeapon().getDmg());
//              if (counterTerrorists.stream().toList().stream().toList().get(ctIndex).getVest()
//                  .getDefense() < 0) {
//                counterTerrorists.stream().toList().stream().toList().get(ctIndex)
//                    .setHp(
//                        (counterTerrorists.stream().toList().stream().toList().get(tIndex).getHp()
//                            - Math.abs(
//                            terrorists.stream().toList().stream().toList().get(tIndex).getVest()
//                                .getDefense())));
//                counterTerrorists.stream().toList().stream().toList().get(ctIndex).getVest()
//                    .setDefense(0);
//              }
//              if (counterTerrorists.stream().toList().stream().toList().get(ctIndex).getHp() < 0) {
//                counterTerrorists.stream().toList().stream().toList().get(ctIndex).setDead(true);
//                counterTerrorists.stream().toList().remove(ctIndex);
//                terrorists.stream().toList().stream().toList().get(tIndex).setNumberOfKills(+1);
//                counterTerrorists.stream().toList().stream().toList().get(ctIndex)
//                    .setNumberOfDeaths(+1);
//                int sumForKill = random.nextInt(500 - 300) + 300;
//                terrorists.stream().toList().stream().toList().get(tIndex).setCash(
//                    terrorists.stream().toList().stream().toList().get(tIndex).getCash()
//                        + sumForKill);
//              }
//            }
//
//           if  (counterTerrorists.stream().toList().stream().toList().get(ctIndex).getVest()
//                  == null) {
//                counterTerrorists.stream().toList().stream().toList().get(ctIndex).setHp(
//                    counterTerrorists.stream().toList().stream().toList().get(ctIndex).getHp()
//                        - terrorists.stream().toList().stream().toList().get(tIndex).getWeapon()
//                        .getDmg());
//              } else {
//                counterTerrorists.stream().toList().stream().toList().get(ctIndex).getVest()
//                    .setDefense(
//                        counterTerrorists.stream().toList().get(ctIndex).getVest().getDefense()
//                            - terrorists.stream().toList().get(tIndex)
//                            .getWeapon().getDmg());
//                if (counterTerrorists.stream().toList().get(ctIndex).getVest().getDefense() < 0) {
//                  counterTerrorists.stream().toList().get(ctIndex)
//                      .setHp((counterTerrorists.stream().toList().get(tIndex).getHp() - Math.abs(
//                          terrorists.stream().toList().get(tIndex).getVest().getDefense())));
//                  counterTerrorists.stream().toList().get(ctIndex).getVest().setDefense(0);
//                }
//                if (counterTerrorists.stream().toList().get(ctIndex).getHp() < 0) {
//                  counterTerrorists.stream().toList().get(ctIndex).setDead(true);
//                  counterTerrorists.stream().toList().remove(ctIndex);
//                  terrorists.stream().toList().get(tIndex).setNumberOfKills(+1);
//                  counterTerrorists.stream().toList().get(ctIndex).setNumberOfDeaths(+1);
//                  int sumForKill = random.nextInt(500 - 300) + 300;
//                  terrorists.stream().toList().get(tIndex)
//                      .setCash(terrorists.stream().toList().get(tIndex).getCash() + sumForKill);
//                }
//                if (terrorists.stream().toList().get(tIndex).getVest() == null) {
//                  terrorists.stream().toList().get(tIndex).setHp(
//                      terrorists.stream().toList().get(tIndex).getHp() - counterTerrorists.stream()
//                          .toList().get(ctIndex).getWeapon()
//                          .getDmg());
//                } else {
//                  terrorists.stream().toList().get(tIndex).getVest().setDefense(
//                      terrorists.stream().toList().get(tIndex).getVest().getDefense()
//                          - counterTerrorists.stream().toList().get(ctIndex)
//                          .getWeapon().getDmg());
//                  if (terrorists.stream().toList().get(tIndex).getVest().getDefense() < 0) {
//                    terrorists.stream().toList().get(tIndex)
//                        .setHp(terrorists.stream().toList().get(tIndex).getHp() - Math.abs(
//                            terrorists.stream().toList().get(tIndex).getVest().getDefense()));
//                    terrorists.stream().toList().get(tIndex).getVest().setDefense(0);
//                  }
//                  if (terrorists.stream().toList().get(tIndex).getHp() <= 0) {
//                    terrorists.stream().toList().get(tIndex).setDead(true);
//                    terrorists.stream().toList().remove(tIndex);
//                    counterTerrorists.stream().toList().get(ctIndex).setNumberOfKills(+1);
//                    terrorists.stream().toList().get(tIndex).setNumberOfDeaths(+1);
//                    int sumForKill = random.nextInt(500 - 300) + 300;
//                    counterTerrorists.stream().toList().get(ctIndex)
//                        .setCash(
//                            counterTerrorists.stream().toList().get(ctIndex).getCash()
//                                + sumForKill);
//                  }
//                }
//              }
//            }
//            if (counterTerrorists.size() == 0) {
//              teams.setTerroristNumberOfRoundsWin(+1);
//              for (Player terrorist : terrorists
//              ) {
//                terrorist.setCash(terrorist.getCash() + 1000);
//              }
//            } else {
//              for (Player counterTerrorist : counterTerrorists
//              ) {
//                counterTerrorist.setCash(counterTerrorist.getCash() + 500);
//              }
//            }
//            if (terrorists.size() == 0) {
//              teams.setCounterTerroristNumberOfRoundsWin(+1);
//              for (Player counterTerrorist : counterTerrorists
//              ) {
//                counterTerrorist.setCash(counterTerrorist.getCash() + 1000);
//              }
//            } else {
//              for (Player terrorist : terrorists
//              ) {
//                terrorist.setCash(terrorist.getCash() + 500);
//              }
//            }
//          }
//      System.out.println(terrorists);
//      System.out.println(counterTerrorists);
//        }
//
//      }
//
//
//
//
//
//
//  private static void SetVest(List<Vest> vests, Random random, Collection<Player> players) {
//    Vest randomVest;
//    for (Player player : players) {
//      if (player.getWeapon().getName().equals("Tactical Knife")) {
//        continue;
//      }
//      randomVest = vests.get(random.nextInt(vests.size()));
//      for (int i = 0; i < 3; i++) {
//        if (randomVest.getPrice() < player.getCash()) {
//
//          player.setVest(randomVest);
//          player.setCash(player.getCash() - randomVest.getPrice());
//        } else {
//          randomVest = vests.get(random.nextInt(vests.size()));
//        }
//      }
//    }
//  }
//
//  private static void SetWeapon(List<Weapon> weapons, Weapon knife, Random random,
//      Collection<Player> players, int startingMoney, Weapon randomElement) {
//    for (Player player : players) {
//      randomElement = weapons.get(random.nextInt(weapons.size()));
//      boolean hasWeapon = false;
//      for (int i = 0; i < 5; i++) {
//
//        if (randomElement.getPrice() < player.getCash()) {
//          hasWeapon = true;
//          player.setWeapon(randomElement);
//          player.setCash(startingMoney - player.getWeapon().getPrice());
//          break;
//        } else {
//          randomElement = weapons.get(random.nextInt(weapons.size()));
//        }
//      }
//      if (!hasWeapon) {
//        player.setWeapon(knife);
//      }
//
//    }
//
//  }
//
//  public static int generateNumberOfPlayers(int min, int max) {
//    Random random = new Random();
//    return random.nextInt(max - min) + min;
//  }
//
//}
