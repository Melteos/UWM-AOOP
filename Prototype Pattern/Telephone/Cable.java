public class Cable extends Telephone {

    public final String type = "Cable";

    public Cable(String brand, int model, boolean nfc){
        this.setBrand(brand);
        this.setModel(model);
        this.setNfc(nfc);
    }

    @java.lang.Override
    public Telephone copy() {
        Cable cablePhoneClone = new Cable(new String(this.getBrand()),this.getModel(),this.getNfc());
        return cablePhoneClone;
    }
}
