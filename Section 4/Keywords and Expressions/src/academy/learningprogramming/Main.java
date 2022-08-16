package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score <  5000 && score > 1000){
//            System.out.println("Your score was less than 500 but greater than 100");
//        } else if (score < 1000){
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was "+ finalScore);
        }

        score = 1000;
        levelCompleted = 8;
        bonus = 200;
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("New score " + finalScore);
        }
    }
}
