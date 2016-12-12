package com.greenfox.exams.java.retake;

/**
 * Created by Verőci Ádám on 2016.12.12..
 */
public class Main {
    public static void main(String[] args) {
        Aircraft plane = new Aircraft("F16", 30, 8);
        System.out.println(plane.toString());
        plane.refill(2);
        System.out.println("Aircraft's alldamage value: " + plane.fight());

        Carrier carrier = new Carrier();
        carrier.addAircrafts();
        carrier.addAircrafts();
        carrier.fill();
        System.out.println("Leftover ammos on carrier: " + carrier.ammos);

        Carrier enemy = new Carrier();
        enemy.addAircrafts();
        enemy.fill();
        carrier.attack(enemy);
        System.out.println(enemy.toString());
        carrier.defend(enemy);
        System.out.println(carrier.toString());
        carrier.attack(enemy);
        carrier.attack(enemy);
        carrier.attack(enemy);
        System.out.println(enemy.toString());
    }
}
