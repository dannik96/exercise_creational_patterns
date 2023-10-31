package cvut.fel.omo.patterns.pools;

import cvut.fel.omo.entity.other.VehicleCommunicationInterface;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VCIPool {
    private static VCIPool instance;
    private static final int DEFAULT_POOL_SIZE = 5;

    private List<VehicleCommunicationInterface> vciList;
    private Set<String> usedVciIds = new HashSet<>();

    private VCIPool(int size){

    }

    private static void initInstance(){
        instance = new VCIPool(DEFAULT_POOL_SIZE);
    }

    public static VCIPool getInstance(){
        return instance;
    }

    public VehicleCommunicationInterface acquire(){
        return null;
    }

    public void release(VehicleCommunicationInterface vci){

    }
}
