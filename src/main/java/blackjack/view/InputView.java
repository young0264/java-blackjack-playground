package blackjack.view;

import blackjack.domain.card.CardDeck;
import blackjack.domain.participant.Dealer;
import blackjack.domain.participant.Player;
import blackjack.domain.participant.Players;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {

    Scanner scanner = new Scanner(System.in);

    public Players readNames() {
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
        String input = scanner.nextLine();
        List<String> names = splitWithComma(input);

        return new Players(names.stream()
                .map(name -> new Player(name))
                .collect(Collectors.toList()));
    }

    private List<String> splitWithComma(String input) {
        return Arrays.asList(input.split(","));
    }

    public void askPlayersMoney(Players players) {
        for (Player player : players) {
            System.out.println(String.format("%s의 배팅 금액은?", player.getName()));
            player.saveMoney(Integer.parseInt(scanner.nextLine()));
        }
    }

    public void askGetCardMore(Player player) {
        System.out.println(String.format("%s는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n",player.getName()));

    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean askPlayersCardMore(CardDeck cardDeck, Players players) {
        for (Player player : players) {
            while (true) {
                System.out.println(String.format("%s는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)", player.getName()));
                String s = scanner.nextLine();
                if (s.equals("y")) {
                    player.addCard(cardDeck.drawCard());
                    System.out.println(OutputView.makeParticipantStatus(player));
                    if (player.isBust()) {
                        return false;
                    }
                } else if (s.equals("n")) {
                    break;
                }
            }
        }
        return true;
    }
}
