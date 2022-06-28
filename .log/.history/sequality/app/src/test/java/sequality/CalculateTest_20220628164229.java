package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
    assertEquals("Sum of 2 and 3 is 5. Average is 5.5.", calculate.sum_and_ave(2, 3));
  }
}
