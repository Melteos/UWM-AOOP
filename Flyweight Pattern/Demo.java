public class Demo {
    public static void main(String[] args) {

        for(int i=0; i < 20; ++i) {
            Telephone telephone = (Telephone) PhoneFactory.getPhone(getRandomBrand());
            telephone.setNumber(getRandomNumber());
            telephone.getPhoneInfo();
        }

    }

    public static String getRandomBrand() {
        double rand = Math.random();
        if(rand<0.33) {
            return "Samsung";
        }
        else if(rand<0.66){
            return "HTC";
        }
        else
            return "Nokia";
    }

    public static int getRandomNumber() {
        return (int)((Math.random() * ((800800800 - 400400400) + 1)) + 400400400);
    }
}
