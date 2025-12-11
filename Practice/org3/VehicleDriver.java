package org3;

import org4.Bike;
import org4.Car;
import org4.Vehicle;

public class VehicleDriver {

    public static Vehicle bookVehicle(String type) {
        if (type.equalsIgnoreCase("Car")) {
            return new Car();
        }
        else if (type.equalsIgnoreCase("Bike")) {
            return new Bike();
        }
        return null;
    }

    public static void main(String[] args) {
        bookVehicle("bike");
    }
}
