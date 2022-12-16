package racingcar.view;

import racingcar.constant.Message;
import racingcar.model.Car;

import java.util.List;

public class OutputView {

    public static void printGetCarNamesMessage(){
        System.out.println(Message.GET_CAR_NAMES_MESSAGE);
    }

    public static void printGetTryCountMessage(){
        System.out.println(Message.GET_TRY_COUNT_MESSAGE);
    }

    public static void printRoundResult(List<Car> cars){
        for(Car car : cars){
            String output = car.getName() + " : ";
            for(int i = 0; i < car.getPosition(); i++){
                output += "-";
            }
            System.out.println(output);
        }
    }
}
