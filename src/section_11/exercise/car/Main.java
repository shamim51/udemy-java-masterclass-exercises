package section_11.exercise.car;

public class Main {
    public static void main(String[] args) {
        Car ferarri = new GasPoweredCar("Blue Ferrari",
                10.00, 3);
        runRace(ferarri);
    }
    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
