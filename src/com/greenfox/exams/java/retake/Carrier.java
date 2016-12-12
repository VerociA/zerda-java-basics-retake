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
        if (type == "F16") {
            this.add(new F16("F16"));
        }
        else if(type == "F35") {
            this.add(new F35("F35"));
        }else System.out.println("No such plane in the AirForce.");
    }



//    int count;
//    public int countOfPlanes(){
//        for (int i = 0; i<this.size(); i++){
//            count++;
//        }return count;
//    }
//
//    int ammos;
//    public int sumOfAmmos(){
//        for (int i = 0; i<this.size(); i++){
//            this.get(i).getAmmo();
//        }return ammos;
//    }
//
//    int tdamage
//    public int totalDamage(){
//        for (int i = 0; i<this.size(); i++){
//            tdamage = ammos * this.get(i).baseDamage;
//        }return tdamage;
//    }
//
//    @Override
//    public String toString(){
//      if(hp>0) { return ("Aircraft count: " + this.countOfPlanes() +", Ammo Storage: " + ammos + ",Total damage: " + tdamage +  ",Health Remaining: " + hp);}
//            else{
//        return "It's dead Jim :("}
//    }
}
