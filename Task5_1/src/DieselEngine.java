public class DieselEngine extends Engine {

    private double volume;

    DieselEngine(String model, double power, double consumption, double volume, String description){
        super(model, power, consumption, description);
        this.volume = volume;
    }

    @Override
    public void getEngineInformation() {
        System.out.println("Тип двигателя: " + description);
        System.out.println("Модель двигателя: " + model);
        System.out.println("Мощность двигателя: " + power + " киловатт");
        System.out.println("Объем двигателя: " + volume);
        System.out.println("Расход двигателя: " + consumption + " л/100 км.");
        System.out.println();
    }

    double getVolume() {
        return volume;
    }
}
