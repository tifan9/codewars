public class Ship {
  private final double draft;
  private final int crew;
    
  public Ship(double draft, int crew) {
    this.draft = draft;
    this.crew = crew;
  }
​
  // your code here
  public boolean isWorthIt(){
    final double crewWeight = this.crew * 1.5;
    final double bootDraft = this.draft - crewWeight;
    return bootDraft > 20;
  }
} 