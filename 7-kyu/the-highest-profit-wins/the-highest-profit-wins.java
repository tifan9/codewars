class MinMax {
    public static int[] minMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
​
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
​
        return new int[] { min, max };
    }
}
​