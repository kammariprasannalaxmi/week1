package sunil;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("working");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("working");
  }

  @AfterTest
  public void afterTest() {
  }

}
