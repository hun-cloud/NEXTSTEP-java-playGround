package baseballgame.manager;

import baseballgame.Balls;

public class ResultManager {

    public static void compareBalls(Balls answerBalls, Balls inputBalls) {
        inputBalls.compareBalls(answerBalls);
    }

    public static boolean reGameCheck(int input) {
        return input == 1 ? true : false;
    }
}
