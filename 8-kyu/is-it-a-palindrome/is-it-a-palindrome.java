public class Palindrome {
  public static Boolean isPalindrome(String x) {
    // your code here
    String reverse = new StringBuilder(x).reverse().toString();
    if(x.equalsIgnoreCase(reverse)){
      return true;
    }else{
      return false;
    }
  }
}