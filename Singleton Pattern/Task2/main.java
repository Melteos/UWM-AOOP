import java.lang.reflect.Constructor;

public class main {

    public static void main(String args[])
    {
        // instantiating Telephone class with variable x
        Telephone x = Telephone.getInstance();

        // instantiating Telephone class with variable y
        Telephone y = Telephone.getInstance();

        System.out.println("Phone from x is " + x);
        System.out.println("Phone from y is " + y);
        System.out.println("\n");

        // changing variables of instance x,y
        x.setBrand("Nokia");
        x.setModel(1453);
        y.setNfc(true);

        System.out.println("String from x is " + x);
        System.out.println("String from y is " + y);
        System.out.println("\n");

        Telephone instanceOne = Telephone.getInstance();
        Telephone instanceTwo = null;
        try {
            Constructor[] constructors = Telephone.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (Telephone) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        instanceTwo.setBrand("Samsung");
        System.out.println(instanceOne.hashCode() + " " + instanceOne);
        System.out.println(instanceTwo.hashCode() + " " + instanceTwo);
    }
}
