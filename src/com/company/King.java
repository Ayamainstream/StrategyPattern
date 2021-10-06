package com.company;

public class King extends Character{
    public King(){
        weapon = new KnifeBehavior();
    }

    public void fight() {
        System.out.println("I am a king of the Northern lands.");
    }
}
