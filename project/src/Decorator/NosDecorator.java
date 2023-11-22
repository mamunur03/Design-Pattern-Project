package Decorator;

import Car.Car;
import Decorator.INos;

public class NosDecorator extends Car {
    private INos nos;

    public NosDecorator(Car car, INos nos) {
        super(car.name, car.engine, car.turbocharger);
        this.nos = nos;
    }

    @Override
    public void accelerate() {
        super.accelerate();
        applyNOS();
    }

    private void applyNOS() {
        nos.applyNOS();
    }

    @Override
    public void carInfo() {
        super.carInfo();
        System.out.println("Enhanced with NOS");
    }
}
