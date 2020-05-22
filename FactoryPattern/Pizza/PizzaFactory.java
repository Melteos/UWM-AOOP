public class PizzaFactory {

    public Pizza getIngredient(String ingredient){
        if(ingredient == null){
            return null;
        }
        if(ingredient.equalsIgnoreCase("mushroom")){
            return new PizzaWithMushroom();

        } else if(ingredient.equalsIgnoreCase("pineapple")){
            return new PizzaWithPineapple();

        } else if(ingredient.equalsIgnoreCase("cheese")){
            return new PizzaWithCheese();
        }
        else if(ingredient.equalsIgnoreCase("pepperoni")){
            return new PizzaWithPepperoni();
        }

        return null;
    }

}
