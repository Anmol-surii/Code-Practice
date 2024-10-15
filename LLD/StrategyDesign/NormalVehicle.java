package LLD.StrategyDesign;

import LLD.StrategyDesign.Strategy.PassesngerDriveStrategy;

public class NormalVehicle extends Vehicle{

    public NormalVehicle() {
        super(new PassesngerDriveStrategy());
    }
}
