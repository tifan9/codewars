public class BackspacesInString {
  public String cleanString(String s) {
    // your code here
    StringBuilder res = new StringBuilder();
    for(char c : s.toCharArray()){
      if(c == '#'){
        if(res.length() > 0){
          res.deleteCharAt(res.length()-1);
        }
      }else{
        res.append(c);
      }
    }
    return res.toString();
  }
  
}