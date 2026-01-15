class LongestConsec {
    
    public static String longestConsec(String[] strarr, int k) {
         int n = strarr.length;
        if (n == 0 || k > n || k <= 0) {
            return "";
        }
​
        String longestCon = "";
​
        for (int i = 0; i <= n - k; i++) {
            StringBuilder currentConcat = new StringBuilder();
​
            for (int j = 0; j < k; j++) {
                currentConcat.append(strarr[i + j]);
            }
            
            String tempStr = currentConcat.toString();
​
            if (tempStr.length() > longestCon.length()) {
                longestCon = tempStr;
            }
        }
​
        return longestCon;
    }
}