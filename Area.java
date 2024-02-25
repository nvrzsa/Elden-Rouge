public class Area {
    private int width;
    private int length;
    private int[] position;

    public Area(int width, int length){
        this.width = width;
        this.length = length;
        this.position = new int[]{0,0};
    }

    public void displayArea(){
        for (int collumn = 0; collumn < length; collumn++){
            for (int rows = 0; rows < width; rows++){
                if(collumn == position[1] && rows == position[0]){
                    System.out.print(" P ");
                }
                else {
                    System.out.print(" X ");
                }
            }
            System.out.println();
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