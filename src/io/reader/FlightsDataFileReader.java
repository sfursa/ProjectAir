package io.reader;

import Exeptions.EmptyFileExceptions;
import entity.Flights;
import util.FlightsUtil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FlightsDataFileReader {
    private String fileFlights;

    public FlightsDataFileReader(String fileFlights) {
        this.fileFlights = fileFlights;
    }

    public List<Flights> read() {
        List<Flights> flight = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileFlights))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (line == null || line.isEmpty()) {
                    throw new EmptyFileExceptions("ОШИБКА! Файл не существует или пустой.");
                }
                Flights flights = FlightsUtil.toObject(line);
                flight.add(flights);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (EmptyFileExceptions emptyFileExceptions) {
            emptyFileExceptions.printStackTrace();
        }
        return flight;
    }
}
