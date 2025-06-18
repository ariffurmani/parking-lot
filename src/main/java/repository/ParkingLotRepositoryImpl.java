package repository;

import model.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Optional;
import java.util.List;

public class ParkingLotRepositoryImpl implements ParkingLotRepository {

    HashMap<Integer, ParkingLot> parkingLotHashMap;

    public  ParkingLotRepositoryImpl() {
        this.parkingLotHashMap = new HashMap<>();
        addDummyData();
    }

    private void addDummyData() {
        // Method to add dummy data for testing purposes
        // This can be used to populate the parkingLotHashMap with some initial data
        List<VehicleType> supportedVehicleTypes = Arrays.asList(VehicleType.values());
        List<ParkingSlot> parkingSlots = Arrays.asList(
                new ParkingSlot( VehicleType.FOUR_WHEELER, "PS1"),
                new ParkingSlot( VehicleType.FOUR_WHEELER, "PS2"),
                new ParkingSlot( VehicleType.FOUR_WHEELER, "PS3")
        );
        List<ParkingFloor> parkingFloors = Arrays.asList(
                (new ParkingFloor(1, 3, supportedVehicleTypes, parkingSlots)),
                (new ParkingFloor(2, 3, supportedVehicleTypes, parkingSlots)));

        parkingLotHashMap.put(1, new ParkingLot(50, supportedVehicleTypes,
                Status.AVAILABLE, null, parkingFloors));
    }

    @Override
    public Optional<ParkingLot> findById(int id) {
    // Implementation to find a parking lot by its ID
        if (parkingLotHashMap.containsKey(id)) {
            return Optional.of(parkingLotHashMap.get(id));
        } else {
            return Optional.empty();
        }
    }
}
