package Car;

import Strategy.IEngine;
import Strategy.ITurboCharge;

public class Car {
    public String name;
    public IEngine engine;
    public ITurboCharge turbocharger;

    public Car(String name, IEngine engineBehavior, ITurboCharge turbochargerBehavior) {
        this.name = name;
        this.engine = engineBehavior;
        this.turbocharger = turbochargerBehavior;
    }

    public void start() {
        System.out.println(name + " started.");
    }

    public void stop() {
        System.out.println(name + " stopped.");
    }

    public void accelerate() {
        engine.accelerate();
        turbocharger.applyTurbo();
        System.out.println(name + " is accelerating.");
    }

    public void carInfo() {
        System.out.println("Car: " + name);
    }
}
