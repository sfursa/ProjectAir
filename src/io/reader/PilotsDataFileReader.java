package io.reader;

import Exeptions.EmptyFileExceptions;
import entity.Pilots;
import util.PilotsUtil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PilotsDataFileReader {
    private String filePilots;

    public PilotsDataFileReader (String filePilots){
        this.filePilots = filePilots;
    }

    public List<Pilots> read() {
        List<Pilots> pilots = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePilots))) {

            String line;
            while ((line = reader.readLine()) != null){
                if (line == null || line.isEmpty()) {
                    throw new EmptyFileExceptions("ОШИБКА! Файл не существует или пустой.");
                }
                Pilots pilot = PilotsUtil.toObject(line);
                pilots.add(pilot);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (EmptyFileExceptions emptyFileExceptions) {
            emptyFileExceptions.printStackTrace();
        }

        return pilots;
    }

}
