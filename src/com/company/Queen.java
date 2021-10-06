package com.company;

public class Queen extends Character{
    public Queen(){
        weapon = new BowAndArrowBehavior();
    }

    public void fight() {
        System.out.println("I am a queen of the Southern lands.");
    }
}
