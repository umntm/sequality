/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

    int x = 2, y = 3;
    System.out.println(
        "Sum of " + x + " and " + y + " is " + (x + y) + ". Average is " + new Calculate().sum_and_ave(x, y) + ".");

    int a = 1, b = 10;
    System.out.println(
        "Sum of " + a + " to " + b + " is " + new Calculate().sumfor(a, b) + ". Average is "+ new Calculate().sum_to_ave(a, b) + ".");

    System.out.println("Sum of odd of " + a + " to " + b + " is " + new Calculate().sumfor(a, b)
        + ". to 10 is 25. Sum of even is 30.");
  }
}
