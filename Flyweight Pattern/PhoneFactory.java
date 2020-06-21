import java.util.HashMap;

public class PhoneFactory {

    private static final HashMap phoneMap = new HashMap();

    public static Telephone getPhone(String brand) {
        Telephone telephone = (Telephone) phoneMap.get(brand);

        if(telephone == null) {
            telephone = new Telephone(brand,000, true) {};
            phoneMap.put(brand, telephone);
            System.out.println("Creating phone with brand : " + brand);
        }
        return telephone;
    }
}
