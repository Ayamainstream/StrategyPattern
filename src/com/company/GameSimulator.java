package com.company;

import java.util.Scanner;

public class GameSimulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("""
                Choose your character:\s
                1. King
                2. Queen
                3. Knight
                4. Troll""");
        int character = in.nextInt();
        if (character == 1){
            Character king = new King();
            Fighting(in, king);
        }
        else if (character == 2){
            Character queen = new Queen();
            Fighting(in, queen);
        }
        else if (character == 3){
            Character knight = new Knight();
            Fighting(in, knight);
        }
        else if (character == 4){
            Character troll = new Troll();
            Fighting(in, troll);
        }
        System.out.println("Now I am ready to fight!!");
    }

    private static void Fighting(Scanner in, Character character) {
        character.fight();
        System.out.println("I have my own weapon.");
        character.performWeapon();
        System.out.println("""
                If you want change it choose number:
                1. Yes, i don't like your weapon.
                2. No, you have a good weapon.""");
        int change = in.nextInt();
        if (change == 1){
            System.out.println("""
                    Then choose what you like:
                    1. Sword
                    2. Knife
                    3. Axe
                    4. Bow and Arrow""");
            int newWeapon = in.nextInt();
            if (newWeapon == 1) {
                character.setWeaponBehavior(new SwordBehavior());
                character.performWeapon();
            }
            else if (newWeapon == 2) {
                character.setWeaponBehavior(new KnifeBehavior());
                character.performWeapon();
            }
            else if (newWeapon == 3) {
                character.setWeaponBehavior(new AxeBehavior());
                character.performWeapon();
            }
            else if (newWeapon == 4) {
                character.setWeaponBehavior(new BowAndArrowBehavior());
                character.performWeapon();
            }
        }
        else
            System.out.println("Cool!");
    }
}
