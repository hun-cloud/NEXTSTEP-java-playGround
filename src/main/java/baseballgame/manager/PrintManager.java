package baseballgame.manager;

import baseballgame.BaseBallGameResult;

public class PrintManager {

    private static final String ballText = "볼";
    private static final String strikeText = "스트라이크";
    private static final String outText = "낫띵";
    private static final String winText = "3개 숫자를 모두 맞히셨습니다! 게임종료\n 게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static void printResult(BaseBallGameResult baseBallGameResult) {

        int ballCount = baseBallGameResult.getBallCount();
        int strikeCount = baseBallGameResult.getStrikeCount();
        StringBuilder sb = new StringBuilder();

        if (ballCount > 0) {
            sb.append(String.format("%d%s ", ballCount, ballText));
        }

        if (strikeCount > 0) {
            sb.append(String.format("%d%s ", strikeCount, strikeText));
        }

        if (ballCount + strikeCount == 0) {
            sb.append(outText);
        }

        if (strikeCount == 3) {
            sb.append("\n").append(winText);
        }
        System.out.println(sb);
    }
}
