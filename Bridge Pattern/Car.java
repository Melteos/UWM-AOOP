public class Car implements Vehicle {

    private boolean on = false;
    private double speed = 0;
    private double km = 0;

    @java.lang.Override
    public boolean hasStarted() {
        return this.on;
    }

    @java.lang.Override
    public void startEngine() {
        this.on=true;
    }

    @java.lang.Override
    public void go(double km) {
        this.km += km;
    }

    @java.lang.Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @java.lang.Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm a Car.");
        System.out.println("| Engines are " + (on ? "running" : "disabled"));
        System.out.println("| Current speed is " + speed );
        System.out.println("| Current km is " + km);
        System.out.println("------------------------------------\n");
    }

}
