package baseballgame.parser;

import baseballgame.Ball;
import baseballgame.BallStateType;
import baseballgame.Balls;

import static java.util.stream.IntStream.*;

public class CommonParser {

    public static Balls toBalls(String numStr) {
        Balls balls = new Balls();

        String[] numArr = numStr.split("");

        range(0, numArr.length).forEach(i -> {
            String num = numArr[i];
            Ball ball = new Ball(Integer.valueOf(num), i);
            balls.addBall(ball);
        });

        return balls;
    }

    public static int toNumber(BallStateType ballStateType) {
        int result = 0;

        if (BallStateType.STRIKE.equals(ballStateType)) {
            result = 1;
        }

        return result;
    }
}
