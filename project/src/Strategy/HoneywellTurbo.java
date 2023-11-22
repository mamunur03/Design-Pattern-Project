package Strategy;

import Strategy.ITurboCharge;

public class HoneywellTurbo implements ITurboCharge {
    @Override
    public void applyTurbo() {
        System.out.println("Honeywell turbocharger applied.");
    }
}
