package racingcar.validator;

import racingcar.constant.Message;

import java.util.List;

public class InputValidator {
    private static final String NUMERIC_REGEX = "^[0-9]+$";

    public static void validateCarNamesLength(String[] carNames){
        for(String carName : carNames){
            if(carName.length() > 5){
                throw new IllegalArgumentException(Message.INVALID_CAR_NAME_INPUT);
            }
        }
    }

    public static void validateTryCount(String tryCount){
        if(!tryCount.matches(NUMERIC_REGEX)){
            throw new IllegalArgumentException(Message.INVALID_TRY_COUNT_INPUT);
        }
    }

}
