package section_7.carpet_cost_calculator_34;

public class Carpet {
    // write code here
    private double cost;
    public Carpet( double cost) {
        this.cost = cost < 0 ? 0 : cost;
    }
    public double getCost() {
        return cost;
    }
}