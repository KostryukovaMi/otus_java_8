package src.tests.unit;
import src.game.GameWinnerPrinter;
import src.game.Player;
import java.util.List;
public class GameWinnerPrinterSpy implements GameWinnerPrinter {
    private final List<String> actualFlow;

   public GameWinnerPrinterSpy(List<String> actualFlow) {
       this.actualFlow = actualFlow;
   }

    @Override
    public void printWinner(Player winner)
    {
        String message = "Победитель: " + winner.getName();
        actualFlow.add(message);
    }
}
