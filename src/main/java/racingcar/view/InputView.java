package racingcar.view;
import camp.nextstep.edu.missionutils.Console;
import racingcar.validator.InputValidator;

public class InputView {
    public static final String SPLIT_REGEX = "\\s*,\\s*";

    public static String[] readCarNames(){
        String input = Console.readLine();
        String[] carNames = parse(input);
        InputValidator.validateCarNamesLength(carNames);
        return carNames;
    }

    public static int readTryCount(){
        String input = Console.readLine();
        return Integer.parseInt(input);
    }

    private static String[] parse(String input){
        return input.split(SPLIT_REGEX);
    }


}
