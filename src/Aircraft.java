/**
 * Created by Verőci Ádám on 2016.12.12..
 */
public class Aircraft {
    String type;
    int ammo;
    int baseDamage;
    int allDamage;

    public Aircraft(String type, int baseDamage, int allDamage) {
        this.type = type;
        this.baseDamage = baseDamage;
        this.allDamage = allDamage;
        this.ammo= 0;
    }

    @Override
    public String toString(){
        return("Type: " + type + ",  Ammo: " + ammo + ", Base Damage: " + baseDamage + ", All Damage: " + allDamage);
    }
}
