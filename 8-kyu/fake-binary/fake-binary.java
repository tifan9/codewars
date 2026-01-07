public class FakeBinary {
    public static String fakeBin(String numberString) {
      StringBuilder res = new StringBuilder();
      for(int i = 0; i< numberString.length();  i++){
        int num = Character.getNumericValue(numberString.charAt(i));
        if(num < 5){
          res.append('0');
        }else{
          res.append('1');
        }
      }
        return res.toString();
    }
}