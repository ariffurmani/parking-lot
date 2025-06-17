package repository;

import model.Vehicle;

import java.util.List;
import java.util.Optional;

public interface VehicleRepository {
     Optional<Vehicle> findByVehicleNumber(String id);
     List<Vehicle> findAll();
     void save(Vehicle vehicle);
}
