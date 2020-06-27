public class SmartPhoneProxy implements Telephone {

    private static Telephone telephone;

    @java.lang.Override
    public void call() {
        if(telephone==null) {
            telephone = new SmartPhone();
        }
        telephone.call();
    }
}
