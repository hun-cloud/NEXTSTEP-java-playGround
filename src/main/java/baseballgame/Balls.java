package baseballgame;

import baseballgame.parser.CommonParser;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private final List<Ball> balls = new ArrayList<>();
    private BallsStateType ballsStateType = BallsStateType.WRONG;

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public List<Ball> get() {
        return balls;
    }

    public void compareBalls(Balls anotherBalls) {
        for (int i = 0; i < balls.size(); i++) {
            Ball myBall = balls.get(i);
            myBall.compareAndUpdateState(anotherBalls);
        }

        updateBallsState();
    }

    private void updateBallsState() {
        int strikeCount = 0;

        for (Ball ball : balls) {
            strikeCount += CommonParser.toNumber(ball.getBallStateType());
        }

        if (strikeCount == 3) {
            ballsStateType = BallsStateType.ANSWER;
        }
    }
}
