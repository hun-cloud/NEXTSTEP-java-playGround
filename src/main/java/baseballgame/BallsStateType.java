package baseballgame;

public enum BallsStateType {
    ANSWER("정답"),
    WRONG("오답");

    private final String text;

    BallsStateType(String text) {
        this.text = text;
    }
}
