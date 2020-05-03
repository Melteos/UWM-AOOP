public class Telephone {

    private String brand;
    private int model;
    private boolean nfc;

    private static Telephone single_instance = null;

    private Telephone(){
        this.brand = "Default-brand";
        this.model = 0000;
        this.nfc = false;
    }

    public static Telephone getInstance()
    {
        if (single_instance == null)
            single_instance = new Telephone();

        return single_instance;
    }

    public String getBrand() {
        return brand;
    }

    public int getModel() {
        return model;
    }

    public boolean getNfc() {
        return this.nfc;
    }

    public void setNfc(boolean nfc) {
        this.nfc = nfc;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return  ("Brand: "  + this.getBrand() + ", Model: " + this.getModel() + ", Nfc: " + this.getNfc());
    }
}

