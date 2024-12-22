package section_11.exercise.car;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("engine started");
    }
    protected void runEngine(){
        System.out.println("engine running");
    }
    public void drive(){
        System.out.println("Car type is "+getClass().getSimpleName());
        runEngine();
    }
}
