package Car;

import Car.Coupe;
import Strategy.IEngine;
import Strategy.ITurboCharge;

public class ToyotaGR86 extends Coupe {
    public ToyotaGR86(IEngine engineBehavior, ITurboCharge turbochargerBehavior) {
        super("ToyotaGR86", engineBehavior, turbochargerBehavior);
    }
}
