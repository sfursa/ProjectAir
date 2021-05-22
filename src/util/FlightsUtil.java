package util;

import entity.Flights;

import static io.IoConstants.DELIMITER;

public class FlightsUtil {

    public static Flights toObject(String line) {

        String[] flightsArr = line.split(DELIMITER);

        int id = Integer.parseInt(flightsArr[0]);
        int plane_id = Integer.parseInt(flightsArr[1]);
        int pilot_id = Integer.parseInt(flightsArr[2]);
        String flight_date = flightsArr[3];
        String flight_time = flightsArr[4];
        String flight_number = flightsArr[5];

        return new Flights(id, plane_id, pilot_id, flight_date, flight_time, flight_number);
    }
}
