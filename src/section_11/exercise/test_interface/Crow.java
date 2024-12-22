package section_11.exercise.test_interface;

public class Crow extends Bird implements Flyable{
    public void steal(){
        System.out.println("crow is stealing the key");
    }
}
