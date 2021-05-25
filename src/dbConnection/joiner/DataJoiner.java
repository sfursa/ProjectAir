package dbConnection.joiner;

import dbConnection.DbConnection;
import entity.JoinedDataItem;
import util.JoinedDataItemUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DataJoiner {
    public static final String QUERY = "SELECT flights.flight_number, flights.flight_date, flights.flight_time, " +
            "aircraft.board, aircraft.brand, aircraft.model, aircraft.passenger_capacity, pilots.last_name, " +
            "pilots.first_name, pilots.nickname, pilots.rank " +
            "FROM flights INNER JOIN aircraft ON flights.plane_id = aircraft.plane_id " +
            "INNER JOIN pilots ON flights.pilot_id = pilots.pilot_id;";

//    private static DbConnection DbConnection;

    public static List<JoinedDataItem> getJoinedData() {
        List<JoinedDataItem> result = null;

        Connection connection = DbConnection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(QUERY)) {
            ResultSet resultSet =statement.executeQuery();
            result = JoinedDataItemUtil.parseResultSet(resultSet);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }


}
