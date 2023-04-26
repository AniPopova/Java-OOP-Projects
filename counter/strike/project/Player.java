package counter.strike.project;

public class Player {

  private Role role;
  private int hp = 100;
  private Vest vest;
  private String username;
  private int numberOfKills=0;
  private int numberOfDeaths=0;
  private Weapon weapon;
  private int cash;
  private boolean isDead = false;


  public Player() {

  }


  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    if (role == (Role.TERRORIST)) {
      int BONUS_HP = 20;
      this.hp = hp + BONUS_HP;
    } else {
      this.hp = hp;
    }
  }

  public Vest getVest() {
    return vest;
  }

  public void setVest(Vest vest) {
    this.vest = vest;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public int getNumberOfKills() {
    return numberOfKills;
  }

  public void setNumberOfKills(int numberOfKills) {
    this.numberOfKills = numberOfKills;
  }

  public int getNumberOfDeaths() {
    return numberOfDeaths;
  }

  public void setNumberOfDeaths(int numberOfDeaths) {
    this.numberOfDeaths = numberOfDeaths;
  }

  public Weapon getWeapon() {
    return weapon;
  }

  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }

  public int getCash() {
    return cash;
  }

  public void setCash(int cash) {
    this.cash = cash;
  }

  public boolean isDead() {
    return isDead;
  }

  public void setDead(boolean dead) {
    isDead = dead;
  }

  @Override
  public String toString() {
    return "Player{" +
        "role=" + role + "\n" +
        ", hp=" + hp + "\n" +
        ", vest=" + vest + "\n" +
        ", username='" + username + '\'' + "\n" +
        ", numberOfKills=" + numberOfKills + "\n" +
        ", numberOfDeaths=" + numberOfDeaths + "\n" +
        ", weapon=" + weapon + "\n" +
        ", cash=" + cash + "\n" +
        ", isDead=" + isDead +
        '}';
  }
}
