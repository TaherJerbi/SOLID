package com.directi.training.lsp.solution;

public class ElectronicDuckAction implements Toy{
    ElectronicDuck duck = new ElectronicDuck();
    public ElectronicDuckAction(){
    }

    public void swim(){
        duck.turnOn();
        duck.swim();
    }

    public void quack(){
        duck.turnOn();
        duck.quack();
    }

}
