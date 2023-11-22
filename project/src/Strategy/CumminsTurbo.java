package Strategy;

import Strategy.ITurboCharge;

public class CumminsTurbo implements ITurboCharge {
    @Override
    public void applyTurbo() {
        System.out.println("Cummins turbocharger applied.");
    }
}
