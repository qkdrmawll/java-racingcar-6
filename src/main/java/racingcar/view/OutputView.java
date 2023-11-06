package racingcar.view;

public class OutputView {

    public void printResultGuideComment() {
        System.out.println("실행 결과");
    }
    public void printExecutionResult(String result) {
        System.out.println(result);
    }
    public void printWinner(String winner) {
        System.out.println("최종 우승자 : "+winner);
    }
}
