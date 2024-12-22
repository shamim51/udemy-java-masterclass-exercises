package section_11.exercise.test_interface_2;

public class B extends A implements Testable{
    @Override
    public void test() {
        System.out.println("testing ->"+ this.getClass().getSimpleName());
    }

    public void methodOfB(){

        System.out.println("B");
    }

}
