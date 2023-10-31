package cvut.fel.omo.patterns.factories;

import cvut.fel.omo.entity.engine.Engine;
import cvut.fel.omo.entity.model.VehicleModel;
import cvut.fel.omo.entity.vehicle.Vehicle;
import cvut.fel.omo.patterns.builders.VehicleBuilder;

abstract public class AbstractVehicleFactory<M extends VehicleModel, R extends Vehicle<M>> implements AbstractFactory<R>{
    protected final String make;
    protected String colorCode;
    protected Engine engine;
    protected M vehicleModel;

    protected VehicleBuilder vehicleBuilder;

    public AbstractVehicleFactory(String make, VehicleBuilder vehicleBuilder) {
        this.make = make;
        this.vehicleBuilder = vehicleBuilder;
    }

    public String getMake() {
        return make;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public M getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(M vehicleModel) {
        this.vehicleModel = vehicleModel;
    }
}
