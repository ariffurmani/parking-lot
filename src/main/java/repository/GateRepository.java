package repository;

import model.Gate;

import java.util.Optional;

public interface GateRepository {

    public Optional<Gate> findById(String id);
}
