public class Kata {
  public static int[] digitize(long n) {
    
    String str = Long.toString(n);
    int[] arr = new int[str.length()];
  
    int index = 0;
    for(int i =str.length() - 1; i >=0; i--){
      char c = str.charAt(i);
      arr[index] = Character.getNumericValue(c);
        index ++;
      
    }
    return arr;
  }
}