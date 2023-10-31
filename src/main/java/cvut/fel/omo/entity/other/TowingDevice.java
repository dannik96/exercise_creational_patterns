package cvut.fel.omo.entity.other;

public record TowingDevice(
        String serialNumber,
        int towingWeight,
        int axialLoad,
        boolean hasAirConnection,
        boolean hasExtendedConnections
) { }
