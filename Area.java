import java.util.Scanner;
import java.util.List;

public class Area {
    private int width;
    private int length;
    private int floor;
    private int[] position;
    private int[] spawnTile1 = {0,1}, spawnTile2 = {2,1}, 
                  spawnTile3 = {3,1}, spawnTile4 = {0,3}, spawnTile5 = {2,3}, spawnTile6 = {3,3}, spawnTile7 = {4,3}, spawnTile8 = {6,3}, spawnTile9 = {2,5}, spawnTile10 = {4,5};
    private int[] doorTile1 = {1,0}, doorTile2 = {3, 6}, doorTile3 = {3, 0}, doorTile4 = {2, 6};
    private int[] fastTile1 = {1,6}, fastTile2 = {2,0};
    private int[] bossTile1 = {2, 3};
    

    public Area(int width, int length, int startX, int startY, int floor){
        this.width = width;
        this.length = length;
        this.position = new int[]{startX, startY};
        this.floor = floor;
    }

    public void displayArea(){
        if(floor == 1){
            for (int collumn = 0; collumn < length; collumn++){
                for (int rows = 0; rows < width; rows++){
                    if(collumn == position[1] && rows == position[0]){
                        System.out.print(" P ");
                    }
                    else if((collumn == spawnTile1[1] && rows == spawnTile1[0]) || (collumn == spawnTile2[1] && rows == spawnTile2[0])){
                        System.out.print(" ? ");
                    }
                    else if(collumn == doorTile1[1] && rows == doorTile1[0]){
                        System.out.print(" D ");
                    }
                    else if(collumn == fastTile1[1] && rows == fastTile1[0]){
                        System.out.print(" F ");
                    }
                    else {
                        System.out.print(" - ");
                    }
                }
                System.out.println();
            }
        }
        
        else if(floor == 2){
            for (int collumn = 0; collumn < length; collumn++){
                for (int rows = 0; rows < width; rows++){
                    if(collumn == position[1] && rows == position[0]){
                        System.out.print(" P ");
                    }
                    else if((collumn == spawnTile3[1] && rows == spawnTile3[0]) || (collumn == spawnTile4[1] && rows == spawnTile4[0]) || (collumn == spawnTile5[1] && rows == spawnTile5[0]) || (collumn == spawnTile6[1] && rows == spawnTile6[0]) || (collumn == spawnTile7[1] && rows == spawnTile7[0]) || (collumn == spawnTile8[1] && rows == spawnTile8[0]) || (collumn == spawnTile9[1] && rows == spawnTile9[0]) || (collumn == spawnTile10[1] && rows == spawnTile10[0])){
                        System.out.print(" ? ");
                    }
                    else if((collumn == doorTile2[1] && rows == doorTile2[0]) || (collumn == doorTile3[1] && rows == doorTile3[0])){
                        System.out.print(" D ");
                    }
                    else {
                        System.out.print(" - ");
                    }
                }
                System.out.println();
            }
        }

        else if(floor == 3){
            for (int collumn = 0; collumn < length; collumn++){
                for (int rows = 0; rows < width; rows++){
                    if(collumn == position[1] && rows == position[0]){
                        System.out.print(" P ");
                    }
                    else if((collumn == bossTile1[1] && rows == bossTile1[0])){
                        System.out.print(" B ");
                    }
                    else if(collumn == doorTile4[1] && rows == doorTile4[0]){
                        System.out.print(" D ");
                    }
                    else if(collumn == fastTile2[1] && rows == fastTile2[0]){
                        System.out.print(" F ");
                    }
                    else {
                        System.out.print(" - ");
                    }
                }
                System.out.println();
            }
        }
    }

    public boolean isDoor(){
        int collumn = position[1];
        int rows = position[0];
        if(collumn == doorTile1[1] && rows == doorTile1[0]){
            return true;
        }
        else{
            return false;
        }
    }

    public void move(String move){
        int collumn = position[1];
        int row = position[0];

        if(move.equals("UP")){
            collumn -= 1;
        }
        else if(move.equals("DOWN")){
            collumn += 1;
        }
        else if(move.equals("LEFT")){
            row -= 1;
        }
        else if(move.equals("RIGHT")){
            row += 1;
        }

        if(row >= 0 && row < width && collumn >= 0 && collumn < length){
            position[1] = collumn;
            position[0] = row;
        }
    }
}