package com.greenfox.exams.java.retake;

import java.util.ArrayList;

/**
 * Created by Verőci Ádám on 2016.12.12..
 */
public class Carrier extends ArrayList{
    int hp;

    public Carrier() {
        hp = 3000;
    }

    public void addAircraft(String type) {
        if (type == "com.greenfox.exams.java.retake.F16") {
            this.add(new F16("com.greenfox.exams.java.retake.F16"));
        }
        else if(type == "com.greenfox.exams.java.retake.F35") {
            this.add(new F35("com.greenfox.exams.java.retake.F35"));
        }else System.out.println("No such plane in the AirForce.");
    }

    int count;
    public int countOfPlanes(){
        for (int i = 0; i<this.size(); i++){
            count++;
        }return count;
    }

//    int ammos;
//    public int sumOfAmmos(){
//        for (int i = 0; i<this.size(); i++){
//            ammos = this.get(i).getAmmo();
//        }return count;
//    }
    @Override
    public String toString(){
        return ("Aircraft count: " + this.countOfPlanes() +", Ammo Storage: " + ammos, Total damage: 2280, Health Remaining: hp")
    }
}
