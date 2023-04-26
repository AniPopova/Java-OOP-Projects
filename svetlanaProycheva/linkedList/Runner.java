package svetlanaProycheva.linkedList;

public class Runner {
  public static void main(String[] args) {
    CustomLinkedList list = new CustomLinkedList();
    list.insert(12); //12
    list.insertAtStart(191); //191 12 43
    list.insertAt(2, 2222); //191 12 2222 43
    list.deleteAt(2); //191 12 43
    list.deleteAt(1); //191 12
    list.deleteAt(0); //191
    list.show();
  }
}