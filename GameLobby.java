import java.util.Scanner;

public class GameLobby {
    private Character player;
    private Scanner scanner;
    private int currentAreaIndex;
    private Area currentArea;

    private Area f1;
    private Area f2;
    private Area f3;

    public GameLobby(Character player, Area f1, Area f2, Area f3) {
        this.player = player;
        this.scanner = new Scanner(System.in);
        this.currentAreaIndex = 1;
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;
    }

    public void displayLobby() {
        Scanner scanner = new Scanner(System.in);

        int choice;

        while (true) {
            player.displayStats();
            System.out.println("\n[1] FAST TRAVEL \n[2] LEVEL UP \n[3] INVENTORY \n[4] SHOP \n[5] QUIT GAME\n");
            System.out.print("CHOOSE AN OPTION: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    FastTravel();
                    break;
                case 2:
                    LevelUp();
                    break;
                case 3:
                    Inventory();
                    break;
                case 4:
                    Shop();
                    break;
                case 5:
                    // Quit the game
                    System.out.println("EXITING THE GAME LOBBY");
                    break;
                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }
        }
    }

    private void FastTravel() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nYOU HAVE CHOSEN: FAST TRAVEL\n");

        // Display available areas
        System.out.println("AREA LIST:\n");
        System.out.println("[1] STORMVEIL CASTLE");
        System.out.println("[2] RAYA LUCARIA ACADEMY");
        System.out.println("[3] THE ELDEN THRONE " + (isAreaLocked(3) ? "[LOCKED]" : ""));

        System.out.print("\nCHOOSE AN AREA: ");
        int chosenArea = scanner.nextInt();

        if (isValidArea(chosenArea)) {
            currentAreaIndex = chosenArea;
            System.out.println("\nYOU HAVE SUCCESSFULLY FAST-TRAVELLED TO AREA \n" + chosenArea);

            System.out.println("AVAILABLE FLOORS:\n");
            System.out.println("[1] F1");
            System.out.println("[2] F2");
            System.out.println("[3] F3");

            System.out.print("\nCHOOSE A FLOOR: ");
            int chosenSubArea = scanner.nextInt();

            switch (chosenSubArea) {
                case 1:
                    currentArea = f1;
                    break;
                case 2:
                    currentArea = f2;
                    break;
                case 3:
                    currentArea = f3;
                    break;
                default:
                    System.out.println("Invalid sub-area choice");
                    return;
            }
        
            currentArea.displayArea();
        } else {
            System.out.println("\nINVALID AREA SELECTION! ");
        }

        while (true) {
            System.out.println("OPTIONS: [W] UP, [S] DOWN, [A] LEFT, [D] RIGHT, [E] BACK\n");
            System.out.print("CHOOSE AN OPTION: ");
            String moveOption = scanner.next().toUpperCase();

            if (moveOption.equals("E")) {
                break;
            }

            currentArea.move(moveOption);
            currentArea.displayArea();
        }
        
    }

    private boolean isValidArea(int areaIndex) {
        return areaIndex >= 1 && areaIndex <= 3 && !isAreaLocked(areaIndex);
    }

    private boolean isAreaLocked(int areaIndex) {
        return areaIndex == 3 && player.getLevel() < 10;
    }

    private void LevelUp() {
        System.out.println("LEVEL UP!");
    }

    private void Inventory() {
        System.out.println("INVENTORY COMING SOON!");
    }

    private void Shop() {
        System.out.println("SHOP COMING SOON!");
    }
}
