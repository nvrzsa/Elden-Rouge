import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        int choice, choice2;
        Area f1 = new Area(3, 8);
        Character player = new Character("", "", 0, 0, 0, 0, 0, 0, 0);
        String playerName, jobClass;

        do {
            System.out.println("\nWELCOME TO ELDEN ROUGE\n");
            System.out.println("[1] START \n[2] EXIT\n");
            System.out.print("Choose an Option: ");
            choice = sc.nextInt();

            if (choice == 1) {
                do {
                    player.displayStats();
                    System.out.println("\n[1] INPUT NAME \n[2] SELECT JOB CLASS \n[3] CONFIRM \n[4] BACK");

                    System.out.print("\nChoose an Option: ");
                    choice2 = sc.nextInt();

                    switch (choice2) {
                        case 1:
                            System.out.println("Name(Minimum length of 1, Maximum length of 25): ");
                            playerName = sn.nextLine();

                            if (playerName.length() < 1){
                                System.out.println("Error, name must have minimum lenngth of 1");
                            }
                            else if (playerName.length() > 25){
                                playerName = playerName.substring(0, 25);
                                player.setName(playerName);
                            }
                            else{
                                player.setName(playerName);
                            }

                            break;
                        case 2:
                            System.out.println("Select Job Class: \nVagabond \nSamurai \nWarrior \nHero \nAstrologer \nProphet");
                            System.out.print("Choice: ");
                            jobClass = sn.nextLine();

                            player.setClass(jobClass);

                            break;
                        case 3:
                            GameLobby gameLobby = new GameLobby(player);
                            gameLobby.displayLobby();
        
                            break;
                        case 4:
                            break; // Will go back to the outer loop
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                } while (choice2 != 4);
            } 
            
            else if (choice != 2) {
                System.out.println("Invalid choice");
            }

        } while (choice != 2);
        System.out.println("Thank you for playing");
    }
}
