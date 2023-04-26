package svetlanaProycheva.time;

public class Time {

  private int hour;
  private int minutes;
  private int seconds;

  public void setHour(int newHour) {
    if(newHour >=0 && newHour <=23){
      this.hour = newHour;
    } else{
      System.out.println("Error, enter valid hour");
      hour = 0;
    }
  }
  public void setMinutes(int newMinute){
    if(newMinute >=0 && newMinute <=59){
      this.minutes = newMinute;
    } else{
      System.out.println("Error, enter valid minutes");
      minutes = 0;
    }
  }
  public void setSeconds(int newSecond){
    if(newSecond >=0 && newSecond <=59){
      this.seconds = newSecond;
    } else{
      System.out.println("Error, enter valid seconds");
      seconds = 0;
    }
  }

  public void thick(){
    seconds++;
    if(seconds == 60){
      seconds = 0;
      minutes++;
      if(minutes == 60){
        minutes = 0;
        hour++;
        if(hour == 24){
          hour = 0;
        }
      }
    }

  }
  public void print(){
    System.out.printf("The time is: %02d:%02d:%02d \n", hour, minutes, seconds);
  }


  @Override
  public String toString() {
    return "Time" +
        "hour =" + hour +
        ", minutes =" + minutes +
        ", seconds =" + seconds
        ;
  }
}
