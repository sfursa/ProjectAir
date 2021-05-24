package io.reader;

import Exeptions.EmptyFileExceptions;
import entity.Aircraft;
import util.AircraftUtil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AircraftDataFileReader {
    private String fileAircraft;

    public AircraftDataFileReader(String fileAircraft) {
        this.fileAircraft = fileAircraft;
    }

    public List<Aircraft> read() {
        List<Aircraft> aircrafts = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileAircraft))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line == null || line.isEmpty()) {
                    throw new EmptyFileExceptions("ОШИБКА! Файл не существует или пустой.");
                }
                Aircraft aircraft = AircraftUtil.toObject(line);
                aircrafts.add(aircraft);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (EmptyFileExceptions emptyFileExceptions) {
            emptyFileExceptions.printStackTrace();
        }
        return aircrafts;
    }
}
