package Projects.ParkingLot.Vehicle;

import Projects.ParkingLot.Enums.VehicleTypes;

public abstract class Vehicle {
    private String lisenseNumber;
    private VehicleTypes type;
    private ParingTicket ticket;

    public Vehicle(VehicleTypes type) {
        this.type = type;
    }

    public String getLisenseNumber() {
        return lisenseNumber;
    }

    public void setLisenseNumber(String lisenseNumber) {
        this.lisenseNumber = lisenseNumber;
    }

    public VehicleTypes getType() {
        return type;
    }

    public void setType(VehicleTypes type) {
        this.type = type;
    }

    public ParingTicket getTicket() {
        return ticket;
    }

    public void setTicket(ParingTicket ticket) {
        this.ticket = ticket;
    }

    public void assignTicket(ParkingTicket ticket) {
        this.ticket = ticket;
    }
}
