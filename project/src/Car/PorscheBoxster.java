package Car;

import Strategy.IEngine;
import Strategy.ITurboCharge;

public class PorscheBoxster extends Roadster {
    public PorscheBoxster(IEngine engineBehavior, ITurboCharge turbochargerBehavior) {
        super("PorscheBoxster", engineBehavior, turbochargerBehavior);
    }
}
