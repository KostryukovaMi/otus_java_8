package src.tests.unit;
import src.game.Game;
import src.assertions.Assertions;
import src.game.Player;
import src.tests.unit.DiceSpyDraw;
import src.tests.unit.GameWinnerPrinterSpy;
import src.tests.unit.DiceSpy;

import java.util.List;
import java.util.ArrayList;

public class GameTest {

    public void testSameResult() {
        String scenario = "Тест проверки на ничью";
        try {
            List<String> expectedFlow = List.of("Победитель: ничья");
            List<String> actualFlow = new ArrayList<>();
            DiceSpyDraw dice = new DiceSpyDraw();
            GameWinnerPrinterSpy gameWinnerPrinter = new GameWinnerPrinterSpy(actualFlow);
            Game game = new Game(dice, gameWinnerPrinter);
            game.playGame(new Player("Вася"), new Player("Игорь"));
            //Assertions.assertEquals(expectedFlow,actualFlow);
            Assertions.assertEquals(expectedFlow.size(), actualFlow.size());
            for (int i = 0; i < expectedFlow.size(); i++) {
                Assertions.assertEquals(expectedFlow.get(i), actualFlow.get(i));
            }
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testResult() {
        String scenario = "Тест проверки победителя";
        try {
            List<String> expectedFlow = List.of("Победитель: Вася");
            List<String> actualFlow = new ArrayList<>();
            DiceSpy dice = new DiceSpy();
            GameWinnerPrinterSpy gameWinnerPrinter = new GameWinnerPrinterSpy(actualFlow);
            Game game = new Game(dice, gameWinnerPrinter);
            game.playGame(new Player("Вася"), new Player("Игорь"));
            //Assertions.assertEquals(expectedFlow,actualFlow);
            Assertions.assertEquals(expectedFlow.size(), actualFlow.size());
            for (int i = 0; i < expectedFlow.size(); i++) {
                Assertions.assertEquals(expectedFlow.get(i), actualFlow.get(i));
            }
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
