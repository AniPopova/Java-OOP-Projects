package svetlanaProycheva.exercise20220706;
class Experiment {
  private int num = 1;
  private static Experiment instance;
  private Experiment() {
  }


  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public static Experiment getInstance(){
    if(instance == null){
      instance = new Experiment();
    }
    return instance;

  }

  @Override
  public String toString() {
    return "Experiment{" +
        "num=" + num +
        '}';
  }
}