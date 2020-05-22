public class Store {
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;

    public Store(PizzaStore factory) {
        pizza1 = factory.createPizza1();
        pizza2 = factory.createPizza2();
        pizza3 = factory.createPizza3();
    }

    public void getPizza() {
        pizza1.getPizza();
        pizza2.getPizza();
        pizza3.getPizza();
    }
}
