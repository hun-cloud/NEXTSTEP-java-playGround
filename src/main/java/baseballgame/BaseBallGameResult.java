package baseballgame;

public class BaseBallGameResult {
    private int strikeCount;
    private int ballCount;
    private int nothingCount;
    private GameResultType gameResultType;
    private boolean result = true;

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    public boolean isResult() {
        return result;
    }

    public BaseBallGameResult(Balls balls) {
        gameResultType = GameResultType.WRONG;

        balls.get().forEach(ball -> {
            BallStateType ballStateType = ball.getBallStateType();
            if (BallStateType.STRIKE.equals(ballStateType)) {
                strikeCount++;
            }

            if (BallStateType.BALL.equals(ballStateType)) {
                ballCount++;
            }
        });

        if (strikeCount == 3) {
            gameResultType = GameResultType.ANSWER;
            result = false;
        }

        if (strikeCount + ballCount == 0) {
            gameResultType = GameResultType.OUT;
        }

    }
}
