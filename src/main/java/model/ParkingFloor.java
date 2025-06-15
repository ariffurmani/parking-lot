package model;

import java.util.List;

public class ParkingFloor {
    private int floorNumber;
    private int totalSlots;
    private int availableSlots;
    private List<ParkingSlot> parkingSlots;
    private Status parkingFloorStatus;
    private List<VehicleType> supportedVehicleTypes;


    public ParkingFloor(int floorNumber, int totalSlots, List<VehicleType> supportedVehicleTypes) {
        this.floorNumber = floorNumber;
        this.totalSlots = totalSlots;
        this.availableSlots = totalSlots; // Initially all slots are available
        this.supportedVehicleTypes = supportedVehicleTypes;
        this.parkingFloorStatus = Status.ACTIVE; // Default status
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public int getTotalSlots() {
        return totalSlots;
    }

    public int getAvailableSlots() {
        return availableSlots;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public Status getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public List<VehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setParkingFloorStatus(Status parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public void parkVehicle() {
        if (availableSlots > 0) {
            availableSlots--;
        } else {
            throw new IllegalStateException("No available slots on this floor.");
        }
    }

    public void removeVehicle() {
        if (availableSlots < totalSlots) {
            availableSlots++;
        } else {
            throw new IllegalStateException("All slots are already empty on this floor.");
        }
    }
}
