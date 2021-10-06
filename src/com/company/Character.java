package com.company;

public abstract class Character {
    WeaponBehavior weapon;

    public void setWeaponBehavior(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public Character(){

    }

    public abstract void fight();

    public void performWeapon(){
        weapon.useWeapon();
    }
}
