class Solution {
    public static String isSortedAndHow(int[] array) {
      int first = array[0];
      int second = -1;
      for(int i =1; i < array.length; i++){
        if(array[i] != first){
          second = array[i];
          break;
        }
        
      }
      if(second > first){
        for(int j = 1; j < array.length; j++){
          if(array[j] < array[j-1]){
            return "no";
          }
        }
        return "yes, ascending";
      }else{
        for(int j = 1; j < array.length; j++){
          if(array[j]>array[j-1]){
            return "no";
          }
        }
        return "yes, descending";
      }
        
    }
}