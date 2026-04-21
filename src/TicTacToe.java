public class TicTacToe {

    public static void main(String[] args) {
        int slot = 7;
        System.out.println("Row: " + getRowFromSlot(slot));
        System.out.println("Column: " + getColFromSlot(slot));
    }

    // Row = (slot-1) / 3  →  slots 1-3 → row 0, 4-6 → row 1, 7-9 → row 2
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    // Col = (slot-1) % 3  →  slots 1,4,7 → col 0, 2,5,8 → col 1, 3,6,9 → col 2
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
}
