package Projects.ParkingLot.Controllers;

import Projects.ParkingLot.Models.ParkingLot;
import Projects.ParkingLot.Service.ParkingLotService;
import Projects.ParkingLot.dtos.CreateParkingLotRequestDto;
import Projects.ParkingLot.dtos.CreateParkingLotResponseDto;
import Projects.ParkingLot.dtos.ResponseDto;

public class ParkingLotController {
    private ParkingLotService parkingLotService = new ParkingLotService();

    public ResponseDto<CreateParkingLotResponseDto> createParkingLot(CreateParkingLotRequestDto request) {
        ParkingLot parkingLot = parkingLotService.createParkingLot(request.getAddress());

        CreateParkingLotResponseDto response = new CreateParkingLotResponseDto();
        response.setParkingLot(parkingLot);

        ResponseDto<CreateParkingLotResponseDto> baseResponse = new ResponseDto<>();
        baseResponse.setStatus("Success");
        baseResponse.setData(response);

        return baseResponse;
    }



// dto -> Data Transfer Objects
// -request params as well as Response
// Controllers should be lightweight
// {
//   status:
//   data: {
//      parkingLot: ,
//      daysSinceExistence: ,
//   }
// }

}
