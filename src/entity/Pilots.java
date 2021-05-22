package entity;

public class Pilots {
    private int pilot_id;
    private String first_name;
    private String last_name;
    private Rank rank;
    private String nickname;

    public Pilots(int pilot_id, String first_name, String last_name, Rank rank, String nickname) {
        this.pilot_id = pilot_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.rank = rank;
        this.nickname = nickname;
    }

    public int getPilot_id() {
        return pilot_id;
    }

    public void setPilot_id(int pilot_id) {
        this.pilot_id = pilot_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
