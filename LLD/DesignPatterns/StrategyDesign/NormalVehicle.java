package LLD.DesignPatterns.StrategyDesign;

import LLD.DesignPatterns.StrategyDesign.Strategy.PassesngerDriveStrategy;

public class NormalVehicle extends Vehicle{

    public NormalVehicle() {
        super(new PassesngerDriveStrategy());
    }
}
