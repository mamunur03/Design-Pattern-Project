package Car;

import Car.Car;
import Strategy.IEngine;
import Strategy.ITurboCharge;

public class Coupe extends Car {

    public Coupe(String name, IEngine engineBehavior, ITurboCharge turbochargerBehavior) {
        super(name, engineBehavior, turbochargerBehavior);
    }

    public void coupeFunction()
    {
        System.out.println("Coupe Category");
    }
}
