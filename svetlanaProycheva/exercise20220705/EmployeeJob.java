package svetlanaProycheva.exercise20220705;
import java.util.*;

public class EmployeeJob {

  Scanner input = new Scanner(System.in);
  private String jobTitle;
  private List<String> duties = new ArrayList<>();

  public static EmployeeJob createEmployeeJob() {
    return new EmployeeJob();
  }

  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public List<String> getDuties() {
    return duties;
  }

  public void setDuties(List<String> duties) {
    this.duties = Collections.singletonList(input.nextLine());
  }


  public List addDuties(List<String> duties) {
    for (int i = 0; i < 5; i++) {
      duties.add(input.nextLine());
      System.out.println(duties.toString());
    }
    return Collections.singletonList(duties.toString());
  }
}



