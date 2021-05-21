package entity;

public class Aircraft {
    private int plane_id;
    private String brand;
    private String model;
    private int passenger_capacity;
    private int board;

    public Aircraft(int plane_id, String brand, String model, int passenger_capacity, int board) {
        this.plane_id = plane_id;
        this.brand = brand;
        this.model = model;
        this.passenger_capacity = passenger_capacity;
        this.board = board;
    }

    public int getPlane_id() {
        return plane_id;
    }

    public void setPlane_id(int plane_id) {
        this.plane_id = plane_id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPassenger_capacity() {
        return passenger_capacity;
    }

    public void setPassenger_capacity(int passenger_capacity) {
        this.passenger_capacity = passenger_capacity;
    }

    public int getBoard() {
        return board;
    }

    public void setBoard(int board) {
        this.board = board;
    }
}
