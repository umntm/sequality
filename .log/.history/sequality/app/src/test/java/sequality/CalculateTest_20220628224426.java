package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));

    double saa = 2.5;
    assertEquals(saa, calculate.sum_and_ave(2, 3), 0);

    int sf = 55;
    assertEquals(sf, calculate.sumfor(1, 10));

    double sta = 5.5;
    assertEquals(sta, calculate.sum_and_ave(1, 10), 0);

    int sf = 55;
    assertEquals(sf, calculate.sumfor(1, 10));

    int sf = 55;
    assertEquals(sf, calculate.sumfor(1, 10));
  }
}
