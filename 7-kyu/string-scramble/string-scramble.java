public class StringScramble {
  
  public static String scramble(String str, int[] indices) {
    
    char[] res = new char[indices.length];
    for(int i = 0; i<indices.length; i++){
      int current = indices[i];
      res[current] = str.charAt(i);
    }
    
    //good luck!
    return new String(res);
  }
}