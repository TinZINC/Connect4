public class Player {
    //properties
    public String name;

    public String tokenn;

    //constructor
    public Player(String name, String tokenn) {
         this.tokenn = tokenn;
        this.name = name;
    }


    //methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTokenn() {
        return tokenn;
    }

    public void setTokenn(String tokenn) {
        this.tokenn = tokenn;
    }
}
