package solutions.interfaces;

public class Bird extends Animal implements FlightEnable{


    public void jump(){
        System.out.println("jumping");
    }
    @Override
    public void move() {
        System.out.println("moving");
    }

    @Override
    public  void  fly(){
        System.out.println("flying");
    }
}
