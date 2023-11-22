package Factory;

import Strategy.*;
import Car.*;

 public class CoupeCarFactory implements CarFactory {
    @Override
    public Car createCar(String carName, IEngine engine, ITurboCharge turbocharger) {
        {
            if ("Car.ToyotaGR86".equals(carName)) {
                return new ToyotaGR86(engine, turbocharger);
            } else if ("Car.SubaruBRZ".equals(carName)) {
                return new SubaruBRZ(engine, turbocharger);
            } else {
                throw new IllegalArgumentException("Invalid car type: " + carName);
            }
        }
    }

}
