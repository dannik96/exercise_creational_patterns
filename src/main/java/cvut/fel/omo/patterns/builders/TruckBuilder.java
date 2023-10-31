package cvut.fel.omo.patterns.builders;

import cvut.fel.omo.entity.model.TruckModel;
import cvut.fel.omo.entity.other.VehicleCommunicationInterface;
import cvut.fel.omo.entity.vehicle.Truck;

public class TruckBuilder extends VehicleBuilder<Truck, TruckModel, TruckBuilder>{
    private boolean hasReductionTransmission;
    private int fuelTankCapacity;
    private boolean hasHydraulicDrive;

    public TruckBuilder() {
    }

    public TruckBuilder(VehicleCommunicationInterface vci) {
        super(vci);
    }

    public TruckBuilder hasReductionTransmission(boolean hasReductionTransmission) {
        this.hasReductionTransmission = hasReductionTransmission;
        log(String.format("Reduction transmission set to %s", hasReductionTransmission));
        return this;
    }

    public TruckBuilder fuelTankCapacity(int fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
        log(String.format("Fuel tank capacity set to %s", fuelTankCapacity));
        return this;
    }

    public TruckBuilder hasHydraulicDrive(boolean hasHydraulicDrive) {
        this.hasHydraulicDrive = hasHydraulicDrive;
        log(String.format("Hydraulic drive set to %s", hasHydraulicDrive));
        return this;
    }

    @Override
    public Truck build() {
        return null;
    }
}
