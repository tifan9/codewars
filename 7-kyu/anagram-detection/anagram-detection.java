import java.util.Arrays;
public class Kata {
  public static boolean isAnagram(String a, String b) {
    // your code goes here
    a = a.toLowerCase();
    b = b.toLowerCase();
    if(a.length() == b.length()){
      char[] char1 = a.toCharArray();
      char[] char2 = b.toCharArray();
      Arrays.sort(char1);
      Arrays.sort(char2);
      
      boolean result = Arrays.equals(char1, char2);
      if(result){
          return true;
      }else{
        return false;
      }
      
    }
    return false;
  }
}