package showRoom;

import Hundai.Creta;
import Sizuki.MarutiSizuki;
import Vehicle.Vehicle;

public class showRoom {

    public static Vehicle getVehicle(String vehicle){
        if(vehicle.equalsIgnoreCase("swift")){
            return new MarutiSizuki();
        }else if(vehicle.equalsIgnoreCase("creta")){
            return new Creta();
        }else{
            return null;
        }

    }
}
