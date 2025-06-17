package service;

import model.ParkingLot;

import java.util.HashMap;
import java.util.Optional;

public class ParkingLotRepositoryImpl implements ParkingLotRepository{

    HashMap<Integer, ParkingLot> parkingLotHashMap = new HashMap<>();

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
