package racingcar.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import racingcar.model.Player;

import java.util.List;

import static racingcar.service.RacingService.players;


class RacingServiceTest {
    RacingService racingService = new RacingService();

    @Test
    void setRacing_플레이어_생성() {
        //when
        racingService.setRacing("pobi,woni,jun");

        //then
        List<Player> players = RacingService.getPlayers();
        Player getPlayer = players.get(1);
        Assertions.assertThat(getPlayer.getName()).isEqualTo("woni");
    }

    @Test
    void play_경주() {
        //given
        racingService.setRacing("woni");
        //when
        for (int i=0;i<3;i++) {
            racingService.racing();
            for (Player player : players) {
                System.out.println(player.toString());
            }
            System.out.println();
        }
    }
    @Test
    void selectWinner_우승자_가리기() {
        racingService.setRacing("pobi,woni,jun");
        players.get(1).setRacing("-----");
        List<String> winner = racingService.selectWinner();
        Assertions.assertThat(winner.get(0)).isEqualTo(players.get(1).getName());
    }
    @Test
    void selectWinner_공동우승() {
        racingService.setRacing("pobi,woni,jun");
        for (Player player : players) {
            player.setRacing("---");
        }
        List<String> winner = racingService.selectWinner();
        Assertions.assertThat(winner.size()).isEqualTo(players.size());
    }
}