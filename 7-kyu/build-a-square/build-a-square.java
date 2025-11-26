public class Kata {
    public static final String generateShape(int n) {
      String r1 = "+".repeat(n);
      String r2 ="";
      for(int i = 1;  i <= n; i++){
        if(i== n){
          r2 +=r1;
        }else{
          r2 +=r1 + "\n" ;
        }
      }
        return r2;
    }
}
​