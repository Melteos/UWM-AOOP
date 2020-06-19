public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        TaxiDriver tD = new TaxiDriver(car);
        tD.startVehicle();
        tD.drive(13.4,65);
        car.printStatus();
    }
}
