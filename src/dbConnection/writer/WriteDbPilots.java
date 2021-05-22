package dbConnection.writer;

import dbConnection.DbConnection;
import entity.Pilots;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class WriteDbPilots {
    public static final String INSERT = "INSERT INTO pilots (pilot_id, first_name, last_name, rank, nickname) VALUES(?,?,?,?,?)";

    public static void insert(List<Pilots> pilots) {
        for (Pilots pilot : pilots) {
        }
    }
    public static void Insert(Pilots pilots){
        Connection connection = DbConnection.getConnection();

        try(PreparedStatement statement = connection.prepareStatement(INSERT)) {

            statement.setInt(1, pilots.getPilot_id());
            statement.setString(2, pilots.getFirst_name());
            statement.setString(3, pilots.getLast_name());
            statement.setString(4, String.valueOf(pilots.getRank()));
            statement.setString(5, pilots.getNickname());

            statement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
