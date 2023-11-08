package racingcar;

import racingcar.controller.RacingController;

public class Application {
    static RacingController racingController = new RacingController();
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        racingController.racingSet();
        racingController.racingStart();
        racingController.racingEnd();
    }
}
