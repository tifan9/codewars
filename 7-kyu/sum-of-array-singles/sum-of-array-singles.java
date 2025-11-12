import java.util.*;
class Solution{
    public static int repeats(int [] arr){
        //..
    Arrays.sort(arr);
    int sum = 0;
    int i = 0;
      
      while(i< arr.length){
        if(i == arr.length -1 || arr[i] != arr[i + 1]){
          sum += arr[i];
          i++;
        }else{
          i += 2;
        }
      }
      return sum;
      
        
      }
    }