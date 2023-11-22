package Factory;

import Car.Car;
import Strategy.IEngine;
import Strategy.ITurboCharge;

public interface CarFactory {
    public Car createCar(String carType, IEngine engine, ITurboCharge turbocharger);

}
