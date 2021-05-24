import dbConnection.writer.WriteDbAircraft;
import dbConnection.writer.WriteDbFlights;
import dbConnection.writer.WriteDbPilots;
import entity.Aircraft;
import entity.Flights;
import entity.Pilots;
import io.reader.AircraftDataFileReader;
import io.reader.FlightsDataFileReader;
import io.reader.PilotsDataFileReader;

import java.util.List;

import static io.IoConstants.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Старт записи в таблицу [pilots]...");

        PilotsDataFileReader dataFileReader = new PilotsDataFileReader(PILOTS_SOURSE_FILE);
        List<Pilots> pilotsList = dataFileReader.read();

        System.out.println("Запись в таблицу [pilots] завершена.");

        for (Pilots p : pilotsList) {
            WriteDbPilots.Insert(p);
        }

        System.out.println("Старт записи в таблицу [aircraft]...");

        AircraftDataFileReader dataFileReader1 = new AircraftDataFileReader(AIRCRAFT_SOURSE_FILE);
        List<Aircraft> aircraftList = dataFileReader1.read();

        System.out.println("Запись в таблицу [aircraft] завершена.");

        for (Aircraft air:aircraftList){
            WriteDbAircraft.Insert(air);
        }

        System.out.println("Старт записи в таблицу [flights]...");

        FlightsDataFileReader dataFileReader2 = new FlightsDataFileReader(FLIGHTS_SOURSE_FILE);
        List<Flights> flightsList = dataFileReader2.read();

        System.out.println("Запись в таблицу [flights] завершена.");

        for (Flights fli:flightsList){
            WriteDbFlights.Insert(fli);
        }
    }

}
