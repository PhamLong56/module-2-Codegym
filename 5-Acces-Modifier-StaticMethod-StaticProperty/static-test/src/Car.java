public class Car {
    private String make;
    private String engine;
    public static int numberOfCars;
    public Car(String make, String engine) {
        this.make = make;
        this.engine = engine;
        numberOfCars++;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public static void setNumberOfCars(int numberOfCars) {
        Car.numberOfCars = numberOfCars;
    }
}
