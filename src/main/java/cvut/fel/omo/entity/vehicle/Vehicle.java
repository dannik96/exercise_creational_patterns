package cvut.fel.omo.entity.vehicle;

import cvut.fel.omo.entity.engine.Engine;
import cvut.fel.omo.entity.model.VehicleModel;
import cvut.fel.omo.entity.other.TowingDevice;
import cvut.fel.omo.entity.other.Wheel;
import java.util.List;

public abstract class Vehicle<T extends VehicleModel> {
    protected final String make;
    protected final String vinCode;
    protected final String colorCode;
    protected final Engine engine;
    protected List<Wheel> wheelList;
    protected TowingDevice towingDevice;
    protected final T model;

    public Vehicle(String make, String vinCode, String colorCode, Engine engine, List<Wheel> wheelList, TowingDevice towingDevice, T model) {
        this.make = make;
        this.vinCode = vinCode;
        this.colorCode = colorCode;
        this.engine = engine;
        this.wheelList = wheelList;
        this.towingDevice = towingDevice;
        this.model = model;
    }

    public Vehicle(String make, String vinCode, String colorCode, Engine engine, T model) {
        this.make = make;
        this.vinCode = vinCode;
        this.colorCode = colorCode;
        this.engine = engine;
        this.model = model;
    }

    public String getVinCode() {
        return vinCode;
    }

    public String getColorCode() {
        return colorCode;
    }

    public Engine getEngine() {
        return engine;
    }

    public List<Wheel> getWheelList() {
        return wheelList;
    }

    public void setWheelList(List<Wheel> wheelList) {
        this.wheelList = wheelList;
    }

    public TowingDevice getTowingDevice() {
        return towingDevice;
    }

    public void setTowingDevice(TowingDevice towingDevice) {
        this.towingDevice = towingDevice;
    }

    public T getModel() {
        return model;
    }
}
