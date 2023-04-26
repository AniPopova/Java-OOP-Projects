package mentor.laptopAbstraction;

public class Folder {

  private String folderName;

  public Folder(String folderName) {
    this.folderName = folderName;
  }

  public String getFolderName() {
    return folderName;
  }

  public void setFolderName(String folderName) {
    this.folderName = folderName;
  }

  @Override
  public String toString() {
    return "Folder " + folderName + " does exists in the system.";
  }
}
