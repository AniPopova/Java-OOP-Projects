/**
 * Adapter Pattern: This pattern allows two
 * incompatible interfaces to work together by creating a bridge between them.
 */
public class AdapterPattern
{
  public interface MediaPlayer
  {

    void play(String audioType, String fileName);
  }

  public interface AdvancedMediaPlayer
  {

    void playVlc(String fileName);

    void playMp4(String fileName);
  }

  public class VlcPlayer implements AdvancedMediaPlayer
  {

    @Override
    public void playVlc(String fileName)
    {
      System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName)
    {
      // do nothing
    }
  }

  public class Mp4Player implements AdvancedMediaPlayer
  {


    @Override
    public void playVlc(String fileName)
    {

    }

    @Override
    public void playMp4(String fileName)
    {

    }
  }
}