package io;

public class IoConstants {
    public static final String DELIMITER =";";

    public static final String PILOTS_SOURSE_FILE = "C:\\Users\\Asus\\IdeaProjects\\ProjectAir1\\src\\db\\data\\pilots.csv";
    public static final String AIRCRAFT_SOURSE_FILE = "C:\\Users\\Asus\\IdeaProjects\\ProjectAir1\\src\\db\\data\\aircraft.csv";
    public static final String FLIGHTS_SOURSE_FILE = "C:\\Users\\Asus\\IdeaProjects\\ProjectAir1\\src\\db\\data\\flights.csv";



    public static final String INTO_FLIGHTS = "INSERT into flights(id,plane_id,pilot_id,flight_date,flight_time,flight_number)values(?,?,?,?,?,?)";
}
