package numberBaseball;

public class Game {

    private final String numbers;
    private int strike;
    private int ball;
    private boolean isEnd;
    private final IOFactory ioFactory;

    public Game(String number,IOFactory ioFactory) {
        this.numbers = number;
        this.strike = 0;
        this.ball = 0;
        this.isEnd = false;
        this.ioFactory = ioFactory;
    }

    public String check(String inputNumber) {
        ball = 0;
        strike = 0;
        for (int i = 0; i < numbers.length(); i++) {
            String number = String.valueOf(inputNumber.charAt(i));
            existedCheck(inputNumber, number);
        }
        if (strike == 3) {
            isEnd = true;
        }
        return ioFactory.print(ball, strike);
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


    public boolean isEnd() {
        return isEnd;
    }

}
