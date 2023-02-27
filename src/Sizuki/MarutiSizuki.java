package Sizuki;

import Vehicle.Vehicle;

public class MarutiSizuki extends Vehicle {
    @Override
    public void createVehicle() {
        features.add(new HatchbackBody());
        features.add(new FiveSeater());
        features.add(new AlloyWheel());
    }
}
