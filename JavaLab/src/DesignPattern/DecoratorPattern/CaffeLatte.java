package DesignPattern.DecoratorPattern;

public class CaffeLatte extends Beverage{
    public CaffeLatte(){
        super();
        description = "CaffeLatte";
    }

    public int cost(){
        return 5000;
    }
}
