package laptop.abstraction.ivo;

public interface GamingLaptop {
    Game findGame(String gameName);

    void testGpu();

    void modifyFrameRate(double frameRate);
}
