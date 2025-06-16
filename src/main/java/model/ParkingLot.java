package model;

import service.FindSlotStrategy;
import service.FindSlotStrategyImpl;

import java.util.List;

public class ParkingLot extends BaseModel {
    private int capacity;
    private List<VehicleType> supportedVehicleTypes;
    private Status status;
    private List<Gate> gates;
    private List<ParkingFloor> parkingFloors;
    private FindSlotStrategy findSlotStrategy = new FindSlotStrategyImpl();

    public ParkingLot(int capacity, List<VehicleType> supportedVehicleTypes, Status status, List<Gate> gates, List<ParkingFloor> parkingFloors) {
        this.capacity = capacity;
        this.supportedVehicleTypes = supportedVehicleTypes;
        this.status = status;
        this.gates = gates;
        this.parkingFloors = parkingFloors;
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
