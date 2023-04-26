package exercisesOOP.iterators.exceptionsAndMore;

import java.io.IOException;

public class MyResource implements AutoCloseable {

  public void myMethod() throws IOException {
    throw new IOException("Something went wrong!");
  }


  @Override
  public void close() throws Exception {
    throw new Exception("Something went wrong!");
  }
}
