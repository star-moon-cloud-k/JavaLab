package DesignPattern.DecoratorPattern;

public abstract class CondimentDecorator extends Beverage{
    public abstract String getDescription(); //모든 첨가물들이 상속게될 클래스
}
