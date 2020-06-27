public class SmartPhone implements Telephone {

    private int model;
    private String brand;
    private boolean nfc;

    public SmartPhone() {
        heavyInitialConfiguration();
    }

    @java.lang.Override
    public void call() {
        System.out.println("calling...");
    }

    public void heavyInitialConfiguration(){
        System.out.println("Loading initial config...");
        this.brand="LG";
        this.model=3;
        this.nfc=true;
    }

    public String getBrand() {
        return brand;
    }

    public boolean getNfc() {
        return nfc;
    }

    public int getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setNfc(boolean nfc) {
        this.nfc = nfc;
    }
}
