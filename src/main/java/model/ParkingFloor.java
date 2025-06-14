package model;

public class ParkingFloor {
    private int floorNumber;
    private int totalSlots;
    private int availableSlots;

    public ParkingFloor(int floorNumber, int totalSlots) {
        this.floorNumber = floorNumber;
        this.totalSlots = totalSlots;
        this.availableSlots = totalSlots; // Initially all slots are available
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
