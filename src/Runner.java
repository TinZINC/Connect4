import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        //instances
        Scanner sc = new Scanner(System.in);
        Board b = new Board();
        Human h = new Human("Tenzin", "X");
        Computer c = new Computer("Z");

        //game loop
        while(!b.checkWin()) {

            //variables
            boolean legalRow = false;
            boolean legalCol = false;
            int moveRow = -1;
            int moveCol = -1;

            //human move: validate input and move
            while(!legalRow || !legalCol) {

                //row move
                System.out.println("Enter row to move:");
                //hasNextInt will return true if user input is an int
                if (sc.hasNextInt()) {
                    moveRow = sc.nextInt();
                    legalRow = true;
                } else {
                    System.out.println("Enter a legal row!");
                    sc.next();  //very important, resets the input from the "bad" one
                }






    }
};