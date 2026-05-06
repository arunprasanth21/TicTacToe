public class TicTacToe {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        // Test: fill top row with X
        board[0][0] = 'X'; board[0][1] = 'X'; board[0][2] = 'X';
        System.out.println(hasWon('X')); // true
    }

    // Check all rows, columns, and diagonals for a winning pattern
    static boolean hasWon(char symbol) {
        for (int i = 0; i < 3; i++) {
            // check row i
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol)
                return true;
            // check column i
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)
                return true;
        }
        // check main diagonal
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)
            return true;
        // check anti diagonal
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)
            return true;

        return false;
    }
}
