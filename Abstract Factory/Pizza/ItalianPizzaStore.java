public class ItalianPizzaStore implements PizzaStore {
    @java.lang.Override
    public PizzaWithCheese createPizza1() {
        return new PizzaWithCheese();
    }

    @java.lang.Override
    public PizzaWithPepperoni createPizza2() {
        return new PizzaWithPepperoni();
    }

    @java.lang.Override
    public PizzaWithMushroom createPizza3() {
        return new PizzaWithMushroom();
    }
}
