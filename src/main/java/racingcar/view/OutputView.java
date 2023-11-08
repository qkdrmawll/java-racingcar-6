package racingcar.view;

import racingcar.model.Player;

import java.util.List;

public class OutputView {

    public void printResultGuideComment() {
        System.out.println("실행 결과");
    }
    public void printExecutionResult(List<Player> players) {
        for (Player player : players) {
            System.out.println(player.toString());
        }
        System.out.println();
    }
    public void printWinner(String winner) {
        System.out.println("최종 우승자 : "+winner);
    }
}
