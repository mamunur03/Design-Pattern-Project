package Car;

import Car.Car;
import Strategy.IEngine;
import Strategy.ITurboCharge;

public class Roadster extends Car {

    public Roadster(String name, IEngine engineBehavior, ITurboCharge turbochargerBehavior) {
        super(name, engineBehavior, turbochargerBehavior);
    }

    public void coupeFunction()
    {
        System.out.println("Roadster Category");
    }
}
