public class ElectricEngine extends Engine {

    ElectricEngine(String model, double power, double consumption, String description){
        super(model, power, consumption, description);
    }

    @Override
    public void getEngineInformation() {
        System.out.println("Тип двигателя: " + description);
        System.out.println("Модель двигателя: " + model);
        System.out.println("Мощность двигателя: " + power + " киловатт");
        System.out.println("Расход двигателя: " + consumption + " кВт*ч/100 км.");
        System.out.println();
    }
}
