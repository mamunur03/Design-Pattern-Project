package Car;

import Strategy.IEngine;
import Strategy.ITurboCharge;

public class Ferrari812 extends Roadster {
    public Ferrari812(IEngine engineBehavior, ITurboCharge turbochargerBehavior) {
        super("Ferrari812", engineBehavior, turbochargerBehavior);
    }
}
