public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    // Insert brilliant code here
    if(walk.length !=10){
      return false;
    }
    int northSouth = 0;
    int eastWest = 0;
    
    for(char direction : walk){
      switch (direction){
          case 'n':
            northSouth ++;
          break;
          case 's':
            northSouth --;
          break;
          case 'e':
            eastWest ++;
          break;
          case 'w':
            eastWest --;
          break;
      }
    }
    return (northSouth == 0) && (eastWest == 0);
  }
}