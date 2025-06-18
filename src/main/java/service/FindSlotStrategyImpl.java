package service;

import model.*;

public class FindSlotStrategyImpl implements FindSlotStrategy {

    @Override
    public ParkingSlot findSlot(VehicleType vehicleType, ParkingLot parkingLot) {
        System.out.println("Searching for a slot for vehicle type: " + vehicleType);
        for (ParkingFloor floors : parkingLot.getParkingFloors()) {
            System.out.println("Checking floor: " + floors.getFloorNumber());
            for (ParkingSlot slot : floors.getParkingSlots()) {
                System.out.println("Checking slot: " + slot.getSlotNumber() + " of type: " + slot.getVehicleType() + " with status: " + slot.getParkingSlotStatus());
                if (slot.getVehicleType().equals(vehicleType) && slot.getParkingSlotStatus().equals(Status.AVAILABLE)) {
                    System.out.println("Found available slot: " + slot.getSlotNumber());
                    slot.setParkingSlotStatus(Status.FILLED); // Mark the slot as occupied
                    return slot; // Return the ID of the found slot
                }
            }
        }
        return null;
    }
}
