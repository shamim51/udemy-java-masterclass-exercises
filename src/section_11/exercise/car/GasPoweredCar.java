package section_11.exercise.car;

public class GasPoweredCar extends Car{
    private double avgKmPerLiter;
    private int cylinders;
    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("All "+cylinders+" cylinders  are fired up");
    }

    @Override
    protected void runEngine() {
        System.out.println("Gas usage exceeds the averge "+ avgKmPerLiter);
    }
}
