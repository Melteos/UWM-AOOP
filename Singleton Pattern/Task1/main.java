public class main {

    public static void main(String args[])
    {
        // instantiating Telephone class with variable x
        Telephone x = Telephone.getInstance();

        // instantiating Telephone class with variable y
        Telephone y = Telephone.getInstance();

        // instantiating Telephone class with variable z
        Telephone z = Telephone.getInstance();

        System.out.println("Phone from x is " + x);
        System.out.println("Phone from y is " + y);
        System.out.println("Phone from z is " + z);
        System.out.println("\n");

        // changing variable of instance x
        x.setBrand("Nokia");

        System.out.println("Phone from x is " + x);
        System.out.println("Phone from y is " + y);
        System.out.println("Phone from z is " + z);
        System.out.println("\n");

        // changing variable of instance z
        z.setModel(1453);
        y.setNfc(true);

        System.out.println("String from x is " + x);
        System.out.println("String from y is " + y);
        System.out.println("String from z is " + z);
    }
}
