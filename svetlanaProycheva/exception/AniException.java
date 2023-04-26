package svetlanaProycheva.exception;

public class AniException extends RuntimeException
{

  public AniException()
  {
  }

  @Override
  public String getMessage()
  {
    return "Недостатъчна наличност!";
  }

}
