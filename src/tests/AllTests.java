package src.tests;
import src.tests.unit.DiceTest;
import src.tests.unit.GameTest;
public class AllTests {
    public static void main(String[] args) {
        new DiceTest().testDiceCorrectResult();
        new DiceTest().testDicePositiveResult();
        new GameTest().testSameResult();
        new GameTest().testResult();
    }
}
