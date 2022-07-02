package numberBaseball;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOFactory {

    private final BufferedReader br;
    private final BufferedWriter bw;

    public IOFactory() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
        this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
    }

    public void showInputMessage() throws IOException {
        bw.write("숫자를 입력해 주세요 : ");
        bw.flush();
    }

    public String getInput() throws IOException {
        return br.readLine();
    }

    public void showSuccessMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public String print(int ball, int strike) {
        if (ball == 0 && strike == 0) {
            return "낫싱";
        }
        return (ballPrint(ball) + " " + strikePrint(strike)).trim();
    }

    private String ballPrint(int ball) {
        if (ball == 0) {
            return "";
        }
        return ball + "볼";
    }

    private String strikePrint(int strike) {
        if (strike == 0) {
            return "";
        }
        return strike + "스트라이크";
    }
}
