public class Human extends Player{
    //properties
    private String token;

    //constructor
    public Human(String name, String token) {
        super(name, token);
    }

    //methods
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
