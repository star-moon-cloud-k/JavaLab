package DesignPattern.strategyPattern.Behavior.Quack;

public class Squeak implements QuackBehavior {
    public void quack(){
        System.out.println("삑");
    }
}
