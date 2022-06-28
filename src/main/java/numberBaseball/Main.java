package numberBaseball;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        IOFactory factory = new IOFactory();
        Game game = new Game(RandomNumberGenerator.generate());
        while(!game.isEnd()) {
            factory.showInputMessage();
            game.check(factory.getInput());
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    }
}
