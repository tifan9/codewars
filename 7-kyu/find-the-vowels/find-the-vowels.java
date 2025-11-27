import java.util.ArrayList;
import java.util.List;
public class Kata{
  
  public static int[] vowelIndices(String word){
   String vowels = "aiuoeyAIUOEY";
    List<Integer> list = new ArrayList<>();
    for(int i =0; i < word.length(); i++){
      char current = word.charAt(i);
      if(vowels.indexOf(current) != -1){
        list.add(i + 1);
      }
    }
    return list.stream().mapToInt(Integer::intValue).toArray();
  }
}