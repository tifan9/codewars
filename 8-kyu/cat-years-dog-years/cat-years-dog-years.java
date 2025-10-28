public class Dinglemouse {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 0, dogYears = 0;
        
        // First year: 15 for both
        if (humanYears >= 1) {
            catYears += 15;
            dogYears += 15;
        }
        // Second year: +9 for both
        if (humanYears >= 2) {
            catYears += 9;
            dogYears += 9;
        }
        // Each year after: +4 cat, +5 dog
        if (humanYears > 2) {
            int extra = humanYears - 2;
            catYears += extra * 4;
            dogYears += extra * 5;
        }
        
        return new int[]{humanYears, catYears, dogYears};
    }
}