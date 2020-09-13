public class RoundSum2 {
  public int roundSum(int a, int b, int c) {
    return round10(a) + round10(b) + round10(c);
  }

  public int round10(int num) {
    if (num % 10 < 5) {
      return num - (num % 10);
    } else {
      return num + (10 - (num % 10));
    }
  }
}
