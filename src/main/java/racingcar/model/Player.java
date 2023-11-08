package racingcar.model;

public class Player {

    private String name;
    private String racing;

    public Player(String name) {
        this.name = name;
        this.racing = "";
    }

    public String getName() {
        return name;
    }

    public String getRacing() {
        return racing;
    }

    public void setRacing(String racing) {
        this.racing = racing;
    }

    public String toString() {
        return String.format("%s : %s", this.name, this.racing);
    }
}
