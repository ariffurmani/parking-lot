package repository;

import model.Gate;

import java.util.HashMap;
import java.util.Optional;

public class GateRepositoryImpl implements GateRepository {

    HashMap<String, Gate> gates = new HashMap<String, Gate>();
    @Override
    public Optional<Gate> findById(String id) {
        // Implementation to find a gate by its ID
        if (gates.containsKey(id)) {
            return Optional.of(gates.get(id));
        } else {
            return Optional.empty();
        }
    }
}
