package src.tests.unit;
import src.game.Dice;
public class DiceSpy implements Dice {
    private boolean isFirstInputCall = true;
    @Override
    public int roll() {
        if (isFirstInputCall) {
            isFirstInputCall = false;
            return 6;
        }
        else {
            return 4;
        }
    }
}
