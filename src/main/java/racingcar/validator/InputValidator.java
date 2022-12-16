package racingcar.validator;

import racingcar.constant.Message;

import java.util.List;

public class InputValidator {

    public static void validateCarNamesLength(String[] carNames){
        for(String carName : carNames){
            if(carName.length() > 5){
                throw new IllegalArgumentException(Message.INVALID_CAR_NAME_INPUT);
            }
        }
    }
}
