package model;

public class Vehicle {
    private String licensePlate;
    private VehicleType vehicleType;
    private Ticket ticket;

    public Vehicle(String licensePlate, VehicleType vehicleType, Ticket ticket) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
        this.ticket = ticket;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Ticket getTicket() {
        return ticket;
    }
}
