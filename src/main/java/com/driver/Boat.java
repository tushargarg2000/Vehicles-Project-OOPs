package com.driver;

public class Boat implements WaterVehicle{

    String name;
    int capacity;

    Boat(){

    }

    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
