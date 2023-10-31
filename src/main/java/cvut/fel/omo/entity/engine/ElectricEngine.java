package cvut.fel.omo.entity.engine;

public class ElectricEngine extends Engine {
    private final EElectricEngineType type;
    private final int voltage;
    private final int batteryCapacity;

    public ElectricEngine(String code, int power, int torque, EElectricEngineType type, int voltage, int batteryCapacity) {
        super(code, power, torque);
        this.type = type;
        this.voltage = voltage;
        this.batteryCapacity = batteryCapacity;
    }

    public EElectricEngineType getType() {
        return type;
    }

    public int getVoltage() {
        return voltage;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}
