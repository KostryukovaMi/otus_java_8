package src.tests.unit;
import src.game.Dice;
import src.game.DiceImpl;
import src.assertions.Assertions;
public class DiceTest {
    private final DiceImpl dice = new DiceImpl();
    public void testDiceCorrectResult() {
        String scenario = "Тест проверки диапазона случайного числа";
        try {
            int actual = dice.roll();
            Assertions.assertEquals(1, 6, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testDicePositiveResult() {
        String scenario = "Тест проверки на положительное случайное число";
        try {
            int actual = dice.roll();
            Assertions.assertEquals(actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
