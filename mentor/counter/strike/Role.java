package mentor.counter.strike;

public enum Role {
  COUNTER_TERRORIST("Counter-Terrorist"), TERRORIST("Terrorist");
  private String role;

  Role(String role) {
    this.role = role;
  }
}
