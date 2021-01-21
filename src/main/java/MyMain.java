import java.nio.charset.StandardCharsets;

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
        boolean tf = true;

        int[] lenWords = new int[words.length * words[0].length];
        int[] letters = new int[words.length * words[0].length];

        int count = 0;
        for (int i = 0; i < words.length; i++){
            for (int j = 0; j < words[0].length; j++){
                lenWords[count] = words[i][j].length();
                char lett = words[i][j].charAt(0);
                int value = (int) lett;
                letters[count] = value;
                count++;
            }
        }
        for (int i = 0; i < lenWords.length; i++){
            for (int j = 0; j < lenWords.length; j++){
                if (lenWords[i] > lenWords[j]){
                    tf = false;
                    //break;
                }
            }
        }
        for (int i = 0; i < letters.length; i++){
            for (int j = 0; j < letters.length; j++){
                if (letters[i] > letters[j]){
                    tf = false;
                    //break;
                }
            }
        }
        return tf;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
