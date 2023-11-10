package baseballgame.manager;

import baseballgame.Balls;
import baseballgame.BaseBallGameResult;
import baseballgame.parser.CommonParser;

public class BaseballGameManager {

    public void startGame() {
        String answer = AnswerManager.getAnswer();
        boolean flag = true;

        while (flag) {
            String input = InputManager.getInput();
            Balls inputBalls = CommonParser.toBalls(input);
            Balls answerBalls = CommonParser.toBalls(answer);

            ResultManager.compareBalls(answerBalls, inputBalls);

            BaseBallGameResult baseBallGameResult = new BaseBallGameResult(inputBalls);

            PrintManager.printResult(baseBallGameResult);

            flag = InputManager.getInputResult();
        }
    }
}
