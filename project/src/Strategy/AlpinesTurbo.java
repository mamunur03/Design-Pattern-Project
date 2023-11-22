package Strategy;

import Strategy.ITurboCharge;

public class AlpinesTurbo implements ITurboCharge {
    @Override
    public void applyTurbo() {
        System.out.println("Alpine turbocharger applied.");
    }
}
