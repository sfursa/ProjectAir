package dbConnection.writer;

import dbConnection.DbConnection;
import entity.Flights;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import static io.IoConstants.INTO_FLIGHTS;

public class WriteDbFlights {
    public static final String INSERT = INTO_FLIGHTS;

    public static void InsertToList(List<Flights> flight){
        for(Flights flights : flight){

        }
    }

    public static void Insert (Flights flights) {
        Connection connection = DbConnection.getConnection();
        try(PreparedStatement statement= connection.prepareStatement(INSERT)){
            statement.setInt(1, flights.getId());
            statement.setInt(2, flights.getPlane_id());
            statement.setInt(3, flights.getPilot_id());
            statement.setString(4, String.valueOf(flights.getFlight_date()));
            statement.setString(5, String.valueOf(flights.getFlight_time()));
            statement.setString(6, String.valueOf(flights.getFlight_number()));

            statement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
