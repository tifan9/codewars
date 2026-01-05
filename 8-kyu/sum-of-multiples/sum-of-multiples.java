public class Kata {
    public static long sumMul(int n, int m) throws IllegalArgumentException {
        if (n <= 0 || m <= 0) {
            throw new IllegalArgumentException();
        }
        
        long sum = 0;
        for (int i = n; i < m; i += n) {
            sum += i;
        }
        return sum;
    }
}
​