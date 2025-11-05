public class Solution {
  public static String vaporcode(String s) {
    return s.replace(" ","").replace("", "  ").toUpperCase().trim();
  }
}