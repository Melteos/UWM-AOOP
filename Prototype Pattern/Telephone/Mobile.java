public class Mobile extends Telephone{

    public final String type = "Mobile";

    public Mobile(String brand, int model, boolean nfc){
        this.setBrand(brand);
        this.setModel(model);
        this.setNfc(nfc);
    }

    @java.lang.Override
    public Telephone copy() {
        Mobile mobilePhoneClone = new Mobile(this.getBrand(),this.getModel(),this.getNfc());
        return mobilePhoneClone;
    }
}
