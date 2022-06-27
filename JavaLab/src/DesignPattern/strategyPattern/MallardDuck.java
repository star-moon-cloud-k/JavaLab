package DesignPattern.strategyPattern;

import DesignPattern.strategyPattern.Behavior.Fly.FlyWithWings;
import DesignPattern.strategyPattern.Behavior.Quack.Quack;

public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("저는 물 오리입니다.");
    }
}
