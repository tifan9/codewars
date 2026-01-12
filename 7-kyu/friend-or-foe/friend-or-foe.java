import java.util.*;
class Kata {
   public static List<String> friend(List<String> x){
     List<String> friends= new ArrayList<>();
     for(String name: x){
       if(name.length() == 4){
         friends.add(name);
       }
     }
     return friends;
   }
}