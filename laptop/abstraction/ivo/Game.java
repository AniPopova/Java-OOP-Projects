package laptop.abstraction.ivo;

import java.math.BigDecimal;

public class Game {
    private String name;
    private BigDecimal price;

    public Game() {
        this.name = "";
        this.price = BigDecimal.valueOf(0);
    }

    public Game(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Game name " + name + "\n" +
                "price " + price + "\n";
    }
}
