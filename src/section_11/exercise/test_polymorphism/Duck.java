package section_11.exercise.test_polymorphism;

public class Duck extends Animal{
    @Override
    public void doSound() {
        super.doSound();
        System.out.println("Duck is making sound");
    }
}
