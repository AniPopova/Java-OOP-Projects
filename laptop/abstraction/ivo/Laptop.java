package laptop.abstraction.ivo;

import java.math.BigDecimal;

public class Laptop {
    private String brand;
    private String model;
    private BigDecimal price;
    private int gpu;
    private double frameRatePerSecond;
    private boolean isStarted;

    public Laptop() {
        this.brand = "";
        this.model = "";
        this.price = BigDecimal.valueOf(2);
        this.gpu = 0;
        this.frameRatePerSecond = 0;
        this.isStarted = false;
    }

    public Laptop(String brand, String model, BigDecimal price, int gpu, double frameRatePerSecond) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.gpu = gpu;
        this.frameRatePerSecond = frameRatePerSecond;
        this.isStarted = false;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setStarted(boolean started) {
        isStarted = started;
    }

    public void setGpu(int gpu) {
        this.gpu = gpu;
    }

    public void setFrameRatePerSecond(double frameRatePerSecond) {
        this.frameRatePerSecond = frameRatePerSecond;
    }

    public boolean isGpuGood() {
        return this.gpu >= 32;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", gpu=" + gpu +
                ", frameRatePerSecond=" + frameRatePerSecond +
                "}\n";
    }
}
