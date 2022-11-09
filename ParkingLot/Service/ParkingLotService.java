package Projects.ParkingLot.Service;

import Projects.ParkingLot.Models.ParkingLot;
import Projects.ParkingLot.Repositories.ParkingLotRepository;

public class ParkingLotService {
    private ParkingLotRepository parkingLotRepository = new ParkingLotRepository();

    public ParkingLot createParkingLot(String address) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setAddress(address);
        ParkingLot savedParkingLot = ParkingLotRepository.save(parkingLot);
        return savedParkingLot;
    }
}


// UserController
// registerUser() {
//  userService.registerUser()
// }
// MCController
// registerMasterclass() {
//  if (!userAccount) {]
//      userService.createAccount();
//  }
//  MCService.registerUser();
// }