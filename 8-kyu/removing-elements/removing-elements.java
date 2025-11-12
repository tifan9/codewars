import java.util.*;
public class Kata {
  
  public static Object[] removeEveryOther(Object[] arr) {
    // happy coding
    ArrayList<Object> obje = new ArrayList<>();
    for(int i=0; i < arr.length; i++){
      if(i % 2 == 0){
        obje.add(arr[i]);
      }
    }
    return obje.toArray();
  }
}