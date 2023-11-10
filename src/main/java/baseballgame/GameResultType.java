package baseballgame;

public enum GameResultType {

    ANSWER("정답"),
    WRONG("오답"),
    OUT("아웃");

    private final String text;

    GameResultType(String text) {
        this.text = text;
    }
}
