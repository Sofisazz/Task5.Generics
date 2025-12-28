public abstract class Engine{

    protected String model;
    protected double power;
    protected double consumption;
    protected String description;

    Engine(String model, double power, double consumption, String description) {
        this.model = model;
        this.power = power;
        this.consumption = consumption;
        this.description = description;
    }

    public void getEngineInformation() {}
}



