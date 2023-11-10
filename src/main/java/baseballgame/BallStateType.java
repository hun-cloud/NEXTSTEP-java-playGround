package baseballgame;

public enum BallStateType {
    STRIKE("스트라이크"),
    BALL("볼"),
    NOTHING("낫띵");

    private final String text;

    BallStateType(String text) {
        this.text = text;
    }
}
