package counter.strike.project;

public enum Role {
  COUNTER_TERRORIS(10), TERRORIST(0);
  private final int BONUS_DMG;

  Role(int BONUS_DMG) {
    this.BONUS_DMG = BONUS_DMG;
  }

  public int getBONUS_DMG() {
    return BONUS_DMG;
  }
}
