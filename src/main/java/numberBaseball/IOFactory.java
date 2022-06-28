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
}
