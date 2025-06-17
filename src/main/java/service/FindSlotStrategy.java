package service;

import model.ParkingLot;
import model.ParkingSlot;
import model.VehicleType;

public interface FindSlotStrategy {
    /**
     * Finds a parking slot based on the given vehicle type.
     *
     * @param vehicleType the type of vehicle for which to find a slot
     * @return the ID of the found parking slot, or null if no slot is available
     */
    ParkingSlot findSlot(VehicleType vehicleType, ParkingLot parkingLot);

}
