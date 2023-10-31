package cvut.fel.omo.entity.model;

public record TruckModel(
        String name,
        int loadCapacity,
        int axleCount
) implements VehicleModel {}
