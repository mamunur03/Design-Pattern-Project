package Car;

import Car.Coupe;
import Strategy.IEngine;
import Strategy.ITurboCharge;

public class SubaruBRZ extends Coupe {
    public SubaruBRZ(IEngine engineBehavior, ITurboCharge turbochargerBehavior) {
        super("Subaru BRZ", engineBehavior, turbochargerBehavior);
    }
}
