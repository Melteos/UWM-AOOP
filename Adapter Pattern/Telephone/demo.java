public class demo {

    public static void main(String args[]) {

        Telephone phone = new Telephone(53343);
        Adapter phoneAdapter = new Adapter(phone);
        phoneAdapter.Call(12345);

    }
}
