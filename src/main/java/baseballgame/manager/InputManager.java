package baseballgame.manager;

import java.util.Scanner;

public class InputManager {

    private static final Scanner SC = new Scanner(System.in);

    public static String getInput() {
        System.out.print("숫자를 입력하세요 : ");

        int input = SC.nextInt();
        return String.valueOf(input);
    }

    public static boolean getInputResult() {
        boolean reGame = false;
        int input = SC.nextInt();

        if (input == 1) {
            reGame = true;
        }

        return reGame;
    }
}
