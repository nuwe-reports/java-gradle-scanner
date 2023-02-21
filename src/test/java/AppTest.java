import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

  @Test
  void myPassedTest() {
      assertEquals(App.sum2(3, 4), 7);
  }
  /*@Test
    void myFailedTest() {
        assertEquals(First.sum2(3, 9), 9);
  }*/
}
