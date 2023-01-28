package src.game;
import src.game.GameWinnerPrinter;
import src.game.Player;
public class GameWinnerConsolePrinter implements GameWinnerPrinter {
    @Override
    public void printWinner(Player winner) {
        System.out.printf("Победитель: %s%n", winner.getName());
    }
}
