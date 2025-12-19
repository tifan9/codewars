public class Order {
  public static String order(String words) {
    if(words == null || words.isEmpty()){
      return "";
    }
    
    String[] splitwords = words.split(" ");
    String[] res = new String [splitwords.length];
    for(String word : splitwords){
      for(int i=0; i< word.length(); i++){
        char c = word.charAt(i);
        if(Character.isDigit(c)){
          int position = Character.getNumericValue(c) - 1;
          res[position] = word;
          break;
        }
      }
    }
    return String.join(" ", res);
  }
}