public class Dinglemouse {
​
  public static int[] paintLetterboxes(final int start, final int end) {
    // Your code here
    // initialize the array to have 10; 
    int [] frequency = new int[10];
    for(int i = start; i<= end; i++){
      int current = i;
      while(current > 0){
        //get the last digit;
        int digit = current % 10;
        // increment the count digit;
        frequency[digit] ++;
        // remove the last digit;
        current /=10;
      }
      
    }
    return frequency;
  }
​
}