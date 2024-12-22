package section_11.exercise.test_polymorphism;

public class Dog extends Animal{
    @Override
    public void doSound() {
        System.out.println("dog is making sound");
    }
}
