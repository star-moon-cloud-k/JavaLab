package DesignPattern.DecoratorPattern;

public class Customer {
    public static void main(String[] args){
        Beverage beverage = new Americano();

        beverage = new Shot(beverage);

        beverage = new Cream(beverage);

        beverage = new Shot(beverage);
        System.out.println("메뉴 : " + beverage.getDescription());
        System.out.println("가격 : " + beverage.cost());
    }
}
