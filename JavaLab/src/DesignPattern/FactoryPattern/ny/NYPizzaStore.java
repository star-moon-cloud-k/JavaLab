package DesignPattern.FactoryPattern.ny;

import DesignPattern.FactoryPattern.Pizza;
import DesignPattern.FactoryPattern.PizzaIngredientFactory;
import DesignPattern.FactoryPattern.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza =new NYStyleCheesePizza();
            pizza.setName("New York Style Cheese Pizza");

        } else if (item.equals("pepperoni")) {
            pizza =new NYStylePepperoniPizza();
            pizza.setName("New York Style Pepperoni Pizza");
        } else if (item.equals("clam")) {
            pizza =new NYStyleClamPizza();
            pizza.setName("New York Style Clam Pizza");
        } else if (item.equals("veggie")) {
            pizza =new NYStyleVeggiePizza();
            pizza.setName("New York Style Veggie Pizza");
        }else return null;

        return pizza;
    }
}
