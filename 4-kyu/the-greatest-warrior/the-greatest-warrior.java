import java.util.ArrayList;
​
public class Warrior {
    int level = 1;
    String rank = "Pushover";
    int experience = 100;
    ArrayList<String> achievements = new ArrayList<>();
    String[] ranks = new String[] {"Pushover", "Novice", "Fighter", "Warrior", "Veteran", "Sage", "Elite", "Conqueror", "Champion", "Master", "Greatest"};
​
    String training(String info, int exp, int minLvl) {
        if (level >= minLvl) {
            achievements.add(info);
            experience += exp;
            level = Math.floorDiv(experience, 100);
        } else {
            return "Not strong enough";
        }
​
        return info;
    }
​
    boolean isWarriorsSameRank(int first, int second) {
        return Math.floorDiv(first, 10) == Math.floorDiv(second, 10);
    }
​
​
    String battle(int enemyLvl) {
        if (enemyLvl < 1 || enemyLvl > 100) {
            return "Invalid level";
        }
​
        String fightResult = getFightResult(enemyLvl);
        level = Math.floorDiv(experience, 100);
        return fightResult;
    }
​
    String getFightResult(int enemyLvl_) {
        if (level == enemyLvl_) {
            experience += 10;
            return "A good fight";
        }
        if (level - enemyLvl_ == 1) {
            experience += 5;