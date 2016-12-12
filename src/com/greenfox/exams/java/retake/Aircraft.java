package com.greenfox.exams.java.retake;

/**
 * Created by Verőci Ádám on 2016.12.12..
 */
public class Aircraft {
    String type;
    int ammo;
    int baseDamage;
    int allDamage;
    int maxAmmo;

    public int getAmmo() {
        return ammo;
    }

    public Aircraft(String type) {
        this.type = type;
        this.allDamage = ammo * baseDamage;
        this.ammo= 0;
    }

    @Override
    public String toString(){
        return("Type: " + type + ",  Ammo: " + ammo + ", Base Damage: " + baseDamage + ", All Damage: " + allDamage);
    }

    int hurt;
    public int fight(){
        hurt = ammo * baseDamage;
        ammo = 0;
        return hurt;
    }

    int remainder;
    public int refill(int rounds){
        if(maxAmmo >= ammo + rounds){
            ammo+=rounds;
            remainder=0;
        }else {
            remainder=ammo + rounds - maxAmmo;
        } return remainder;
    }
}