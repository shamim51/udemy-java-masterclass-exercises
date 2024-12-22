package section_11.exercise.test_polymorphism;

public class Cat extends Animal{
    @Override
    public void doSound() {
        System.out.println("cat is making sound");
    }

    public void run(){
        System.out.println("cat is running");
    }
}
