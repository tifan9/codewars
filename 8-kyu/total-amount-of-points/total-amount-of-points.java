public class TotalPoints {
  
    public static int points(String[] games) {
        int totalPoints = 0;
        for (String game : games) {
            int ourScore = game.charAt(0) - '0';
            int opponentScore = game.charAt(2) - '0';
            if (ourScore > opponentScore) {
                totalPoints += 3;
            } else if (ourScore == opponentScore) {
                totalPoints += 1;
            } else {
            }
        }
        return totalPoints;
    }
}