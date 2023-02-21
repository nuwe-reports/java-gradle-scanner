import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

  @Test
  public void myPassedTest() {
      assertEquals(App.sum2(3, 4), 7);
  }
  
  @Test
  public void myFailedTest() {
    assertEquals(App.sum2(3, 9), 9);
  }

}
