public class Main {

    public static void main(String[] args){

        DieselEngine dieselEngine = new DieselEngine("B47D20", 200, 2,5, "Дизельный двигатель");
        Car<DieselEngine> bmw = new Car<>("BMW", dieselEngine);
        bmw.getCarInformation();

        GasolineEngine gasolineEngine = new GasolineEngine("GX390T2-VSP-OH", 8610, 6.1, 3.5, "Бензиновый двигатель");
        Car<GasolineEngine> honda = new Car<>("Honda", gasolineEngine);
        honda.getCarInformation();

        ElectricEngine electricEngine = new ElectricEngine("Sport Turismo Electro AT", 300, 30, "Электрический двигатель");
        Car<ElectricEngine> porsche = new Car<>("Tesla", electricEngine);
        porsche.getCarInformation();
    }
}