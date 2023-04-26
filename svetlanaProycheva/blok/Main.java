package svetlanaProycheva.blok;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Blok blok = new Blok(8, 2, 300);
    Blok blok2 = new Blok(-2, 8, 200);

    List<Blok> bloks = new ArrayList<>();
    bloks.add(blok);
    bloks.add(blok2);
    for (int i = 0; i < bloks.size() - 1; i++) {

      if (bloks.get(i).getFloor() < bloks.get(i + 1).getFloor()) {

        System.out.println("blok2 > blok");
      } else {

        System.out.println("blok2 < blok");
      }
    }
  }
}