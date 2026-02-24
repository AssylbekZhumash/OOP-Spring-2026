package pr3.delivery.model;

public abstract class Vehicle {

    public String model;
    protected double baseCost;
    protected Engine engine;

    public Vehicle(String model, double baseCost, Engine engine) {
        this.model = model;
        this.baseCost = baseCost;
        this.engine = engine;
    }

    public double calculateDeliveryCost() {
        return baseCost * 1.1;
    }

    public void getVehicleInfo() {
        System.out.println("Model: " + model);
        System.out.println("Base cost: " + baseCost);
        System.out.println(engine.getEngineInfo());
    }
}
