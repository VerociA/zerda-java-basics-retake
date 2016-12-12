package com.greenfox.exams.java.retake;
import java.util.ArrayList;

/**
 * Created by Verőci Ádám on 2016.12.12..
 */
public class Carrier extends ArrayList<Aircraft> {
    int hp;
    int ammos;

    public Carrier() {
        hp = 3000;
        this.ammos = 100;
    }

    public void addAircrafts() {
        this.add(new Aircraft("F35", 50, 12));
        this.add(new Aircraft("F16", 30, 8));
    }

    int count;

    public int countOfPlanes() {
        for (int i = 0; i < this.size(); i++) {
            count++;
        }
        return count;
    }

    public int sumOfAmmos() {
        for (int i = 0; i < this.size(); i++) {
            this.get(i).getAmmo();
        }
        return ammos;
    }

    int tdamage;
    public int totalDamage() {
        for (int i = 0; i < this.size(); i++) {
            tdamage += this.get(i).ammo * this.get(i).baseDamage;
        }
        return tdamage;
    }

    public void fill(){
        for(int i=0; i<this.size(); i++){
           if(ammos > 0){
               if(this.get(i).type.contains("F35")){
                   this.get(i).refill(12);
                   this.ammos-=12;
               }
               else{
                   this.get(i).refill(8);
                   this.ammos-=8;
               }
           }else System.out.println("No more ammo on the ship!");
        }
    }

    public int attack(Carrier target) {
        for (int i = 0; i < this.size(); i++) {
            target.hp -= this.get(i).allDamage();
        }
        return target.hp;
    }
    public int defend(Carrier target){
        for(int i=0; i<target.size(); i++){
            this.hp -= target.get(i).allDamage();
        }
        return this.hp;
    }



    @Override
    public String toString() {
        this.totalDamage();
        this.sumOfAmmos();
        if (hp > 0) {
            return ("Aircraft count: " + this.countOfPlanes() + ", Ammo Storage: " + this.ammos + ", Total damage: " + this.tdamage + ", Health Remaining: " + this.hp);
        } else {
            return "It's dead Jim :(";
        }
    }
}