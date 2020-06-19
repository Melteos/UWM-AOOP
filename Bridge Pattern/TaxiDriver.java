public class TaxiDriver implements Driver{

    protected Vehicle vehicle;

    public TaxiDriver() {};

    public TaxiDriver(Vehicle vehicle){
        this.vehicle=vehicle;
    }

    public void startVehicle(){
        System.out.println("vehicle started.");
        if(!vehicle.hasStarted())
            vehicle.startEngine();
    }

    public void drive(double km, double speed){
        System.out.println("driving the vehicle.");
        vehicle.setSpeed(speed);
        vehicle.go(km);
    }


}
