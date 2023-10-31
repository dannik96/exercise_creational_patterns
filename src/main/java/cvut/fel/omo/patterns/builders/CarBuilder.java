package cvut.fel.omo.patterns.builders;

import cvut.fel.omo.entity.model.CarModel;
import cvut.fel.omo.entity.other.VehicleCommunicationInterface;
import cvut.fel.omo.entity.other.enums.EHeadLightType;
import cvut.fel.omo.entity.other.enums.ESuspensionType;
import cvut.fel.omo.entity.vehicle.Car;

public class CarBuilder extends VehicleBuilder<Car, CarModel, CarBuilder>{
    private EHeadLightType headLightType;
    private ESuspensionType suspensionType;

    public CarBuilder() {
    }

    public CarBuilder(VehicleCommunicationInterface vci) {
        super(vci);
    }

    public CarBuilder headLightType(EHeadLightType headLightType) {
        this.headLightType = headLightType;
        log(String.format("Headlight set %s", headLightType));
        return this;
    }

    public CarBuilder suspensionType(ESuspensionType suspensionType) {
        this.suspensionType = suspensionType;
        log(String.format("Suspension set %s", suspensionType));
        return this;
    }

    @Override
    public Car build() {
        return null;
    }
}
