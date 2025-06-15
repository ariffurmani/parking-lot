package model;

public class ParkingSlot {
    private String slotId;
    private String slotNumber;
    private VehicleType vehicleType;
    private Status parkingSlotStatus;

    public ParkingSlot(String slotId, VehicleType vehicleType) {
        this.slotId = slotId;
        this.vehicleType = vehicleType;
        this.isOccupied = false;
    }

    public String getSlotId() {
        return slotId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void occupy() {
        this.isOccupied = true;
    }

    public void vacate() {
        this.isOccupied = false;
    }
}
