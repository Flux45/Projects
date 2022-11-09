package Projects.ParkingLot.Models;

public class ElectricParkingSpot extends BaseModel {

    private ElectricCharger electricCharger;
    private ParkingSpot parkingSpot;

    public ElectricParkingSpot(ElectricCharger electricCharger) {
        this.electricCharger = electricCharger;
    }

}
