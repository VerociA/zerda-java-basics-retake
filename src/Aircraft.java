/**
 * Created by Verőci Ádám on 2016.12.12..
 */
public class Aircraft {
    String type;
    int ammo;
    int baseDamage;
    int allDamage;
    int maxAmmo;


    public Aircraft(String type) {
        this.type = type;
        this.baseDamage = baseDamage;
        this.allDamage = ammo * baseDamage;
        this.ammo= 0;
        this.maxAmmo = maxAmmo;
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
