package racingcar.controller;

import racingcar.service.RacingService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class RacingController {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();
    RacingService racingService = new RacingService();

    public void racingSet() {
        inputView.inputRacingCarName();
        String readRacingCarName = readLine();
        racingService.setRacing(readRacingCarName);

    }
    public void racingStart() {
        inputView.inputNumberOfRacing();
        int inputNumberOfRacing = Integer.parseInt(readLine());
        outputView.printResultGuideComment();
        for (int i=0;i<inputNumberOfRacing;i++) {
            racingService.racing();
            outputView.printExecutionResult(RacingService.getPlayers());
        }

    }
    public void racingEnd() {
        List<String> winner = racingService.selectWinner();
        StringBuilder winners = new StringBuilder();
        for (int i=0;i< winner.size();i++) {
            if (i == winner.size()-1){
                winners.append(winner.get(i));
                break;
            }
            winners.append(winner.get(i)).append(", ");
        }
        outputView.printWinner(winners.toString());
    }
}
