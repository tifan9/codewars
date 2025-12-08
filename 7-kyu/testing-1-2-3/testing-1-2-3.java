import java.util.*;
​
public class LineNumbering {
    public static List<String> number(List<String> lines) {
      if(lines == null || lines.isEmpty()){
        return Collections.emptyList();
      }
      List<String> nbrLine = new ArrayList<>();
      int lnNumber = 1;
      for(String line : lines){
        nbrLine.add(lnNumber + ": " + line);
        lnNumber++;
      }
        return nbrLine;
    }
}