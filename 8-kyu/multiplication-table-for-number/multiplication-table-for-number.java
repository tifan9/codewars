class Kata {
    public static String multiTable(int num) {
      String result = "";
      for (int i =1; i <= 10; i ++){
        int product = i * num;
        String format = i + " * " + num + " = " + product;
        if(i < 10){
          result = result + format + "\n";
        }else
          result += format; 
      }
      
        return result; // good luck
    }
}