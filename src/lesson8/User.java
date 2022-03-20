package lesson8;

public class User {
    private String name;
    private String paathToAvatar;
    private int rate;

    public User() {
    }

    public User(String name, String paathToAvatar, int rate) {
        this.name = name;
        this.paathToAvatar = paathToAvatar;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaathToAvatar() {
        return paathToAvatar;
    }

    public void setPaathToAvatar(String paathToAvatar) {
        this.paathToAvatar = paathToAvatar;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
