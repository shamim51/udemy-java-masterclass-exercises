package section_11.exercise.test_interface;

public class Bird extends Animal implements Runable, Eatable{

    public void run(){
        System.out.println("running");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }
}
