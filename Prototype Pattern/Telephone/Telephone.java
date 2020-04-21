public abstract class Telephone {

    private String brand;
    private int model;
    private boolean nfc;

    public abstract Telephone copy();

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setNfc(boolean nfc) {
        this.nfc = nfc;
    }

    public int getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public boolean getNfc() {
        return nfc;
    }

}
