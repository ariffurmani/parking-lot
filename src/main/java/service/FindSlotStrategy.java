package service;

public interface FindSlotStrategy {
    /**
     * Finds a parking slot based on the given vehicle type.
     *
     * @param vehicleType the type of vehicle for which to find a slot
     * @return the ID of the found parking slot, or null if no slot is available
     */
    String findSlot(String vehicleType);

    /**
     * Checks if a parking slot is available for the given vehicle type.
     *
     * @param vehicleType the type of vehicle to check availability for
     * @return true if a slot is available, false otherwise
     */
    boolean isSlotAvailable(String vehicleType);
}
