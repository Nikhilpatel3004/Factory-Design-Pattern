package Hundai;
import Vehicle.Vehicle;
public class Creta extends Vehicle {
    @Override
    public void createVehicle() {
      features.add(new SUVBodyType());
      features.add(new PowerSteering());
      features.add(new Airbag());
    }
}
