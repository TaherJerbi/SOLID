package com.directi.training.lsp.solution;

public class Pool
{
    public void run()
    {
        Toy donaldDuck = new Duck();
        Toy electricDuck = new ElectronicDuckAction();
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(Toy... ducks)
    {
        for (Toy duck : ducks) {
            duck.quack();
        }
    }

    private void swim(Toy... ducks)
    {
        for (Toy duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
