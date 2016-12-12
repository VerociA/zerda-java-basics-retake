import java.util.ArrayList;

/**
 * Created by Verőci Ádám on 2016.12.12..
 */
public class Carrier extends ArrayList{
    int hp;

    public void addAircraft(String type) {
        if (type == "F16") {
            this.add(new F16("F16"));
        }
        else if(type == "F35") {
            this.add(new F35("F35"));
        }else System.out.println("No such plane in the AirForce.");
    }
}
