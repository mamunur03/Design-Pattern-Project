package Factory;

import Factory.CarFactory;
import Strategy.*;
import Car.*;

public class RoadsterCarFactory implements CarFactory {
    @Override
    public Car createCar(String carName, IEngine engine, ITurboCharge turbocharger) {
        if ("Car.PorscheBoxster".equals(carName)) {
            return new PorscheBoxster(engine, turbocharger);
        } else if ("Car.Ferrari812".equals(carName)) {
            return new Ferrari812(engine, turbocharger);
        } else {
            throw new IllegalArgumentException("Invalid car type: " + carName);
        }
    }
}
