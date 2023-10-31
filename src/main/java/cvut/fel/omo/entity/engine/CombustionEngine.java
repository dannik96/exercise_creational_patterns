package cvut.fel.omo.entity.engine;

public class CombustionEngine extends Engine{
    private final int displacement;
    private final EFuelType fuelType;

    public CombustionEngine(String code, int power, int torque, int displacement, EFuelType fuelType) {
        super(code, power, torque);
        this.displacement = displacement;
        this.fuelType = fuelType;
    }

    public int getDisplacement() {
        return displacement;
    }

    public EFuelType getFuelType() {
        return fuelType;
    }
}
