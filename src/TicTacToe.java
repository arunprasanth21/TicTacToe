public class TicTacToe {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        placeMove(0, 0, 'X');
        System.out.println(board[0][0]);
    }

    // Place the symbol on the board at the given position
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
}
