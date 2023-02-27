package Vehicle;

import Feature.Feature;


import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

   protected List<Feature> features = new ArrayList<>();

    public List<Feature> getFeatures() {
        return features;
    }

    public abstract  void createVehicle();
}
