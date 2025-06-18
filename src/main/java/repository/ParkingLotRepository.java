package repository;

import model.ParkingLot;

import java.util.Optional;

public interface ParkingLotRepository {
    public Optional<ParkingLot> findById(int id);
}
