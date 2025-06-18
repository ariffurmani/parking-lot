package model;

public class ParkingSlot extends BaseModel {
    private String slotNumber;
    private VehicleType vehicleType;
    private Status parkingSlotStatus;

    public ParkingSlot(VehicleType vehicleType, String slotNumber) {
        this.vehicleType = vehicleType;
        this.parkingSlotStatus = Status.AVAILABLE;
        this.slotNumber = slotNumber;
    }

    public String getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(String slotNumber) {
        this.slotNumber = slotNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Status getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(Status parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }
}
