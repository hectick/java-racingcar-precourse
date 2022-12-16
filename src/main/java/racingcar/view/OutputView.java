package racingcar.view;

import racingcar.constant.Message;
import racingcar.model.Car;

import java.util.List;

public class OutputView {

    private static final String REMOVE_REGEX = ",\\s$";

    public static void printGetCarNamesMessage(){
        System.out.println();
        System.out.println(Message.GET_CAR_NAMES_MESSAGE);
    }

    public static void printGetTryCountMessage(){
        System.out.println();
        System.out.println(Message.GET_TRY_COUNT_MESSAGE);
    }

    public static void printRoundResult(List<Car> cars){
        System.out.println();
        for(Car car : cars){
            String output = car.getName() + " : ";
            for(int i = 0; i < car.getPosition(); i++){
                output += "-";
            }
            System.out.println(output);
        }
    }

    public static void printWinner(List<String> carNames){
        String output = "최종우승자 : ";
        for(String carName : carNames){
            output += carName;
            output += ", ";
        }
        output = output.replaceAll(REMOVE_REGEX, "");
        System.out.println(output);
    }
}
