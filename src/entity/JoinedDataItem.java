package entity;

public class JoinedDataItem {

    private int flight_number;
    private String flight_date;
    private String flight_time;
    private int board;
    private String brand;
    private String model;
    private int passenger_capacity;
    private String last_name;
    private String first_name;
    private String nickname;
    private String rank;

    public JoinedDataItem(int flight_number, String flight_date, String flight_time, int board, String brand,
                          String model, int passenger_capacity, String last_name, String first_name, String nickname,
                          String rank) {
        this.flight_number = flight_number;
        this.flight_date = flight_date;
        this.flight_time = flight_time;
        this.board = board;
        this.brand = brand;
        this.model = model;
        this.passenger_capacity = passenger_capacity;
        this.last_name = last_name;
        this.first_name = first_name;
        this.nickname = nickname;
        this.rank = rank;
    }

    public int getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(int flight_number) {
        this.flight_number = flight_number;
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

    public int getBoard() {
        return board;
    }

    public void setBoard(int board) {
        this.board = board;
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

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Номер рейса: " + flight_number + ";" +
                " Дата рейса: " + flight_date + ";" +
                " Время рейса: " + flight_time + ";" +
                " Бортовой номер: " + board + ";" +
                " Марка и модель самолеета: " + brand + " " + model + ";" +
                " Вместимость пассажиров: " + passenger_capacity + ";" +
                " Фамилия и имя пилота: " + last_name + " " + first_name.charAt(0) + "." + ";" +
                " Код пилота и его ранг: " + nickname + " (" +  rank + ")" + "\n";
    }
}
