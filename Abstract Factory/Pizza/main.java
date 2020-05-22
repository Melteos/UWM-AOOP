import java.util.Scanner;

public class main {

    private static Store runStore() {
        Store myStore;
        PizzaStore factory;
        System.out.println("Select store: (American or Italian)");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        if( input.equalsIgnoreCase("american")) {
            factory = new AmericanPizzaStore();
            myStore = new Store(factory);
        }
        else if( input.equalsIgnoreCase("italian")) {
            factory = new ItalianPizzaStore();
            myStore = new Store(factory);
        }
        else{
            System.out.println("Wrong input");
            myStore = null;
        }

        return myStore;
    }

    public static void main(String[] args) {

        Store myStore = runStore();
        myStore.getPizza();

    }
}