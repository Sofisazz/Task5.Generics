public class Car<T extends Engine> {

    private String brand;
    T typeEngine;

    Car(String brand, T typeEngine){
      this.brand = brand;
      this.typeEngine = typeEngine;
    }

    public void getCarInformation(){
      System.out.println("Бренд машины: " + brand);
      typeEngine.getEngineInformation();
    }

    String getBrand() {
        return brand;
    }
}
