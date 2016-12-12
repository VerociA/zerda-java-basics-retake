package com.greenfox.exams.java.retake;

/**
 * Created by Verőci Ádám on 2016.12.12..
 */
public class Main {
    public static void main(String[] args) {
        Aircraft plane = new F16("F16");

        System.out.println(plane.toString());
        System.out.println(plane.fight());
        plane.refill(20);

        Carrier carrier = new Carrier();
        carrier.add("F16");



    }
}
