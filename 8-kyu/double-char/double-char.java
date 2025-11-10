public class Solution{
  public static String doubleChar(String s){
    //enter your code here 
    // The regex "." matches any single character (except newline).
    // The replacement string "$0$0" takes the matched character ($0) and repeats it.
    return s.replaceAll(".", "$0$0");
  }
}