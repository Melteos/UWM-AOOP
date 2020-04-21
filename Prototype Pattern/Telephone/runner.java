public class runner {

    public static void main(String[] args) {
        Mobile mobilephone = new Mobile("HTC", 123,true);
        Mobile mobilecopy = (Mobile) mobilephone.copy();

        Cable cablephone = new Cable("Siemens",10007,false);
        Cable cablecopy = (Cable) cablephone.copy();

        System.out.println("Original: " + mobilephone.type + " " + mobilephone + " " + mobilephone.getBrand() + " " + mobilephone.getModel() );
        System.out.println("Copy: " + mobilecopy.type + " " + mobilecopy + " " + mobilecopy.getBrand() + " " + mobilecopy.getModel() );
        System.out.println("Original: " + cablephone.type + " " + cablephone + " " + cablephone.getBrand() + " " + cablephone.getModel() );
        System.out.println("Copy: " + cablecopy.type + " " + cablecopy + " " + cablecopy.getBrand() + " " + cablecopy.getModel() );

    }

}
