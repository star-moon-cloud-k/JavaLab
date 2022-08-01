package DesignPattern.FactoryPattern.ny;

import DesignPattern.FactoryPattern.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }

    @Override
    protected void prepare() {

    }
}
