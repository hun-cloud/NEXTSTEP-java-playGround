package baseballgame.manager;

import java.util.Scanner;

public class InputManager {

    private static final Scanner SC = new Scanner(System.in);

    public static String getInput() {
        int input = SC.nextInt();
        return String.valueOf(input);
    }

    public static boolean getInputResult(boolean result) {
        boolean reGame = true;

        if (!result) {
            int input = SC.nextInt();
            reGame = ResultManager.reGameCheck(input);
        }
        return reGame;
    }
}
