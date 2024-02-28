import java.util.Scanner;

public class GameLobby {
    private Character player;
    private Scanner scanner;
    private int currentAreaIndex;

    public GameLobby(Character player) {
        this.player = player;
        this.scanner = new Scanner(System.in);
        this.currentAreaIndex = 1;
    }

    public void displayLobby() {
        Scanner scanner = new Scanner(System.in);

        int choice;

        while (true) {
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
        }
    }

    private void handleFastTravel() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nYOU HAVE CHOSEN: FAST TRAVEL\n");

        // Display available areas
        System.out.println("AREA LIST:");
        System.out.println("1. Stormveil Castle");
        System.out.println("2. Raya Lucaria Academy");
        System.out.println("3. The Elden Throne " + (isAreaLocked(3) ? "[LOCKED]" : ""));

        System.out.print("CHOOSE AN AREA: ");
        int chosenArea = scanner.nextInt();

        if (isValidArea(chosenArea)) {
            currentAreaIndex = chosenArea;
            System.out.println("You have successfully fast-traveled to Area " + chosenArea);
        } else {
            System.out.println("Invalid area selection");
        }
    }

    private boolean isValidArea(int areaIndex) {
        return areaIndex >= 1 && areaIndex <= 3 && !isAreaLocked(areaIndex);
    }

    private boolean isAreaLocked(int areaIndex) {
        return areaIndex == 3 && player.getLevel() < 10;
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
