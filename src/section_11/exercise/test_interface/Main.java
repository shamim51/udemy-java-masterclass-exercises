package section_11.exercise.test_interface;

public class Main {


    public static void main(String[] args) {
        Runable runableAnimal = new Bird();
        runableAnimal.fly();
        //runableAnimal.eat();
        runableAnimal.toString();
        //runableAnimal.printName();
        Flyable crow = new Crow();
    }
}
