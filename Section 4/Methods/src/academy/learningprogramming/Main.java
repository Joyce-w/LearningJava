package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {
//        calculateScore(true,4000,5,100);
//        calculateScore(true,1000,8,200);
        int joycesScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Joyce", joycesScore);

        int joycesScore2 = calculateHighScorePosition(900);
        displayHighScorePosition("Joe", joycesScore2);

        int joycesScore3 = calculateHighScorePosition(50);
        displayHighScorePosition("Jacob", joycesScore3);

        int joycesScore4 = calculateHighScorePosition(500);
        displayHighScorePosition("Josh", joycesScore4);
    }
//    public static void calculateScore(
//            boolean gameOver,
//            int score,
//            int levelCompleted,
//            int bonus
//    ) {
//        if(gameOver){
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was "+ finalScore);
//        }
//    }

    public static int calculateHighScorePosition(int score){
        if(score > 1000){
            return 1;
        } else if (score > 500 && score < 1000){
            return 2;
        } else if (score > 100 && score < 500){
            return 3;
        } else {
            return 4;        }
    }
    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get a position of " + position);
    }
}
