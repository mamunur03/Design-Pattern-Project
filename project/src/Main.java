import Car.*;
import Decorator.*;
import Factory.*;
import Template.*;
import Singleton.*;
import Strategy.*;
import Template.Sprint;
import Track.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get player name
        System.out.println("Enter player name: ");
        String playerName = scanner.nextLine();
        Player player = Player.getInstance();
        player.setPlayerName(playerName);

        // Choose race type
        Race race = createRace();

        // Choose Engine
        IEngine engine = chooseEngine();

        // Choose turbocharger
        ITurboCharge turbo = chooseTurbo();

        // Choose car type
        Car car = chooseCar(engine, turbo);

        // Choose track
        Track track = chooseTrack();



        // Choose whether to decorate with NOS
        System.out.println("Do you want to decorate the car with NOS? (yes/no): ");
        String nosChoice = scanner.next();
        boolean decorateWithNos = "yes".equalsIgnoreCase(nosChoice);
        INos nos;
        if(decorateWithNos){
            // Choose NOS type
            nos = chooseNOSType();
        }
        else{
            nos=null;
        }
        // Template.Race
        race.race(car, track,nos);
    }

    private static Race createRace() {
        System.out.println("Choose race type (1 for SPRINT, 2 for CIRCUIT): ");
        int raceType = new Scanner(System.in).nextInt();
        if (raceType == 1) {
            return new Sprint();
        } else if (raceType == 2) {
            return new Circuit();
        } else {
            throw new IllegalArgumentException("Invalid race type: " + raceType);
        }
    }

    private static IEngine chooseEngine() {
        System.out.println("Choose engine type (1 for V6, 2 for V8, 3 for V12): ");
        int engineType = new Scanner(System.in).nextInt();
        if (engineType == 1) {
            return new V6Engine();
        } else if (engineType == 2) {
            return new V8Engine();
        } else if (engineType == 3) {
            return new V12Engine();
        } else {
            throw new IllegalArgumentException("Invalid engine type: " + engineType);
        }
    }

    private static ITurboCharge chooseTurbo() {
        System.out.println("Choose turbocharger type (1 for Alpines, 2 for Cummins, 3 for Honeywell): ");
        int turboType = new Scanner(System.in).nextInt();
        if (turboType == 1) {
            return new AlpinesTurbo();
        } else if (turboType == 2) {
            return new CumminsTurbo();
        } else if (turboType == 3) {
            return new HoneywellTurbo();
        } else {
            throw new IllegalArgumentException("Invalid turbocharger type: " + turboType);
        }
    }

    private static Car chooseCar(IEngine engine, ITurboCharge turbo) {
        System.out.println("Choose car type (1 for COUPE, 2 for ROADSTER): ");
        int carType = new Scanner(System.in).nextInt();
        CarFactory carFactory;
        String carName;
        if (carType == 1) {
            carFactory = new CoupeCarFactory();
            System.out.println("Choose car (1 for Car.ToyotaGR86, 2 for Car.SubaruBRZ): ");
            int carChoice = new Scanner(System.in).nextInt();
            carName = (carChoice == 1) ? "Car.ToyotaGR86" : "Car.SubaruBRZ";
        } else if (carType == 2) {
            carFactory = new RoadsterCarFactory();
            System.out.println("Choose car (1 for Car.PorscheBoxster, 2 for Car.Ferrari812): ");
            int carChoice = new Scanner(System.in).nextInt();
            carName = (carChoice == 1) ? "Car.PorscheBoxster" : "Car.Ferrari812";
        } else {
            throw new IllegalArgumentException("Invalid car type: " + carType);
        }
        return carFactory.createCar(carName, engine, turbo);
    }

    private static Track chooseTrack() {
        System.out.println("Choose track (1 for Track.BlueMoonBaySpeedway, 2 for Track.BBRaceway, 3 for Track.CircuitDeSpaFrancophones): ");
        int trackChoice = new Scanner(System.in).nextInt();
        String trackType;
        if (trackChoice == 1) {
            trackType = "Track.BlueMoonBaySpeedway";
        } else if (trackChoice == 2) {
            trackType = "Track.BBRaceway";
        } else if (trackChoice == 3) {
            trackType = "Track.CircuitDeSpaFrancophones";
        } else {
            throw new IllegalArgumentException("Invalid track choice: " + trackChoice);
        }

        TrackFactory trackFactory = new TrackFactory();
        return trackFactory.createTrack(trackType);
    }

    private static INos chooseNOSType() {
        System.out.println("Choose NOS type (1 for RESONAC, 2 for SEMA): ");
        int nosType = new Scanner(System.in).nextInt();
        String nosTypeName = (nosType == 1) ? "RESONAC" : "SEMA";
        return createNOS(nosTypeName);
    }

    private static INos createNOS(String nosType) {
        if ("Resonac".equalsIgnoreCase(nosType)) {
            return new ResonacNos();
        } else if ("Sema".equalsIgnoreCase(nosType)) {
            return new SemaNos();
        } else {
            throw new IllegalArgumentException("Invalid NOS type: " + nosType);
        }
    }
}
