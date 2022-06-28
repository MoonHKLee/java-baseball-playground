package numberBaseball;

public class Game {

    private final String numbers;
    private int strike;
    private int ball;
    private boolean isEnd;

    public Game(String number) {
        this.numbers = number;
        this.strike = 0;
        this.ball = 0;
        this.isEnd = false;
    }

    public String check(String inputNumber) {
        for (int i = 0; i < numbers.length(); i++) {
            String number = String.valueOf(inputNumber.charAt(i));
            existedCheck(inputNumber, number);
        }
        if (strike == 3) {
            isEnd = true;
        }
        return print(ball, strike);
    }

    private void existedCheck(String inputNumber, String number) {
        if (numbers.contains(number)) {
            indexCheck(inputNumber, number);
        }
    }

    private void indexCheck(String inputNumber, String number) {
        if (isStrike(inputNumber, number)) {
            strike++;
            return;
        }
        ball++;
    }

    private boolean isStrike(String inputNumber, String number) {
        return numbers.indexOf(number) == inputNumber.indexOf(number);
    }

    private String print(int ball, int strike) {
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

    public boolean isEnd() {
        return isEnd;
    }

}
