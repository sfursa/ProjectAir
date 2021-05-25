package util;

import entity.JoinedDataItem;
import static io.IoConstants.DELIMITER;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JoinedDataItemUtil {
    public static List<JoinedDataItem> parseResultSet(ResultSet resultSet) throws SQLException {
        List<JoinedDataItem> items = new ArrayList<>();

        while (resultSet.next()) {
            int flight_number = resultSet.getInt("flight_number");
            String flight_date = resultSet.getString("flight_date");
            String flight_time = resultSet.getString("flight_time");
            int board = resultSet.getInt("board");
            String brand = resultSet.getString("brand");
            String model = resultSet.getString("model");
            int passenger_capacity = resultSet.getInt("passenger_capacity");
            String last_name = resultSet.getString("last_name");
            String first_name = resultSet.getString("first_name");
            String nickname = resultSet.getString("nickname");
            String rank = resultSet.getString("rank");

            JoinedDataItem item = new JoinedDataItem(flight_number, flight_date, flight_time, board, brand, model,
                    passenger_capacity, last_name, first_name, nickname, rank);
            items.add(item);
        }
        return items;
    }
    public static String makeString(JoinedDataItem item) {
        return item.getFlight_number() + DELIMITER
                + item.getFlight_date() + DELIMITER
                + item.getFlight_time() + DELIMITER
                + item.getBoard() + DELIMITER
                + item.getBrand() + " "
                + item.getModel() + DELIMITER
                + item.getPassenger_capacity() + DELIMITER
                + item.getLast_name() + " "
                + item.getFirst_name().charAt(0) + "." + DELIMITER
                + item.getNickname() + " " + "("
                + item.getRank() + ")" + "\n";


    }
}
