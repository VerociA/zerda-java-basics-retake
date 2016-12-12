package com.greenfox.exams.java.retake;

/**
 * Created by Verőci Ádám on 2016.12.12..
 */
public class Main {
    public static void main(String[] args) {
        Aircraft plane = new Aircraft("F16", 30, 8);

        System.out.println(plane.toString());
        System.out.println(plane.fight());
        plane.refill(2);
        System.out.println(plane.fight());

        Carrier carrier = new Carrier();
        carrier.add("F16");


    }
}
