package sequality;

import org.checkerframework.checker.units.qual.C;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double sum_and_ave(int x, int y) {
    return (double) (x + y) / 2;
  }

  public static void main(String[] args) {
    int x = 2, y = 3;

    System.out.println("Sum of "+x+" and "+y+" is "+x+y+". Average is "+ new Calculate().sum_and_ave(x,
        y)+".",
                       new Calculate().sum_and_ave(x, y));
  }
}
