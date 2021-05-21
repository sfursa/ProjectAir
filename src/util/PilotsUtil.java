package util;

import entity.Pilots;
import static io.IoConstants.DELIMITER;

public class PilotsUtil {
    public static Pilots toObject(String line) {

        String[] pilotsArr = line.split(DELIMITER);

        int pilot_id = Integer.parseInt(pilotsArr[0]);
        String first_name = pilotsArr[1];
        String last_name = pilotsArr[2];
        String rank = pilotsArr[3];
        String nickname = pilotsArr[4];
        return new Pilots(pilot_id, first_name, last_name, rank, nickname);
    }
}
