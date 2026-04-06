public class Main {

    static void main(String[] args){

        Car car = new Car("1992 Honda Civic Hatch");
        runRace(car);

        Car civic = new GasPoweredCar("1992 Honda Civic Hatch", 14.9, 4);
        runRace(civic);

        Car tiggo = new HybridCar("2022 Cherry Tiggo 5x pro", 5.3, 1, 4);
        runRace(tiggo);

        Car tesla = new ElectricCar("2020 Tesla Model 3 Perfomance", 600, 82);
        runRace(tesla);
    }

    public static void runRace(Car car){

        car.startEngine();
        car.drive();
    }
}
