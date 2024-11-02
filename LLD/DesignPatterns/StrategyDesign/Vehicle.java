package LLD.DesignPatterns.StrategyDesign;

import LLD.DesignPatterns.StrategyDesign.Strategy.DriveStrategy;

public class Vehicle {
    private final DriveStrategy driveObj;

    // Constructor Injection
    public Vehicle(DriveStrategy s) {
        this.driveObj = s;
    }

    public void drive() {
        driveObj.drive();
    }
}
