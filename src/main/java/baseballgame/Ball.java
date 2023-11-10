package baseballgame;

public class Ball {
    private final int number;
    private final int sequence;
    private BallStateType ballStateType;

    public Ball(int number, int sequence) {
        this.number = number;
        this.sequence = sequence;
        this.ballStateType = BallStateType.NOTHING;
    }

    public BallStateType getBallStateType() {
        return ballStateType;
    }

    public void compareAndUpdateState(Balls anotherBalls) {
        for (Ball anotherBall : anotherBalls.get()) {
            if (ballStateType != BallStateType.NOTHING) {
                continue;
            }

            if (number == anotherBall.number && sequence == anotherBall.sequence) {
                ballStateType = BallStateType.STRIKE;
            }

            if (number == anotherBall.number && sequence != anotherBall.sequence) {
                ballStateType = BallStateType.BALL;
            }
        }
    }

    @Override
    public String toString() {
        return "Ball{" +
                "number=" + number +
                ", sequence=" + sequence +
                ", ballStateType=" + ballStateType +
                '}';
    }
}
