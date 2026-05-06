public class TicTacToe {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {
        while (!gameOver) {
            if (isHumanTurn) {
                humanTurn();
            } else {
                computerTurn();
            }
            isHumanTurn = !isHumanTurn; // switch turn
        }
    }

    // Placeholder for human move logic
    static void humanTurn() {
        System.out.println("Human's turn");
        gameOver = true; // remove this when real logic is added
    }

    // Placeholder for computer move logic
    static void computerTurn() {
        System.out.println("Computer's turn");
        gameOver = true; // remove this when real logic is added
    }
}
