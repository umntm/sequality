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
    assertEquals(SaA, calculate.sum_and_ave(double(2), double(3)));
  }
}