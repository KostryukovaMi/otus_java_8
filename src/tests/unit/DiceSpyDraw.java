package src.tests.unit;
import src.game.Dice;

public class DiceSpyDraw implements Dice {
    @Override
    public int roll() {
        return 6;
    }
}
