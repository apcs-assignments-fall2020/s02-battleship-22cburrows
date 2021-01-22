import java.util.Arrays;
public class MyMain {
    // This method returns true/false if there 
    // was a boat the specified coordinates. This
    // method also prints out an appropriate message
    public static boolean hit(boolean[][] board, int row, int col) { 
        if (board[row][col] == true){
            System.out.println("You got a hit!");
            return true;
        }
        else{
            System.out.println("You missed! Try again.");
            return false;
        }
    }

    // Places a boat onto the board
    // The top-left piece of the board is located at (row, col)
    // The remaining pieces are placed in the direction given
    // by the direction input
    public static boolean[][] placeBoat(boolean[][] board, String direction, int boatLength, int row, int col) { 
        if (direction.equals("down")){
            for (int i = 0; i < boatLength; i++){
                board[row + i][col] = true;
            }
        }
        else{
            for (int i = 0; i < boatLength; i++){
                board[row][col + i] = true;
            }
        }
        return board;
    }

    // Returns true if the every row in the 2D array
    // is in both alphabetical order and in order of 
    // increasing length
    // You may assume that all Strings are lowercase 
    public static boolean inOrder(String[][] words) { 
        int count = 0;
        for (int i = 0; i < words.length; i++){
            for (int j = 0; j < words[0].length-1; j++){
                String first = words[i][j];
                String second = words[i][j+1];
                if ((first.compareTo(second) < 0) && (first.length() < second.length())){
                    count++;
                }
            }
        }
        if (count == ((words[0].length - 1)*(words.length))){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        boolean[][] board = new boolean[6][7];
        int row = 3;
        int col = 2;

        hit(board, row, col);
        //

        boolean[][] board2 = new boolean[5][8];
        String direction = "down";
        int boatLength = 2;
        int row2 = 1;
        int col2 = 2;

        System.out.println(Arrays.toString(placeBoat(board2, direction, boatLength, row2, col2)));
        //

        String[][] words = new String[][]{
            {"cat","dead"},
            {"giraffe","igloooooo"},
            {"mopingaround","zylaphoneeeeess"}
        };
        inOrder(words);
    }
}
