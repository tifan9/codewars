import java.util.*;
public class Scramblies {
    
    public static boolean scramble(String str1, String str2) {    
      int[] charCount = new int[26];
      for(char c : str1.toCharArray()){
        // act as an index
        charCount[c - 'a']++;
      }
      for(char c : str2.toCharArray()){
        
        int index = c - 'a';
        charCount[index]--;
        if(charCount[index] < 0){
          return false;
        }
      }
      
      return true;
    }
}