public class Main {
    public static void main(String[] args){
        int newScore = calculateScore("Jean", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(1,9));
        System.out.println(calcFeetAndInchesToCentimeters(49));
        System.out.println(calcFeetAndInchesToCentimeters(9));
        System.out.println(calcFeetAndInchesToCentimeters(3, 15));
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " score " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet >= 0 && inches >= 0 && inches <= 12){
            double cmFeet = feet * 30.48;
            double cmInches = inches * 2.54;
            return cmFeet + cmInches;
        }
        else return -1;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        int inFeet;
        if (inches >=0){
            if (inches >= 12) {
                inFeet = (int) (inches / 12);
                inches = inches - (inFeet * 12);
                double centimeters = calcFeetAndInchesToCentimeters(inFeet, inches);
                return centimeters;
            }
            else {
                double cmInches = inches * 2.54;
                return cmInches;
            }
        }
        else return -1;
    }
}
