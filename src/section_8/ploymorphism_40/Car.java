package section_8.ploymorphism_40;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = wheels;
    }

    public String startEngine(){
        String className = this.getClass().getSimpleName();
        return className + " -> startEngine()";
    }

    public String accelerate(){
        String className = this.getClass().getSimpleName();
        return className + " -> accelerate()";
    }

    public String brake(){
        String className = this.getClass().getSimpleName();
        return className + " -> brake()";
    }


    public int getCylinders(){
        return this.cylinders;
    }

    public String getName(){
        return this.name;
    }


}
