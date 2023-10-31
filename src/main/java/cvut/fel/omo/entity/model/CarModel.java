package cvut.fel.omo.entity.model;

import cvut.fel.omo.entity.model.enums.ECarBodyType;

public record CarModel(
        String name,
        ECarBodyType bodyType,
        int passengers
) implements VehicleModel {}
