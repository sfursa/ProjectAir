import dbConnection.writer.WriteDbPilots;
import entity.Pilots;
import io.reader.PilotsDataFileReader;

import java.util.List;

import static io.IoConstants.PILOTS_SOURSE_FILE;

public class Main {

    public static void main(String[] args) {
        System.out.println("Старт записи в таблицу [pilots]...");

        PilotsDataFileReader dataFileReader = new PilotsDataFileReader(PILOTS_SOURSE_FILE);
        List<Pilots> pilotsList = dataFileReader.read();

        System.out.println("Запись в таблицу [pilots] завершена.");

        for (Pilots p : pilotsList) {
            WriteDbPilots.Insert(p);
        }
    }
}
