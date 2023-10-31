package cvut.fel.omo.patterns.builders;

import cvut.fel.omo.entity.engine.Engine;
import cvut.fel.omo.entity.model.VehicleModel;
import cvut.fel.omo.entity.other.TowingDevice;
import cvut.fel.omo.entity.other.VehicleCommunicationInterface;
import cvut.fel.omo.entity.other.Wheel;
import cvut.fel.omo.entity.vehicle.Vehicle;
import java.util.List;

abstract public class VehicleBuilder<T extends Vehicle<M>, M extends VehicleModel, B extends VehicleBuilder<T,M,B>> {
    private VehicleCommunicationInterface vci;
    protected String make;
    protected String vinCode;
    protected String colorCode;
    protected Engine engine;
    protected List<Wheel> wheelList;
    protected TowingDevice towingDevice;
    protected M model;

    public VehicleBuilder() {
    }

    public VehicleBuilder(VehicleCommunicationInterface vci) {
        this.vci = vci;
    }

    public VehicleCommunicationInterface getVci() {
        return vci;
    }

    public void setVci(VehicleCommunicationInterface vci) {
        this.vci = vci;
    }

    protected void log(String message){
        if(vci != null) vci.logAction(message);
    }

    public B make(String make) {
        this.make = make;
        log(String.format("Make set as %s", make));
        return (B) this;
    }

    public B vinCode(String vinCode) {
        this.vinCode = vinCode;
        log(String.format("VIN code set as %s", vinCode));
        return (B) this;
    }

    public B colorCode(String colorCode) {
        this.colorCode = colorCode;
        log(String.format("Color code set as %s", colorCode));
        return (B) this;
    }

    public B engine(Engine engine) {
        this.engine = engine;
        log(String.format("Engine set %s", engine));
        return (B) this;
    }

    public B wheelList(List<Wheel> wheelList) {
        this.wheelList = wheelList;
        log(String.format("WheelList set %s", wheelList));
        return (B) this;
    }

    public B towingDevice(TowingDevice towingDevice) {
        this.towingDevice = towingDevice;
        log(String.format("Towing device set %s", towingDevice));
        return (B) this;
    }

    public B model(M model) {
        this.model = model;
        log(String.format("Model device set %s", model));
        return (B) this;
    }

    abstract public T build();
}
