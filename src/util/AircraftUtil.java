package util;

import entity.Aircraft;

import static io.IoConstants.DELIMITER;

public class AircraftUtil {
    public static Aircraft toObject(String line){

    String[] aircraftArr = line.split(DELIMITER);

    int plane_id = Integer.parseInt(aircraftArr[0]);
    String brand = aircraftArr[1];
    String model = aircraftArr[2];
    int passenger_capacity = Integer.parseInt(aircraftArr[3]);
    int board = Integer.parseInt(aircraftArr[4]);

    return new Aircraft(plane_id, brand,model, passenger_capacity, board);
    }
}
