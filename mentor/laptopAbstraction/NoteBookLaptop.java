package mentor.laptopAbstraction;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class NoteBookLaptop extends Laptop implements UserLaptop, LaptopStartable {

  Scanner scanner;
  private List<Folder> folders;
  private double maxFrameRate ;
  public NoteBookLaptop(String brand, String model, BigDecimal price) {
    super(brand, model, price);
    this.maxFrameRate = 60;
  }


  public List<Folder> getFolders() {
    return folders;
  }

  public void setFolders(List<Folder> folders) {
    this.folders = folders;
  }

  @Override
  public void powerUp() {
    System.out.print("Welcome to the internet world dear user. I am happy to see you again!\n");
  }

  @Override
  public void shutDown() {
    System.out.println("I am so sorry we have to separate again, come back later. Bye user!");
  }

  @Override
  public void start() {
    System.out.println("Starting...");
  }

  @Override
  public void findFolder(String folderName) {
    System.out.print("Please enter the name of the game you are looking for: ");
    for (Folder folder : folders) {
      folderName = folder.getFolderName();
      if (folderName.equalsIgnoreCase(folderName)) {
        System.out.println("Folder " + folderName + " is found.");
        return;
      }
    }

    System.out.println("The folder " + folderName + " is not found.");
    System.out.println("What would you like next?");
    System.out.print("(1) - Install new game\n(2) - Search another game\n(0) - Whatever!");
    int choice = scanner.nextInt();
    if (choice == 1) {
      this.folders.add(new Folder(scanner.nextLine()));
    } else if (choice == 2) {

      findFolder(scanner.nextLine());
    }else if(choice==0){

    }else {
      System.out.println("Make a valid choice");
    }
  }

  @Override
  public String toString() {
    return "Note MyBook is a non-gaming machine. It is a " + super.toString();
  }
}
