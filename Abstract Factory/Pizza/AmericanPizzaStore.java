public class AmericanPizzaStore implements PizzaStore {
    @java.lang.Override
    public PizzaWithMushroom createPizza1() {
        return new PizzaWithMushroom();
    }

    @java.lang.Override
    public PizzaWithPepperoni createPizza2() {
        return new PizzaWithPepperoni();
    }

    @java.lang.Override
    public PizzaWithPineapple createPizza3() {
        return new PizzaWithPineapple();
    }
}
