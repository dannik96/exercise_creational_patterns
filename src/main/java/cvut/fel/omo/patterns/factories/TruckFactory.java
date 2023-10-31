package cvut.fel.omo.patterns.factories;

import cvut.fel.omo.entity.model.TruckModel;
import cvut.fel.omo.entity.vehicle.Truck;
import cvut.fel.omo.patterns.builders.TruckBuilder;

public class TruckFactory extends AbstractVehicleFactory<TruckModel, Truck>{
    private boolean hasReductionTransmission;
    private int fuelTankCapacity;
    private boolean hasHydraulicDrive;

    public TruckFactory(String make) {
        super(make, new TruckBuilder());
    }

    public boolean isHasReductionTransmission() {
        return hasReductionTransmission;
    }

    public void setHasReductionTransmission(boolean hasReductionTransmission) {
        this.hasReductionTransmission = hasReductionTransmission;
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(int fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public boolean isHasHydraulicDrive() {
        return hasHydraulicDrive;
    }

    public void setHasHydraulicDrive(boolean hasHydraulicDrive) {
        this.hasHydraulicDrive = hasHydraulicDrive;
    }

    @Override
    public Truck create() {
        return null;
    }

    @Override
    public Truck createFromPrototype(Truck prototype) {
        return null;
    }
}
