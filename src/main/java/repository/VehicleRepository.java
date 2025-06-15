package repository;

import model.Vehicle;

import java.util.List;
import java.util.Optional;

public interface VehicleRepository {
    // Define methods for vehicle repository operations
    // For example:
     Optional<Vehicle> findById(String id);
     List<Vehicle> findAll();
     void save(Vehicle vehicle);
//     void deleteById(String id);
}
