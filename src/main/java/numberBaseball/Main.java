package numberBaseball;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    static final int START = 1;
    static final int END = 2;
    public static void main(String[] args) throws IOException {
        IOFactory factory = new IOFactory();
        int gameStatus = START;
        while(gameStatus==START) {
            gameStatus = getGameStatus(factory);
        }


    }

    private static int getGameStatus(IOFactory factory) throws IOException {
        int gameStatus;
        Game game = new Game(RandomNumberGenerator.generate(), factory);
        while(!game.isEnd()) {
            factory.showInputMessage();
            game.check(factory.getInput());
        }
        factory.showSuccessMessage();
        gameStatus = Integer.parseInt(factory.getInput());
        return gameStatus;
    }
}
