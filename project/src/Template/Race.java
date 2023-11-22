package Template;

import Car.Car;
import Decorator.INos;
import Decorator.NosDecorator;
import Singleton.Player;
import Track.Track;

import java.text.SimpleDateFormat;
import java.util.Random;

public class Race {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    private static final Random random = new Random();

    public void race(Car car, Track track, INos nos) {
        Player player = Player.getInstance();
        System.out.println("User name: " + player.getPlayerName());
        car.carInfo();
        track.trackInfo();
        startCar(car);
        startLine(track);
        accelerateCar(car);
        Car decoratedCar = pitStop(car, nos);
        finishLine(track);
        stopCar(decoratedCar);
        lapTime();
    }

    protected void startCar(Car car) {
        car.start();
    }

    protected void startLine(Track track) {
        System.out.println("At the start line of " + track.getClass().getSimpleName());
    }

    protected void accelerateCar(Car car) {
        car.accelerate();
    }

    private Car pitStop(Car car, INos nos) {
        System.out.println("Entering pit stop");
        if (nos != null) {
            nos.applyNOS();
            return new NosDecorator(car, nos);
        }
        return car;
    }

    protected void finishLine(Track track) {
        System.out.println("Crossing the finish line of " + track.getClass().getSimpleName());
    }

    protected void stopCar(Car car) {
        car.stop();
    }

    private void lapTime() {
        int seconds = random.nextInt(900) + 300;
        System.out.println("Lap time: " + sdf.format(new java.util.Date(seconds * 1000L)));
    }
}
