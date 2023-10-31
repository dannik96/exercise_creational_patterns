package cvut.fel.omo.entity.vehicle;

import cvut.fel.omo.entity.engine.Engine;
import cvut.fel.omo.entity.model.CarModel;
import cvut.fel.omo.entity.other.TowingDevice;
import cvut.fel.omo.entity.other.Wheel;
import cvut.fel.omo.entity.other.enums.EHeadLightType;
import cvut.fel.omo.entity.other.enums.ESuspensionType;
import java.util.List;

public class Car extends Vehicle<CarModel> {
    private final EHeadLightType headLightType;
    private final ESuspensionType suspensionType;

    public Car(String make, String vinCode, String colorCode, Engine engine, List<Wheel> wheelList, TowingDevice towingDevice, CarModel model, EHeadLightType headLightType, ESuspensionType suspensionType) {
        super(make, vinCode, colorCode, engine, wheelList, towingDevice, model);
        this.headLightType = headLightType;
        this.suspensionType = suspensionType;
    }

    public Car(String make, String vinCode, String colorCode, Engine engine, CarModel model, EHeadLightType headLightType, ESuspensionType suspensionType) {
        super(make, vinCode, colorCode, engine, model);
        this.headLightType = headLightType;
        this.suspensionType = suspensionType;
    }
}
