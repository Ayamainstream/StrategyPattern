package com.company;

public class Knight extends Character{
    public Knight(){
        weapon = new SwordBehavior();
    }

    public void fight() {
        System.out.println("I am the knight of the Eastern lands.");
    }
}
