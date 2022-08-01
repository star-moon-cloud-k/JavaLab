package DesignPattern.FactoryPattern;

import DesignPattern.FactoryPattern.entity.*;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;

    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;
    protected ArrayList toppings = new ArrayList();
    protected abstract void prepare();


    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }
}
