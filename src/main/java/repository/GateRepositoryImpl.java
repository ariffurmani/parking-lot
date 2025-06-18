package repository;

import model.Gate;
import model.GateStatus;
import model.GateType;
import model.Operator;

import java.util.HashMap;
import java.util.Optional;

public class GateRepositoryImpl implements GateRepository {

    HashMap<String, Gate> gates;

    public GateRepositoryImpl() {
        this.gates = new HashMap<>();
        addDummyData(); // Adding some dummy data for testing purposes
    }

    private void addDummyData() {
        gates.put("gate1", new Gate(GateType.ENTRY, new Operator("Operator 1"), GateStatus.OPEN));
        gates.put("gate2", new Gate(GateType.EXIT, new Operator("Operator 2"), GateStatus.OPEN));
    }
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
