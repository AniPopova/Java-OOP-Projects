package svetlanaProycheva.exception;

import java.util.Scanner;

public class ExceptionDemo3
{
  Scanner scanner = new Scanner(System.in);
  public static void main(String[] args)
  {
    readInt(8,3);
  }


  public static int readInt( int min, int max){

    if(min < max){
      return  min;
    }
    return  max;
  }
}
