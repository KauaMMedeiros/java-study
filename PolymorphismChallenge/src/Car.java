public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Starting engine...");
    }

    public void drive(){
        System.out.println("Preparing to start driving.");
        runEngine();
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
    }

    protected void runEngine(){
        System.out.println("Running engine...");
    }
}

class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.1f \n", avgKmPerLitre);
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> all %d cylinders are fired up, ready!\n", cylinders);
    }
}

class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    protected void runEngine() {
        System.out.printf("Electric -> usage under the average: %.2f \n", avgKmPerCharge);
    }

    @Override
    public void startEngine() {
        System.out.printf("Electric -> switch %d kWh battery on, ready!\n", batterySize);
    }
}

class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize, cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public HybridCar(String description) {
        super(description);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage exceeds the average: %.1f \n", avgKmPerLitre);
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> all %d cylinders are fired up, ready!\n", cylinders);
        System.out.printf("Hybrid -> switch %d kWh battery on, ready\n", batterySize);
    }

}