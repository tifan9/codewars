public class Kata {
  public static int rentalCarCost(int d) {
    // Your solution here
    int initialCost = d * 40;
    return initialCost - (d >= 7 ? 50 : (d >= 3 ? 20 : 0));
  }
}
​