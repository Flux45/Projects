package Projects.ParkingLot.Classes;

import Projects.ParkingLot.Enums.ParkingSlotTypes;

public abstract class ParkingSlot {
    private String number;
    private Boolean free;
    private ParkingSlotTypes type;
    private Vehicle vehicle;

    public boolean isfree() {
        return false;
    }

    public ParkingSlot(ParkingSlotTypes type) {
        this.type = type;
    }

    public boolean assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        free = false;

        return true;
    }

    public boolean removeVehicle() {
        this.vehicle = null;
        free = true;

        return true;
    }
}
