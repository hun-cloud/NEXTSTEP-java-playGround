package baseballgame;

import baseballgame.manager.BaseballGameManager;

public class BaseballMain {

    public static void main(String[] args) {
        BaseballGameManager baseballGameManager = new BaseballGameManager();

        baseballGameManager.startGame();
    }
}
