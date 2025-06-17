package service;

import model.ParkingLot;

import java.util.HashMap;
import java.util.Optional;

public interface ParkingLotRepository {
    public Optional<ParkingLot> findById(int id);
}
