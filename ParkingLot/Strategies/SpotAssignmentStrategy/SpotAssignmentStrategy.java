package Projects.ParkingLot.Strategies.SpotAssignmentStrategy;

import Projects.ParkingLot.Models.Gate;
import Projects.ParkingLot.Models.ParkingLot;
import Projects.ParkingLot.Models.ParkingSpot;
import Projects.ParkingLot.Models.SpotType;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(ParkingLot parkingLot, SpotType spotType, Gate entryGate);
}
