package model;

import service.FindSlotStrategy;
import service.FindSlotStrategyImpl;

import java.util.List;

public class ParkingLot {
    private String id;
    private int capacity;
    private List<VehicleType> supportedVehicleTypes;
    private Status status;
    private List<Gate> gates;
    private List<ParkingFloor> parkingFloors;
    private FindSlotStrategy findSlotStrategy = new FindSlotStrategyImpl();

    public ParkingLot(String id, int capacity, List<VehicleType> supportedVehicleTypes, Status status, List<Gate> gates, List<ParkingFloor> parkingFloors) {
        this.id = id;
        this.capacity = capacity;
        this.supportedVehicleTypes = supportedVehicleTypes;
        this.status = status;
        this.gates = gates;
        this.parkingFloors = parkingFloors;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<VehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<VehicleType> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }
}
