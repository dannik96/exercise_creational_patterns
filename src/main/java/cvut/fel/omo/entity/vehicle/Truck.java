package cvut.fel.omo.entity.vehicle;

import cvut.fel.omo.entity.engine.Engine;
import cvut.fel.omo.entity.model.TruckModel;
import cvut.fel.omo.entity.other.TowingDevice;
import cvut.fel.omo.entity.other.Wheel;
import java.util.List;

public class Truck extends Vehicle<TruckModel> {
    private final boolean hasReductionTransmission;
    private final int fuelTankCapacity;
    private final boolean hasHydraulicDrive;

    public Truck(String make, String vinCode, String colorCode, Engine engine, List<Wheel> wheelList, TowingDevice towingDevice, TruckModel model, boolean hasReductionTransmission, int fuelTankCapacity, boolean hasHydraulicDrive) {
        super(make, vinCode, colorCode, engine, wheelList, towingDevice, model);
        this.hasReductionTransmission = hasReductionTransmission;
        this.fuelTankCapacity = fuelTankCapacity;
        this.hasHydraulicDrive = hasHydraulicDrive;
    }

    public Truck(String make, String vinCode, String colorCode, Engine engine, TruckModel model, boolean hasReductionTransmission, int fuelTankCapacity, boolean hasHydraulicDrive) {
        super(make, vinCode, colorCode, engine, model);
        this.hasReductionTransmission = hasReductionTransmission;
        this.fuelTankCapacity = fuelTankCapacity;
        this.hasHydraulicDrive = hasHydraulicDrive;
    }
}
