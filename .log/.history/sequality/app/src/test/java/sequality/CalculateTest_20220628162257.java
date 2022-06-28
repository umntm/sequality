package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));

    double SaA = 2.5;
    assertEquals(SaA, calculate.sum_and_ave(2, 3), 0.0);

    double StA = 5.5;
    assertEquals(StA, calculate.sum_to_ave(1, 10), 0.0);
  }
}
