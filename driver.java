/**
 * The main driver class for the Elden Rouge game.
 * The driver class handles the game initialization and player setup.
 */

import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);

        int choice, choice2;

        boolean check1 = false, check2 = false;

        Area f1 = new Area(3, 7, 1, 6, 1);
        Area f2 = new Area(7, 7, 3, 6, 2);
        Area f3 = new Area(5, 7, 2, 6, 3);

        Character player = new Character("", "", 0, 0, 0, 0, 0, 0, 0);
        String playerName, jobClass;

        do {
            System.out.println("\nWELCOME TO ELDEN ROUGE\n");
            System.out.println("[1] START \n[2] EXIT\n");
            System.out.print("CHOOSE AN OPTION: ");
            choice = sc.nextInt();

            if (choice == 1) {
                do {
                    player.displayStats();
                    System.out.println("\n[1] INPUT NAME \n[2] SELECT JOB CLASS \n[3] CONFIRM \n[4] BACK");

                    System.out.print("\nCHOOSE AN OPTION: ");
                    choice2 = sc.nextInt();

                    switch (choice2) {
                        case 1:
                            System.out.print("\nNAME (Minimum length of 1, Maximum length of 25): ");
                            playerName = sn.nextLine();

                            if (playerName.length() < 1) {
                                System.out.println("ERROR, name must have minimum length of 1");
                            }
                            else if (playerName.length() > 25){
                                playerName = playerName.substring(0, 25);
                                player.setName(playerName);
                                check1 = true;
                            }
                            else{
                                player.setName(playerName);
                                check1 = true;
                            }

                            break;
                        case 2:
                            System.out.println("JOB CLASSES: \n[1] Vagabond \n[2] Samurai \n[3] Warrior \n[4] Hero \n[5] Astrologer \n[6] Prophet");
                            System.out.print("SELECT JOB CLASS!: ");
                            jobClass = sn.nextLine();

                            if(player.setClass(jobClass) == true){
                                check2 = true;
                            }
                            break;
                        case 3:
                            if(check1 == true && check2 == true){
                                GameLobby gameLobby = new GameLobby(player, f1, f2, f3);
                                gameLobby.displayLobby();
                            }
                            
        
                            break;
                        case 4:
                            break; // Will go back to the outer loop
                        default:
                            System.out.println("INVALID CHOICE");
                            break;
                    }
                } while (choice2 != 4);
            } 
            
            else if (choice != 2) {
                System.out.println("INVALID CHOICE!");
            }

        } while (choice != 2);
        System.out.println("THANK YOU FOR PLAYING!");
    }
}
