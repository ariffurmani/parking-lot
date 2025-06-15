package repository;

import model.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class VehicleRepositoryImpl implements VehicleRepository {

    HashMap<String, Vehicle> map = new HashMap<>();

    @Override
    public Optional<Vehicle> findById(String id) {
        // Implementation to find a vehicle by its ID
        return Optional.empty(); // Placeholder for actual implementation
    }

    @Override
    public void save(Vehicle vehicle) {
        // Implementation to save a vehicle
        // Placeholder for actual implementation
    }

//    @Override
//    public void delete(String id) {
//        // Implementation to delete a vehicle by its ID
//        // Placeholder for actual implementation
//    }

    @Override
    public List<Vehicle> findAll() {
        // Implementation to find all vehicles
        return new ArrayList<>(map.values()); // Placeholder for actual implementation
    }


}
