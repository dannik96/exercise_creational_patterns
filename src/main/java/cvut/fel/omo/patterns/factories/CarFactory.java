package cvut.fel.omo.patterns.factories;

import cvut.fel.omo.entity.model.CarModel;
import cvut.fel.omo.entity.other.enums.EHeadLightType;
import cvut.fel.omo.entity.other.enums.ESuspensionType;
import cvut.fel.omo.entity.vehicle.Car;
import cvut.fel.omo.patterns.builders.CarBuilder;

public class CarFactory extends AbstractVehicleFactory<CarModel, Car> {
    private EHeadLightType headLightType;
    private ESuspensionType suspensionType;

    public CarFactory(String make) {
        super(make, new CarBuilder());
    }

    public EHeadLightType getHeadLightType() {
        return headLightType;
    }

    public void setHeadLightType(EHeadLightType headLightType) {
        this.headLightType = headLightType;
    }

    public ESuspensionType getSuspensionType() {
        return suspensionType;
    }

    public void setSuspensionType(ESuspensionType suspensionType) {
        this.suspensionType = suspensionType;
    }

    @Override
    public Car create() {

        return null;
    }

    @Override
    public Car createFromPrototype(Car prototype) {
        return null;
    }
}
