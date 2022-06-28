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
    return (double) sumfor(x, y) / 10;
  }

  public int sum_odd_even(int x, int y, int z) {
    int soe = 0;
    if (z == 1) {
      for (int i = x; i <= y; i++) {
        if()
      }
    } else {
    }
    return soe;
  }
}
