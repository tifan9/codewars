class Solution {
    public static int solve(long n) {
        int maxSum = digitSum(n); 
​
        long powerOfTenMinusOne = 9; 
        
        while (powerOfTenMinusOne < n) {
            long a = powerOfTenMinusOne;
            long b = n - a;
            int currentSum = digitSum(a) + digitSum(b);
            maxSum = Math.max(maxSum, currentSum);
            if (powerOfTenMinusOne > Long.MAX_VALUE / 10) {
                 break;
            }
            powerOfTenMinusOne = powerOfTenMinusOne * 10 + 9;
        }
        return maxSum;
    }
    
    private static int digitSum(long x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}