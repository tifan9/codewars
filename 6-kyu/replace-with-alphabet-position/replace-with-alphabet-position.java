class Kata {
    static String alphabetPosition(String text) {
      StringBuilder result = new StringBuilder();
      
      for(int i=0; i<text.length(); i++){
        char character = text.charAt(i);
        char lowerCase = Character.toLowerCase(character);
        
        if(lowerCase >= 'a' && lowerCase <='z'){
          //check possition
          int position = lowerCase - 'a' + 1;
          result.append(position);
          result.append(" ");
        }
      }
      return result.toString().trim();
    }
}
​