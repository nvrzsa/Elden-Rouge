import java.util.Scanner;

/**
 * The GameLobby class represents the lobby where the player 
 * can navigate and interact with different game features.
 */

public class GameLobby {
    private Character player;
    private Scanner scanner;
    private int currentAreaIndex;
    private int floorNumber = 1;

    private Area f1;
    private Area f2;
    private Area f3;

    /**
     * Constructs a GameLobby object.
     *
     * @param player The player character.
     * @param f1     The first floor of Area 1.
     * @param f2     The second floor of Area 1.
     * @param f3     The third floor of Area 1.
     */

    public GameLobby(Character player, Area f1, Area f2, Area f3) {
        this.player = player;
        this.scanner = new Scanner(System.in);
        this.currentAreaIndex = 1;
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;
    }

    /**
     * Displays the main lobby menu and handles player choices.
     */

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

    /**
     * Initiates the Fast Travel feature, allowing the player to move between areas and floors.
     */

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

            switch (floorNumber){
                case 1:
                    f1.displayArea();
                    break;
                case 2:
                    f2.displayArea();
                    break;
                case 3:
                    f3.displayArea();
                    break;
            }
        } else {
            System.out.println("\nINVALID AREA SELECTION! ");
        }

        while (true) {
            System.out.println("OPTIONS: [W] UP, [S] DOWN, [A] LEFT, [D] RIGHT, [E] BACK\n");
            System.out.print("CHOOSE AN OPTION: ");
            String moveOption = scanner.next().toUpperCase();

            if (moveOption.equals("E")) {
                boolean hasFastTravel = f1.isFastTravel() || f2.isFastTravel() || f3.isFastTravel();
                if(hasFastTravel){
                    break;
                }
                else {
                    System.out.println("FAST TRAVEL TILE NEEDED IN ORDER TO GO BACK!");
                }
            }

            switch (floorNumber){
                case 1:
                    f1.move(moveOption);
                    f1.displayArea();
                    if(f1.isDoor() == 2){
                        floorNumber = 2;
                    }
                    break;
                case 2:
                    f2.move(moveOption);
                    f2.displayArea();
                    if(f2.isDoor() == 1){
                        floorNumber = 1;
                    }
                    else if(f2.isDoor() == 3){
                        floorNumber = 3;
                    }
                    break;
                case 3:
                    f3.move(moveOption);
                    f3.displayArea();
                    if(f3.isDoor() == 2){
                        floorNumber = 2;
                    }
                    break;
            }   
        } 
    }

    /**
     * Checks if the chosen area index is valid and not locked.
     *
     * @param areaIndex The index of the chosen area.
     * @return True if the area is valid and not locked, false otherwise.
     */

    private boolean isValidArea(int areaIndex) {
        return areaIndex >= 1 && areaIndex <= 3 && !isAreaLocked(areaIndex);
    }

    /**
     * Checks if an area is locked.
     *
     * @param areaIndex The index of the area to check.
     * @return True if the area is locked, false otherwise.
     */

    private boolean isAreaLocked(int areaIndex) {
        return areaIndex == 3 && player.getLevel() < 10;
    }

    /**
     * Initiates the level-up feature.
     */

    private void LevelUp() {
        System.out.println("LEVEL UP COMING SOON!");
    }

    /**
     * Initiates the inventory feature.
     */

    private void Inventory() {
        System.out.println("INVENTORY COMING SOON!");
    }

    /**
     * Initiates the shop feature.
     */

    private void Shop() {
        System.out.println("SHOP COMING SOON!");
    }
}
