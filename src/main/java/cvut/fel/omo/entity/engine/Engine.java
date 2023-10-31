package cvut.fel.omo.entity.engine;

public abstract class Engine {
    protected final String code;
    protected final int power;
    protected final int torque;

    public Engine(String code, int power, int torque) {
        this.code = code;
        this.power = power;
        this.torque = torque;
    }

    public String getCode() {
        return code;
    }

    public int getPower() {
        return power;
    }

    public int getTorque() {
        return torque;
    }
}
