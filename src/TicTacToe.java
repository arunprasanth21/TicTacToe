import java.util.Random;

public class TicTacToe {

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };
    static char computerSymbol = 'O';

    public static void main(String[] args) {
        computerMove();
    }

    // Keep picking random slots until a valid empty cell is found
    static void computerMove() {
        Random rand = new Random();
        int row, col;

        do {
            int slot = rand.nextInt(9) + 1; // random slot 1-9
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;
        } while (board[row][col] != '-'); // repeat if cell is taken

        board[row][col] = computerSymbol;
        System.out.println("Computer placed at row: " + row + ", col: " + col);
    }
}
