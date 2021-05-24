package dbConnection.writer;

import dbConnection.DbConnection;
import entity.Aircraft;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class WriteDbAircraft {
    public static final String INSERT = "INSERT INTO aircraft (plane_id, brand, model, passenger_capacity, board) VALUES(?,?,?,?,?)";

    public static void insert(List<Aircraft> aircrafts) {
        for (Aircraft aircraft : aircrafts) {
        }
    }

    public static void Insert(Aircraft aircraft) {
        Connection connection = DbConnection.getConnection();

        try(PreparedStatement statement=connection.prepareStatement(INSERT)){
            statement.setInt(1, aircraft.getPlane_id());
            statement.setString(2, aircraft.getBrand());
            statement.setString(3, aircraft.getModel());
            statement.setInt(4, aircraft.getPassenger_capacity());
            statement.setInt(5,aircraft.getBoard());

            statement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
