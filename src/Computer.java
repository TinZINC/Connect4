public class Computer extends Player {
    //properties
    private int token;

    //constructor
    public Computer(String token) {
        super("computer", token);
    }

    //methods

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public int[] determineMove(){
        int row = (int)(Math.random() * 8);
        int col = (int)(Math.random() * 8);

        int[] move =  {row,col};

        return move;
    };

}
