package entity;

public class Flights {
    private int id;
    private int plane_id;
    private int pilot_id;
    private String flight_date;
    private String flight_time;
    private String flight_number;

    public Flights(int id, int plane_id, int pilot_id, String flight_date, String flight_time, String flight_number) {
        this.id = id;
        this.plane_id = plane_id;
        this.pilot_id = pilot_id;
        this.flight_date = flight_date;
        this.flight_time = flight_time;
        this.flight_number = flight_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlane_id() {
        return plane_id;
    }

    public void setPlane_id(int plane_id) {
        this.plane_id = plane_id;
    }

    public int getPilot_id() {
        return pilot_id;
    }

    public void setPilot_id(int pilot_id) {
        this.pilot_id = pilot_id;
    }

    public String getFlight_date() {
        return flight_date;
    }

    public void setFlight_date(String flight_date) {
        this.flight_date = flight_date;
    }

    public String getFlight_time() {
        return flight_time;
    }

    public void setFlight_time(String flight_time) {
        this.flight_time = flight_time;
    }

    public String getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }
}
