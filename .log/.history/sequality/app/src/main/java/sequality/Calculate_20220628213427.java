package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double sum_and_ave(int x, int y) {
    return (double) (x + y) / 2;
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
  }
}
