package com.company;

public class Troll extends Character{
    public Troll(){
        weapon = new AxeBehavior();
    }

    public void fight() {
        System.out.println("I am the troll of the western forest.");
    }
}
