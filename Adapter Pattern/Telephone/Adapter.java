public class Adapter implements IRing {

    Telephone phone;

    public Adapter(Telephone phone){
        this.phone=phone;
    }

    @java.lang.Override
    public void Call(int number) {
        System.out.println("i called number " + phone.Call());
    }
}
