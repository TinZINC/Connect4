public class Board {
    //properties
    private int size = 7;
    private String[][] grid = new String[size][size];


    //constructor
    public Board() {
        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++) {
                grid[row][col] = "_";
            }
        }
    }

    //methods

    public String[][] getGrid() {
        return grid;
    }

    public void setGrid(String[][] grid) {
        this.grid = grid;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public void printBoard() {
        System.out.println("Updated board:");
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid.length; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }
    }

    public void makeMove(int row, int col, String token) {
        grid[row][col] = token;
    }

    public boolean checkWin() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid.length; col++) {
                if(grid[row][col] == "x"){
                    if(grid[row][col + 1] == "x") {
                        if(grid[row][col + 2] == "x") {
                            if(grid[row][col + 3] == "x") {
                                if(grid[row][col + 4] == "x") {
                                    return true;
                                }
                            }
                        }
                    }
                }
                if(grid[row][col] == "o"){
                    if(grid[row][col + 1] == "o") {
                        if(grid[row][col + 2] == "o") {
                            if(grid[row][col + 3] == "o") {
                                if(grid[row][col + 4] == "o") {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println();
        }
        return false;
    };
}


