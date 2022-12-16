package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.RandomNumberGenerator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameController {
    private List<Car> cars;
    private int tryCount;
    
    private RandomNumberGenerator randomNumberGenerator;

    public GameController(){
        cars = new ArrayList<>();
        tryCount = 0;
        randomNumberGenerator = new RandomNumberGenerator();
    }

    public void play(){
        setCars();
        setTryCount();
        while(tryCount > 0){
            playRound();
            OutputView.printRoundResult(cars);
            tryCount--;
        }
        OutputView.printWinner(checkWinner());
    }

    private void setCars(){
        OutputView.printGetCarNamesMessage();
        String[] carNames = InputView.readCarNames();
        for(int i = 0; i < carNames.length; i++){
            Car car = new Car(carNames[i]);
            cars.add(car);
        }
    }

    private void setTryCount(){
        OutputView.printGetTryCountMessage();
        tryCount = InputView.readTryCount();
    }

    private void playRound(){
        for(int i = 0; i < cars.size(); i++){
            if(randomNumberGenerator.getRandomNumber() >= 4){
                cars.get(i).go();
            }
        }
    }

    private List<String> checkWinner(){
        List<String> winners = new ArrayList<>();
        int max = findBiggestPosition();
        for(Car car : cars){
            if(car.getPosition() == max){
                winners.add(car.getName());
            }
        }
        return winners;
    }

    private int findBiggestPosition(){
        List<Integer> positions = new ArrayList<Integer>();
        for(Car car : cars){
            positions.add(car.getPosition());
        }
        return Collections.max(positions);
    }

}
