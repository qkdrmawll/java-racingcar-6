package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.model.Player;
import racingcar.validation.Validation;

import java.util.LinkedList;
import java.util.List;

public class RacingService {
    Validation validation = new Validation();
    static List<Player> players = new LinkedList<>();

    public static List<Player> getPlayers() {
        return players;
    }

    public void setRacing(String names) {
        String[] racingCarNames = names.split(",");
        validation.racingCarNameValidate(racingCarNames);

        for (String name : racingCarNames) {
            generatePlayer(name);
        }
    }

    private void generatePlayer(String name) {
        players.add(new Player(name));
    }

    public void racing() {
        for (Player player: players) {
            if (forward()) {
                String race = player.getRacing() + "-";
                player.setRacing(race);
            }
        }
    }

    private boolean forward() {
        int randomNumber = Randoms.pickNumberInRange(0,9);
        if (randomNumber > 3) {
            return true;
        }
        return false;
    }
    public List<String> selectWinner() {
        List<String> winnerName = new LinkedList<>();
        int max = findRacingMax();
        for (Player player : players) {
            int racing = player.getRacing().length();
            if (racing == max) {
                winnerName.add(player.getName());
            }
        }
        return winnerName;
    }

    private int findRacingMax() {
        int max = 0;
        for (Player player : players) {
            int racing = player.getRacing().length();
            if (racing > max) {
                max = racing;
            }
        }
        return max;
    }

}
