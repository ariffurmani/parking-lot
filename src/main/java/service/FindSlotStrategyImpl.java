package service;

import model.*;

public class FindSlotStrategyImpl implements FindSlotStrategy {

    @Override
    public ParkingSlot findSlot(VehicleType vehicleType, ParkingLot parkingLot) {
        for (ParkingFloor floors : parkingLot.getParkingFloors()) {
            for (ParkingSlot slot : floors.getParkingSlots()) {
                if (slot.getVehicleType().equals(vehicleType) && slot.getParkingSlotStatus().equals(Status.AVAILABLE)) {
                    slot.setParkingSlotStatus(Status.FILLED); // Mark the slot as occupied
                    return slot; // Return the ID of the found slot
                }
            }
        }
        return null;
    }
}
