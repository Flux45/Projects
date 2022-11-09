package Projects.ParkingLot.Strategies.SpotAssignmentStrategy;

import Projects.ParkingLot.Models.*;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy {

    @Override
    public ParkingSpot assignSpot(ParkingLot parkingLot, SpotType spotType, Gate entryGate) {
        for(ParkingFloor parkingFloor: parkingLot.getParkingFloors()) {
            for(ParkingSpot parkingSpot: parkingFloor.getParkingSpots()) {
                if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE)
                && parkingSpot.getVehicleType().equals(spotType)) {
                    return parkingSpot;
                }
            }
        }
        return null;
    }
}
