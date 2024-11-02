package LLD.DesignPatterns.StrategyDesign;

import LLD.DesignPatterns.StrategyDesign.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
