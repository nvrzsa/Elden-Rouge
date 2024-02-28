import java.util.Scanner;

public class GameLobby {
    private Character player;
    private Scanner scanner;

    public GameLobby(Character player) {
        this.player = player;
        this.scanner = new Scanner(System.in);
    }

    public void displayLobby() {
        int choice;

        do {
            player.displayStats();
            System.out.println("\n[1] FAST TRAVEL \n[2] LEVEL UP \n[3] INVENTORY \n[4] SHOP \n[5] QUIT GAME\n");
            System.out.print("Choose an Option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    handleFastTravel();
                    break;
                case 2:
                    handleLevelUp();
                    break;
                case 3:
                    handleInventory();
                    break;
                case 4:
                    handleShop();
                    break;
                case 5:
                    // Quit the game
                    System.out.println("Exiting the game lobby.");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 5);
    }

    private void handleFastTravel() {
        System.out.println("Handling FAST TRAVEL...");
    }

    private void handleLevelUp() {
        System.out.println("Handling LEVEL UP...");
    }

    private void handleInventory() {
        System.out.println("Handling INVENTORY...");
    }

    private void handleShop() {
        System.out.println("Handling SHOP...");
    }
}
