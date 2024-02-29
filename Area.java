import java.util.Scanner;
import java.util.List;

public class Area {
    private int width;
    private int length;
    private int[] position;
    private int[] spawnTile1, spawnTile2, doorTile1;
    

    public Area(int width, int length, int startX, int startY, int spawn1X, int spawn1Y, int spawn2X, int spawn2Y, int door1X, int door2Y){
        this.width = width;
        this.length = length;
        this.position = new int[]{startX, startY};
        this.spawnTile1 = new int[]{spawn1X, spawn1Y};
        this.spawnTile2 = new int[]{spawn2X, spawn2Y};
        this.doorTile1 = new int[]{door1X, door2Y};

    }

    public void displayArea(){
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
                else {
                    System.out.print(" X ");
                }
            }
            System.out.println();
        }
    }

    public boolean isDoor(){
        int collumn = position[1];
        int row = position[0];
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