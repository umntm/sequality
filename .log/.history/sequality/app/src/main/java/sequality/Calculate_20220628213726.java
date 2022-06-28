package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double sum_and_ave(int x, int y) {
    return (double) (x + y) / 2;
  }

  public static void main(String[] args) {
    int x = 2, y = 3;
    System.out.println("Sum of %d and %d is %d. Average is %d.",
                        x, y, x + y, );
  }
}
