public class FactoryPatternDemo {

    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();

        Pizza pizza1 = pizzaFactory.getIngredient("cheese");

        pizza1.getPizza();

        Pizza pizza2 = pizzaFactory.getIngredient("pineapple");

        pizza2.getPizza();

        Pizza pizza3 = pizzaFactory.getIngredient("mushroom");

        pizza3.getPizza();

        Pizza pizza4 = pizzaFactory.getIngredient("pepperoni");

        pizza4.getPizza();

    }
}