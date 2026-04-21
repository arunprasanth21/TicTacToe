import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    // Read and return a slot number from the user
    static int getUserSlot() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter slot (1-9): ");
        return sc.nextInt();
    }
}
