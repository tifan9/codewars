public class SumArray {
​
  public static double sum(double[] numbers) {
    double sum = 0.0;
    for(double number : numbers){
      sum += number;
    }
    return sum;
  }
}