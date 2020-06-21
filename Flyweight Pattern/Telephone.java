public abstract class Telephone {
    private int model;
    private String brand;
    private boolean nfc;
    private int number;

    public Telephone(String brand, int model, boolean nfc) {
        this.brand=brand;
        this.model=model;
        this.nfc=nfc;
    }

    public void getPhoneInfo() {
        System.out.println(this.brand + " Model: " + this.model + " Number: " + this.number);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
