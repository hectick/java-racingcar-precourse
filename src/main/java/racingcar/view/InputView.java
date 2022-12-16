package racingcar.view;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String REGEX = "\\s*,\\s*";

    public static String[] readCarNames(){
        String input = Console.readLine();
        String[] carNames = parse(input);
        return carNames;
    }

    private static String[] parse(String input){
        return input.split(",");
    }
}
