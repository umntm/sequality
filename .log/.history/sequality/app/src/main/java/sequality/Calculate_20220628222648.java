package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double sum_and_ave(int x, int y) {
    return (double) (x + y) / 2;
  }

  public int sumfor(int x, int y){
    int sf = 0;
    for(int i = x; i <= y; i++){
      sf += i;
    }
    return sf;
  }

  public double sum_to_ave(int x, int y) {
    return (double) (x + y) / 2;
  }
}
