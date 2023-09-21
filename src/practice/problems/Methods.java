package practice.problems;

public class Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 500;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println(highScore);

        score = 500;
        levelCompleted = 5;
        bonus = 100;
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println(highScore);

        int highScorePosition = calculateHighScorePosition(highScore);
        displayHighScorePosition("Prasanna", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Test1", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Test2", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Test3", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Test4", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Test5", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Test5", highScorePosition);
    }

    private static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score " + finalScore);
            return finalScore;
        }
        return -1;
    }

    private static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position+" on the high score table");
    }

    private static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500)
//            return 2;
//        else if (playerScore >= 100)
//            return 3;
//        return 4;
        int position=4;
        if(playerScore>=1000)
            position=1;
        else if (playerScore>=500)
            position=2;
        else if(playerScore>=100)
            position=3;
        return position;
    }
}
