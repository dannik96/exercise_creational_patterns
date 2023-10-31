package cvut.fel.omo.entity.other;

import java.time.Instant;

public class VehicleCommunicationInterface {
    private final String id;

    public VehicleCommunicationInterface(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void logAction(String message){
        System.out.printf(
                "%s: VCI[%s]: %s%n",
                Instant.now().toString(),
                id,
                message
        );
    }
}
