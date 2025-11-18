public class Cockroach{
  public int cockroachSpeed(double x){
    // Good Luck!
//     1 km = 100,000 cm
//     1 hr = 3,600 seconds
//     calculate  = distance / time
    double speedCmPerSecond = x * (100000.0 / 3600.0);
    return (int) Math.floor(speedCmPerSecond);
  }
}