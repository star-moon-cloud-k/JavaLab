package DesignPattern.strategyPattern.Behavior.Fly;

import DesignPattern.strategyPattern.Behavior.Fly.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    public void fly(){
        System.out.println("로켓 추진으로 날아갑니다.");
    }
}
