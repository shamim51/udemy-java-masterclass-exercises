package solutions.interfaces;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.move();
        bird.fly();
        bird.jump();

        FlightEnable flightEnableBird = bird;
        //flightEnableBird.jump();
        //flightEnableBird.move(); //not allowed
        //flightEnableBird.jump();

        Animal animal = bird;
        animal.move();
        //animal.fly(); //not allowed
        //animal.jump();


    }
}
